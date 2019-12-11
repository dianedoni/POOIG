import java.util.LinkedList;
import java.util.Scanner;

public class Joueur {
	protected String nom; // afin de pouvoir distinguer les joueurs et leur plateau
	protected LinkedList<Tuiles> mosaique;
	protected int score;
	protected Manche m = new Manche();
	protected Fabrique fabrique = new Fabrique();

	
	public Joueur(String n) {
		this.nom = n;
		this.score = 0;
		this.mosaique = new LinkedList<Tuiles>();
	}
	
	public void setNom(String n) {
		this.nom =  n;
	}
	
	
	public void addMosaique(Tuiles[] a ,String s) {
		for(int i=0;i<a.length;i++) {
			if(a[i].couleur.equals(s) && this.mosaique.size() ==0) {
				this.mosaique.add(0,a[i]);
			} else if(a[i].couleur.equals(s) && this.mosaique.size() !=0) {
				this.mosaique.addLast(a[i]);
			} else {
			
			}
		}
	}
	
	public boolean searchRightMosaique( String nom) {
		return this.nom.equals(nom);
	}
	
	public void afficheMosaique(Tuiles[] a,String s,String nom) {
		addMosaique(a,s);
		if(this.mosaique.size() == 0) {
			System.out.println("La mosaique de " + this.nom + " est vide");
		}else {
			System.out.print("La mosaique de "+ this.nom+ " est composé des tuiles suivantes : ");
			for(int i =0;i<a.length;i++) {
				if(a[i].couleur.equals(s) && this.nom.equals(nom)) {
				System.out.print( a[i].couleur + " " );
				} else {
					
				}
			}
			} 
		System.out.println();
		}
	
}
