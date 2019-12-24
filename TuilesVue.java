import java.awt.*;
import javax.swing.*;
public class TuilesVue{
    protected String couleur;
    protected Image imgt;
    protected ImageIcon icot;
    protected int nb_max_tuiles = 100;

    public TuilesVue(String c){
	if(nb_max_tuiles >0){	
	    nb_max_tuiles -=1;
	    if(c.equals("blanc")){
		this.icot = new ImageIcon(getClass().getResource("Image/Blanc.png"));
		this.imgt = this.icot.getImage();
	    }else if(c.equals("bleu")){
		this.icot = new ImageIcon(getClass().getResource("Image/Bleu.png"));
		this.imgt = this.icot.getImage();
	    }else if(c.equals("jaune")){
		this.icot = new ImageIcon(getClass().getResource("Image/Jaune.png"));
		this.imgt = this.icot.getImage();
	    }else if(c.equals("noir")){
		this.icot = new ImageIcon(getClass().getResource("Image/Noir.png"));
		this.imgt = this.icot.getImage();
	    }else if(c.equals("rouge")){
		this.icot = new ImageIcon(getClass().getResource("Image/Rouge.png"));
		this.imgt = this.icot.getImage();
	    }
	}
    }
}
