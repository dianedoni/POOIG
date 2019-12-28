import java.util.*;
public class MurVue{
    protected LinkedList<TuilesVue> tuilesposees1, tuilesposees2,tuilesposees3,tuilesposees4,tuilesposees5;
    protected LignesMotifVue ligneMotif;

    public MurVue(){
	this.tuilesposees1 = new LinkedList<TuilesVue>();
	this.tuilesposees2 = new LinkedList<TuilesVue>();
	this.tuilesposees3 = new LinkedList<TuilesVue>();
	this.tuilesposees4 = new LinkedList<TuilesVue>();
	this.tuilesposees5 = new LinkedList<TuilesVue>();
    }


    public void murTuile1(TuilesVue tuile){
	if(tuilesposees1.size() == 0 || tuilesposees1.size()<5 ){
	    tuilesposees1.add(tuile);
	    ligneMotif.ligne1.clear();
	    System.out.println("Tuile ajoute a la ligne 1 du mur");
	}else{
	    System.out.println("La ligne 1 du mur est pleine !");
	}
    }



    
    public void murTuile2(TuilesVue tuile){
	if(tuilesposees2.size() == 0 || tuilesposees2.size()<5 ){
	    tuilesposees2.add(tuile);
	    ligneMotif.ligne2.clear();
	    System.out.println("Tuile ajoute a la ligne 2 du mur");
	}else{
	    System.out.println("La ligne 2 du mur est pleine !");
	}
    }


    
    public void murTuile3(TuilesVue tuile){
	if(tuilesposees3.size() == 0 || tuilesposees3.size()<5 ){
	    tuilesposees3.add(tuile);
	    ligneMotif.ligne3.clear();
	    System.out.println("Tuile ajoute a la ligne 3 du mur");
	}else{
	    System.out.println("La ligne 3 du mur est pleine !");
	}
    }

    
    public void murTuile4(TuilesVue tuile){
	if(tuilesposees4.size() == 0 || tuilesposees4.size()<5 ){
	    tuilesposees4.add(tuile);
	    ligneMotif.ligne4.clear();
	    System.out.println("Tuile ajoute a la ligne 4 du mur");
	}else{
	    System.out.println("La ligne 4 du mur est pleine !");
	}
    }


    
    public void murTuile5(TuilesVue tuile){
	if(tuilesposees5.size() == 0 || tuilesposees5.size()<5 ){
	    tuilesposees5.add(tuile);
	    ligneMotif.ligne5.clear();
	    System.out.println("Tuile ajoute a la ligne 5 du mur");
	}else{
	    System.out.println("La ligne 5 du mur est pleine !");
	}
    }
    
}
