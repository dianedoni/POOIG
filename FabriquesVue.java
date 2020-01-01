import java.awt.*;
import javax.swing.*;
import java.util.*;
public class FabriquesVue extends JPanel{
    protected LinkedList<TuilesVue> fabrique1;
    protected Image imgf;
    protected ImageIcon icof;
    protected int posX,posY;

    public FabriquesVue(){
	this.icof = new ImageIcon(getClass().getResource("Image/Fabriques.png"));
	this.imgf = this.icof.getImage();
	this.fabrique1 = new LinkedList<TuilesVue>();
	this.fabrique1 = fabrique(fabrique1);
    }


    public LinkedList<TuilesVue> fabrique(LinkedList<TuilesVue> liste){
	int cpt = 0;
	while(cpt < 4 ){
	    Random rand = new Random();
	    int tmp = 1 + rand.nextInt(5-1);
	    if(tmp == 1){
		liste.add(new TuilesVue("blanc",10,10));
	    }else if(tmp == 2){
		liste.add(new TuilesVue("bleu",10,40));
	    }else if(tmp == 3){
		liste.add(new TuilesVue("jaune",30,30));
	    }else if(tmp == 4){
		liste.add(new TuilesVue("noir",30,10));
	    }else if(tmp == 5){
		liste.add(new TuilesVue("rouge",30,20));
	    }
	    cpt +=1;
	}
	return liste;
    }

    public void afficheFabrique(Graphics g){
	g.drawImage(this.imgf,10,10,null);
	for(int i = 0; i<fabrique1.size();i++){
	    fabrique1.get(i).afficheTuile(g);
	}
    }
    
}
