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
    protected static LinkedList<PlayerVue> joueurs;
    protected LinkedList<FabriquesVue> fabriques;
    protected CentreDeTableVue centre;
    protected static int nb_joueurs;





    public JeuVue(){

	this.etat = ETAT.JEU;
	this.vue = new Vue();

	this.joueurs = new LinkedList<PlayerVue>();
	this.joueurs.add(new PlayerVue("Lamia"));

	this.fabriques = new LinkedList<FabriquesVue>();
	this.fabriques = nbFabriques(nb_fabriques());

	this.centre = new CentreDeTableVue();
	
	JButton rejouer = new JButton("Rejouer");
	rejouer.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent clic){

		    if(clic.getSource() == rejouer){
			replay();
		    }
		}
		
	    });
	this.add(rejouer);


	JButton quitter = new JButton("Quitter");
	quitter.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent clic){

		    if(clic.getSource() == quitter){
			System.exit(0);
		    }
		}
		
	    });
	this.add(quitter);
    }

    

    public void paintComponent(Graphics g){
	if(etat == etat.JEU){
	    for(int i = 0;i<fabriques.size();i++){
		this.fabriques.get(i).afficheFabrique(g);
		}
	    this.joueurs.get(0).affichePlayer(g);
	    this.centre.afficheCentre(g);

	    
	    if(this.gagne()){
		this.etat = etat.GAGNE;
		Jeu.fenetre.dispose();
		Jeu.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jeu.fenetre.setSize(1600,800);
		Jeu.fenetre.setResizable(true);
		Jeu.fenetre.setLocationRelativeTo(null);
		Jeu.fenetre.setContentPane(new Vue());
		Jeu.fenetre.repaint();
		Jeu.fenetre.revalidate();
		Jeu.fenetre.setVisible(true);
	    }
	}
    }



    public void replay(){
	Jeu.jeu = new JeuVue();
	this.etat = etat.JEU;
	Jeu.fenetre.dispose();
	Jeu.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Jeu.fenetre.setSize(1600,800);
	Jeu.fenetre.setResizable(true);
	Jeu.fenetre.setLocationRelativeTo(null);
	Jeu.fenetre.setContentPane(new JeuVue());
	Jeu.fenetre.repaint();
	Jeu.fenetre.revalidate();
	Jeu.fenetre.setVisible(true);
    }
    
    
    public boolean gagne(){
	return false;
    }

    public int nb_fabriques(){
	int nb = 0;
	if(nb_joueurs == 2){
	    nb = 5;
	}else if(nb_joueurs == 3){
	    nb = 7;
	}else if(nb_joueurs == 4){
	    nb = 9;
	}
	return nb;
    }
    

    public LinkedList<FabriquesVue>  nbFabriques(int n){
	int posX=0;
	    int posY =0;
	if(nb_joueurs == 2){
	posX = 300;
	posY = 40;
	}else if(nb_joueurs == 3){
	posX = 100;
	posY = 40;
	}else if(nb_joueurs == 4){
	posX = 30;
	posY = 40;
	}
	LinkedList<FabriquesVue> liste = new LinkedList<FabriquesVue> ();
	for(int i = 0;i<n;i++){
	    liste.add(new FabriquesVue(posX,posY));
	    posX += 200;
	}
	return liste;
    }

    
}


