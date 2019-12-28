import java.awt.*;
import javax.swing.*;
import java.util.*;
public class FabriquesVue{
    protected LinkedList<TuilesVue> fabrique1;
    protected Image imgf;
    protected ImageIcon icof;

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
