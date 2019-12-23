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
}


