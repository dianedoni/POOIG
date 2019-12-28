import java.util.*;
public class MurVue{
    protected LinkedList<TuilesVue> tuilesposees1, tuilesposees2,tuilesposees3,tuilesposees4,tuilesposees5;

    public MurVue(){
	this.tuilesposees1 = new LinkedList<TuilesVue>();
	this.tuilesposees2 = new LinkedList<TuilesVue>();
	this.tuilesposees3 = new LinkedList<TuilesVue>();
	this.tuilesposees4 = new LinkedList<TuilesVue>();
	this.tuilesposees5 = new LinkedList<TuilesVue>();
    }


    public void murTuile1(TuilesVue tuile){
	if(tuilesposees1.size() == 0){
	    tuilesposees1.add(tuile);
	    System.out.println("Tuile ajoute a la ligne 1 du mur");
	}else if(tuilesposees1.size()>0){
	    boolean b = true; 
	    for(int i = 0;i<tuilesposees1.size();i++){
		if(tuile.couleur.equals(tuilesposees1.get(i).couleur)){
		    b = false;
		}
	    }
	    if(b){
		tuilesposees1.add(tuile);
	    }
	}else{
	    System.out.println("La ligne 1 du mur est pleine !");
	}
    }
    
}
