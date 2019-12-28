import java.util.*;
public class LignesMotifVue{
    protected LinkedList<TuilesVue> ligne1,ligne2,ligne3,ligne4,ligne5;
    protected MurVue mur;

    public LignesMotifVue(){
	this.ligne1 = new LinkedList<TuilesVue>();
   	this.ligne2 = new LinkedList<TuilesVue>();
   	this.ligne3 = new LinkedList<TuilesVue>();
   	this.ligne4 = new LinkedList<TuilesVue>();
   	this.ligne5 = new LinkedList<TuilesVue>();
    }

    public boolean ligne1P(){
	return (ligne1.size() == 0);
    }


    public boolean ligne2P(){
	return (ligne2.size()<2);
    }


    public boolean ligne3P(){
	return (ligne3.size()<3);
    }


    public boolean ligne4P(){
	return (ligne4.size()<4);
    }


    public boolean ligne5P(){
	return (ligne5.size()<5);
    }
    
    public void ligne1(TuilesVue tuile, FabriquesVue fabrique){
	if(ligne1P()){
	    boolean b = true;
	    for(int i = 0;i<mur.tuilesposees1.size();i++){
		if(mur.tuilesposees1.get(i).couleur.equals(tuile.couleur)){
		    b = false;
		}
	    }
	    if(b){
		ligne1.add(tuile);
		fabrique.fabrique1.remove(tuile);
		System.out.println("tuile(s) inseree(s) avec succes");
	    }
	}else{
	    System.out.println("Vous ne pouvez pas inserer cette/ces tuile(s)");
	}
    }


    public void ligne2(TuilesVue tuile, FabriquesVue fabrique){
	if(ligne2P()){
	    boolean b = true;
	    for(int i = 0;i<mur.tuilesposees2.size();i++){
		if(mur.tuilesposees2.get(i).couleur.equals(tuile.couleur)){
		    b = false;
		}
	    }
	    if(b){
		ligne2.add(tuile);
		fabrique.fabrique1.remove(tuile);
		System.out.println("tuile(s) inseree(s) avec succes");
	    }
	}else{
	    System.out.println("Vous ne pouvez pas inserer cette/ces tuile(s)");
	}
    }



    public void ligne3(TuilesVue tuile, FabriquesVue fabrique){
	if(ligne3P()){
	    boolean b = true;
	    for(int i = 0;i<mur.tuilesposees3.size();i++){
		if(mur.tuilesposees3.get(i).couleur.equals(tuile.couleur)){
		    b = false;
		}
	    }
	    if(b){
		ligne3.add(tuile);
		fabrique.fabrique1.remove(tuile);
		System.out.println("tuile(s) inseree(s) avec succes");
	    }
	}else{
	    System.out.println("Vous ne pouvez pas inserer cette/ces tuile(s)");
	}
    }
    


    public void ligne4(TuilesVue tuile, FabriquesVue fabrique){
	if(ligne4P()){
	    boolean b = true;
	    for(int i = 0;i<mur.tuilesposees4.size();i++){
		if(mur.tuilesposees4.get(i).couleur.equals(tuile.couleur)){
		    b = false;
		}
	    }
	    if(b){
		ligne4.add(tuile);
		fabrique.fabrique1.remove(tuile);
		System.out.println("tuile(s) inseree(s) avec succes");
	    }
	}else{
	    System.out.println("Vous ne pouvez pas inserer cette/ces tuile(s)");
	}
    }


    public void ligne5(TuilesVue tuile, FabriquesVue fabrique){
	if(ligne5P()){
	    boolean b = true;
	    for(int i = 0;i<mur.tuilesposees5.size();i++){
		if(mur.tuilesposees5.get(i).couleur.equals(tuile.couleur)){
		    b = false;
		}
	    }
	    if(b){
		ligne5.add(tuile);
		fabrique.fabrique1.remove(tuile);
		System.out.println("tuile(s) inseree(s) avec succes");
	    }
	}else{
	    System.out.println("Vous ne pouvez pas inserer cette/ces tuile(s)");
	}
    }
}
