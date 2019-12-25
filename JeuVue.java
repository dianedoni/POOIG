import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class JeuVue extends JPanel{

    protected Vue vue;
    protected static enum ETAT{
	MENU,
	JEU,
	PERDU,
	GAGNE
    };
    protected static ETAT etat = ETAT.MENU;
    protected TuilesVue tuile;
    protected LinkedList<PlayerVue> joueurs;
    protected FabriquesVue fabriques;
    protected DefausseVue defausse;
    protected CentreDeTableVue centre;




    public JeuVue(){
	this.etat = ETAT.JEU;
	this.vue = new Vue();
	this.joueurs = new LinkedList<PlayerVue>();
	this.fabriques = new FabriquesVue();
	this.defausse = new DefausseVue();
	this.centre = new CentreDeTableVue();
    }

    public void paintComponent(Graphics g){
	joueursInfo();
	if(etat == etat.JEU){
	    if(this.gagne()){
		this.etat = etat.GAGNE;
		Jeu.fenetre.dispose();
		Jeu.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jeu.fenetre.setSize(800,800);
		Jeu.fenetre.setResizable(true);
		Jeu.fenetre.setLocationRelativeTo(null);
		Jeu.fenetre.setContentPane(new Vue());
		Jeu.fenetre.repaint();
		Jeu.fenetre.revalidate();
		Jeu.fenetre.setVisible(true);
	    }else if(this.perdu()){
		this.etat = etat.PERDU;
		Jeu.fenetre.dispose();
		Jeu.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jeu.fenetre.setSize(800,800);
		Jeu.fenetre.setResizable(true);
		Jeu.fenetre.setLocationRelativeTo(null);
		Jeu.fenetre.setContentPane(new Vue());
		Jeu.fenetre.repaint();
		Jeu.fenetre.revalidate();
		Jeu.fenetre.setVisible(true);
	    }
	}
    }

    public boolean gagne(){
	return true;
    }

    public boolean perdu(){
	return (tuile.nb_max_tuiles <=0);
    }


    public PlayerVue [] joueursInfo(){
	String [] choix_joueurs = {"2","3","4"};
	int choix = JOptionPane.showOptionDialog(null,"Choisissez le nombre de joueurs : ","Azul",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,choix_joueurs,choix_joueurs[0]);
	int nb_joueurs = Integer.parseInt(choix_joueurs[choix]);
	PlayerVue [] joueurs = new PlayerVue[nb_joueurs];
	for(int i = 0; i<joueurs.length;i++){
	    int cpt = i+1;
	    String nom = JOptionPane.showInputDialog("Veuillez saisir le nom du joueur "+ cpt);
	    if(!nom.isEmpty()){
		joueurs[i] = new PlayerVue(nom.toUpperCase());
	    }else{
		i-=1;
	    }
	}
	return joueurs;
    }

    public void creerPanelJoueur(){
	LinkedList<PlayerVue> joueur = new LinkedList<PlayerVue>() ;
    }
}


