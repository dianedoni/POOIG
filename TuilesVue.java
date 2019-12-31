import java.awt.*;
import javax.swing.*;
public class TuilesVue{
    protected String couleur;
    protected int posX,posY;
    protected Image imgt;
    protected JButton bouton;
    protected ImageIcon icot;
    protected static int nb_max_tuiles = 100;

    

    public TuilesVue(String c, int x, int y){
	this.posX = x;
	this.posY = y;

	if(nb_max_tuiles >0){	
	    nb_max_tuiles -=1;

	    if(c.equals("blanc")){
		this.icot = new ImageIcon(getClass().getResource("Image/Blanc.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }

	    else if(c.equals("bleu")){
		this.icot = new ImageIcon(getClass().getResource("Image/Bleu.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }

	    else if(c.equals("jaune")){
		this.icot = new ImageIcon(getClass().getResource("Image/Jaune.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }

	    else if(c.equals("noir")){
		this.icot = new ImageIcon(getClass().getResource("Image/Noir.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }

	    else if(c.equals("rouge")){
		this.icot = new ImageIcon(getClass().getResource("Image/Rouge.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }

	    else if(c.equals("vide")){
		this.icot = new ImageIcon(getClass().getResource("Image/Vide.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }

	    else if(c.equals("first")){
		this.icot = new ImageIcon(getClass().getResource("Image/First.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }
	}
    }


    

    public TuilesVue(String c){
	if(nb_max_tuiles >0){	
	    nb_max_tuiles -=1;
	    if(c.equals("blanc")){
		this.icot = new ImageIcon(getClass().getResource("Image/Blanc.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }

	    else if(c.equals("bleu")){
		this.icot = new ImageIcon(getClass().getResource("Image/Bleu.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }

	    else if(c.equals("jaune")){
		this.icot = new ImageIcon(getClass().getResource("Image/Jaune.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }

	    else if(c.equals("noir")){
		this.icot = new ImageIcon(getClass().getResource("Image/Noir.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }

	    else if(c.equals("rouge")){
		this.icot = new ImageIcon(getClass().getResource("Image/Rouge.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }

	    else if(c.equals("vide")){
		this.icot = new ImageIcon(getClass().getResource("Image/Vide.png"));
		this.bouton = new JButton(icot);
		this.imgt = this.icot.getImage();
	    }
	}
    }

    
    //Affiche tuile
    public void afficheTuile(Graphics g){
	g.drawImage(this.imgt,this.posX,this.posY,null);
    }

}
