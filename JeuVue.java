import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
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




    public JeuVue(){
	this.etat = ETAT.JEU;
	
    }
}


