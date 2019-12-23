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
    protected LinkedList<TuilesVue> tuiles;
    protected LinkedList<PlayerVue> joueurs;




    public JeuVue(){
	this.etat = ETAT.JEU;
	
    }

    public void gagne(){

    }

    public void perdu(){

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
	    }
	}
    }
}


