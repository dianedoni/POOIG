import java.util.LinkedList;

public class Sac extends Tuiles{

	protected int first; 
	protected LinkedList<Tuiles> tuiles ;
	
	
	public Sac() {
		tuiles = new LinkedList<Tuiles>();
	}
	
	public void distribution() {
		nombreTotalTuiles();
		addPremiereTuile();
		ordreRemplissage(couleur,nbre);
	}
	
	public void nombreTotalTuiles() {
		for(int i=0;i<101;i++) {
			tuiles.add(i, new Tuiles("",0));
		}
	}
	
	
	public void addPremiereTuile() {
		tuiles.get(0).setColor("incolore");
		tuiles.get(0).setNbre(0);
	}
	
	public void doNotAddTuiles() {
		System.out.println("Donnees incorrecte");
	}

	// toutes les tuiles rouges ont la numerotation 2 parce que la premiere tuile a deja le numero 1
	public void tuilesRouges(String c, int n) {
		int l = 0;
		for(int i=1;i<21;i++) {
			tuiles.get(i).setColor(c);
			tuiles.get(i).setNbre(n);
			l++;
		}
		System.out.println("Il y a " + l + " tuiles rouges");
		//Pour verifier qu on a le bon nombre de tuiles
	}
	
	
	// toutes les tuiles jaunes ont la numerotation 3 et ainsi de suite
	public void tuilesJaunes(String c, int n) {
		int l = 0;
		for(int i=21;i<41;i++) {
			tuiles.get(i).setColor(c);
			tuiles.get(i).setNbre(n);
			l++;
			}
		System.out.println("Il y a " + l + " tuiles jaunes");
	}
	
	
	public void tuilesBleues(String c, int n) {
		int l = 0;
		for(int i=41;i<61;i++) { 
				tuiles.get(i).setColor(c);
				tuiles.get(i).setNbre(n);
				l++;
			}
		System.out.println("Il y a " + l + " tuiles bleues");
	}	
		
	public void tuilesNoires(String c, int n) {
		int l = 0;
		for(int i=61;i<81;i++) {
			tuiles.get(i).setColor(c);
			tuiles.get(i).setNbre(n);
			l++;
		}	
		System.out.println("Il y a " + l + " tuiles noires");
	}
	
	public void tuilesBlanches(String c, int n) {
		int l = 0;
		for(int i=81;i<101;i++) {
			tuiles.get(i).setColor(c);
			tuiles.get(i).setNbre(n);
			l++;
		}	
		System.out.println("Il y a " + l + " tuiles blanches");
	}
	
	
	
	public void affiche(int i) { 		
		System.out.println(tuiles.get(i).couleur + " " + tuiles.get(i).nbre );
	}
	
	public void ordreRemplissage(String c, int n) {
		if(c == "" && n == 0) {
			doNotAddTuiles();
		}
		if(c == "rouge" && n == 2) {
			tuilesRouges(c,n);
			tuilesJaunes("jaune",3);
			tuilesBleues("bleue",4);
			tuilesNoires("noire",5);	
			tuilesBlanches("blanche",6);
			
		}
		
		if(c == "jaune" && n == 3) {
			tuilesJaunes(c,n);
			tuilesRouges("rouge",2);
			tuilesBleues("bleue",4);
			tuilesNoires("noire",5);	
			tuilesBlanches("blanche",6);
		}
		
		if(c == "bleue" && n == 4) {
			tuilesBleues(c,n);
			tuilesRouges("rouge",2);
			tuilesJaunes("jaune",3);
			tuilesBleues("bleue",4);
			tuilesNoires("noire",5);	
			tuilesBlanches("blanche",6);
		}
		
		if(c == "noire" && n == 5) {
			tuilesNoires(c,n);
			tuilesRouges("rouge",2);
			tuilesJaunes("jaune",3);
			tuilesBleues("bleue",4);	
			tuilesBlanches("blanche",6);
		}
		
		if(c == "blanche" && n == 6) {
			tuilesBlanches(c,n);
			tuilesRouges("rouge",2);
			tuilesJaunes("jaune",3);
			tuilesBleues("bleue",4);	
			tuilesNoires("noire",5);	
		}
	}
	
}
