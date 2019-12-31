import java.util.*;
import java.awt.*;
import javax.swing.*;
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
    

    //Verifie si la ligne 1 est vide
    public boolean ligne1P(){
	return (ligne1.size() == 0);
    }

    
    //Verifie si la ligne 2 est vide
    public boolean ligne2P(){
	return (ligne2.size()<2);
    }

    
    //Verifie si la ligne 3 est vide
    public boolean ligne3P(){
	return (ligne3.size()<3);
    }

    
    //Verifie si la ligne 4 est vide
    public boolean ligne4P(){
	return (ligne4.size()<4);
    }

    
    //Verifie si la ligne 5 est vide
    public boolean ligne5P(){
	return (ligne5.size()<5);
    }


    
    //Verifie si l'on peut pose une tuile dans la ligne 1 si celle ci est deja occupe partiellement
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


    
    //Verifie si l'on peut pose une tuile dans la ligne 2 si celle ci est deja occupe partiellement
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


    
    //Verifie si l'on peut pose une tuile dans la ligne 3 si celle ci est deja occupe partiellement
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
    

    
    //Verifie si l'on peut pose une tuile dans la ligne 4 si celle ci est deja occupe partiellement
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


    
    //Verifie si l'on peut pose une tuile dans la ligne 5 si celle ci est deja occupe partiellement
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

    //Affichage des tuiles dans les lignes de motifs
    public void afficheMotif(Graphics g){
	
	for(int i = 0;i<ligne1.size();i++){
	    ligne1.get(i).afficheTuile(g);
	}
	
	for(int i = 0;i<ligne2.size();i++){
	    ligne2.get(i).afficheTuile(g);
	}
	
	for(int i = 0;i<ligne3.size();i++){
	    ligne3.get(i).afficheTuile(g);
	}
	
	for(int i = 0;i<ligne4.size();i++){
	    ligne4.get(i).afficheTuile(g);
	}
	
	for(int i = 0;i<ligne5.size();i++){
	    ligne5.get(i).afficheTuile(g);
	}
    }
}
