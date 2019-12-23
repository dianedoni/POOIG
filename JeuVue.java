<<<<<<< HEAD
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


=======
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



    public JeuVue(){
	this.etat = ETAT.JEU;
	
    }
}


>>>>>>> 295cb416269d035911207f7707e94ee316839d87
