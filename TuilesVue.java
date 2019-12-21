import java.awt.*;
import javax.swing.*;
public class TuilesVue{
    protected String couleur;
    protected Image imgt;
    protected ImageIcon icot;

    public TuilesVue(String c){
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
	}else if(c.equals("Rouge")){
	    this.icot = new ImageIcon(getClass().getResource("Image/Rouge.png"));
	    this.imgt = this.icot.getImage();
	}
    }
}
