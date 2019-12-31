import java.util.*;
import java.awt.*;
import javax.swing.*;
public class DefausseVue{
    protected LinkedList<TuilesVue> defausse;
    protected int [] rabais = {-1,-1,-2,-2,-2,-3,-3};
    protected Image imgd;
    protected ImageIcon icod;

    public DefausseVue(){
	this.defausse = new LinkedList<TuilesVue>();
	this.icod = new ImageIcon(getClass().getResource("Image/Defausse.png"));
	this.imgd = this.icod.getImage();
    }

    public void afficheDefausse(Graphics g){
	g.drawImage(this.imgd,100,100,null);
	for(int i = 0;i<defausse.size();i++){
	    defausse.get(i).afficheTuile(g);
	}
    }
}
