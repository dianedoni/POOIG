import java.awt.*;
import javax.swing.*;
import java.util.*;
public class FabriquesVue extends JPanel{
    protected LinkedList<TuilesVue> fabrique1;
    protected Image imgf;
    protected ImageIcon icof;
    protected int posX,posY = 10;

    public FabriquesVue(){
	this.icof = new ImageIcon(getClass().getResource("Image/Fabriques.png"));
	this.imgf = this.icof.getImage();
	this.fabrique1 = new LinkedList<TuilesVue>();
	this.fabrique1 = fabrique(fabrique1);
	modifiePlace(this.fabrique1);
    }


    public FabriquesVue(int x, int y){
	this.posX = x;
	this.posY = y;
	this.icof = new ImageIcon(getClass().getResource("Image/Fabriques.png"));
	this.imgf = this.icof.getImage();
	this.fabrique1 = new LinkedList<TuilesVue>();
	this.fabrique1 = fabrique(fabrique1);
	modifiePlace(this.fabrique1);
    }
    
    //Remplis la fabrique de tuiles
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
    
    //Mets les tuiles a la bonne position
    public void modifiePlace(LinkedList<TuilesVue> liste){
	liste.get(0).posX = this.posX + 20;
	liste.get(0).posY = this.posY + 20;

	liste.get(1).posX = this.posX + 80;
	liste.get(1).posY = this.posY + 20;

	liste.get(2).posX = this.posX + 20;
	liste.get(2).posY = this.posY + 80;

	liste.get(3).posX = this. posX + 80;
	liste.get(3).posY = this. posX + 80;

	
    }

    //Affiche la fabrique
    public void afficheFabrique(Graphics g){
	g.drawImage(this.imgf,this.posX,this.posY,null);
	for(int i = 0; i<fabrique1.size();i++){
	    fabrique1.get(i).afficheTuile(g);
	}
    }
    
}
