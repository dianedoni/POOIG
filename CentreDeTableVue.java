import java.util.*;
import java.awt.*;
import javax.swing.*;
public class CentreDeTableVue extends JPanel{
    protected LinkedList<TuilesVue> centre;
    protected Image imgc;
    protected ImageIcon icoc;

    public CentreDeTableVue(){
	this.icoc = new ImageIcon(getClass().getResource("Image/Centre.png"));
	this.imgc = this.icoc.getImage();
	this.centre = new LinkedList<TuilesVue>();
	this.centre.add(new TuilesVue("first",600,300));
    }


    //affiche le centre de la table
    public void afficheCentre(Graphics g){
	g.drawImage(this.imgc, 600,300,null);

	for(int i = 0;i<centre.size();i++){
	    centre.get(i).afficheTuile(g);
	}
    }
}
