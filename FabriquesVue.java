import java.awt.*;
import javax.swing.*;
import java.util.*;
public class FabriquesVue{
    protected LinkedList<TuilesVue> fabrique1,fabrique2,fabrique3,fabrique4,fabrique5,fabrique6,fabrique7,fabrique8,fabrique9;
    protected Image imgf;
    protected ImageIcon icof;

    public FabriquesVue(){
	this.icof = new ImageIcon(getClass().getResource("Image/Fabriques.png"));
	this.imgt = this.icof.getImage();
	this.fabrique1 = new LinkedList<TuilesVue>();
	this.fabrique2 = new LinkedList<TuilesVue>();
	this.fabrique3 = new LinkedList<TuilesVue>();
	this.fabrique4 = new LinkedList<TuilesVue>();
	this.fabrique5 = new LinkedList<TuilesVue>();
	this.fabrique6 = new LinkedList<TuilesVue>();
	this.fabrique7 = new LinkedList<TuilesVue>();
	this.fabrique8 = new LinkedList<TuilesVue>();
	this.fabrique9 = new LinkedList<TuilesVue>();
	this.fabrique1 = fabrique(fabrique1);
	this.fabrique2 = fabrique(fabrique2);
	this.fabrique3 = fabrique(fabrique3);
	this.fabrique4 = fabrique(fabrique4);
	this.fabrique5 = fabrique(fabrique5);
	this.fabrique6 = fabrique(fabrique6);
	this.fabrique7 = fabrique(fabrique7);
	this.fabrique8 = fabrique(fabrique8);
	this.fabrique9 = fabrique(fabrique9);
    }


    public LinkedList<TuilesVue> fabrique(LinkedList<TuilesVue> liste){
	int cpt = 0;
	while(cpt < 4 ){
	    Random rand = new Random();
	    int tmp = 1 + random.nextInt(5-1);
	    if(tmp == 1){
		liste.add(new TuilesVue("blanc"));
	    }else if(tmp == 2){
		liste.add(new TuilesVue("bleu"));
	    }else if(tmp == 3){
		liste.add(new TuilesVue("jaune"));
	    }else if(tmp == 4){
		liste.add(new TuilesVue("noir"));
	    }else if(tmp == 5){
		liste.add(new TuilesVue("rouge"));
	    }
	    cpt +=1;
	}
	return liste;
    }

    
}
