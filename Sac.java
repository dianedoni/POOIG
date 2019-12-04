import java.util.LinkedList;

public class Sac extends Tuiles{

	protected int first; 
	protected LinkedList<Tuiles> tuiles ;
	
	
	public Sac(String c,int n) {
		tuiles = new LinkedList<Tuiles>();
		nombreTotalTuiles();
		addPremiereTuile();
		remplissageSac();
	}
	
	
	
	public void nombreTotalTuiles() {
		for(int i=0;i<101;i++) {
		tuiles.add(i, new Tuiles());
		tuiles.get(i).pos = i;
		}

	}
	
	
	
	
	public void addPremiereTuile() {
		tuiles.get(0).setColor("incolore");
		tuiles.get(0).setNbre(0);
	}

	// toutes les tuiles rouges ont la numerotation 2 parce que la premiere tuile a deja le numero 1
	public void tuilesRouges(String c, int n) {
		for(int i=1;i<21;i++) {
			tuiles.get(i).setColor(c);
			tuiles.get(i).setNbre(n);
			
		}
	}
	
	
	// toutes les tuiles jaunes ont la numerotation 3 et ainsi de suite
	public void tuilesJaunes(String c, int n) {
		for(int i=21;i<41;i++) {
			tuiles.get(i).setColor(c);
			tuiles.get(i).setNbre(n);
			
			}
	}
	
	
	public void tuilesBleues(String c, int n) {
		for(int i=41;i<61;i++) { 
				tuiles.get(i).setColor(c);
				tuiles.get(i).setNbre(n);
			}
	}	
		
	public void tuilesNoires(String c, int n) {
		for(int i=61;i<81;i++) {
			tuiles.get(i).setColor(c);
			tuiles.get(i).setNbre(n);
		}	
	}
	
	public void tuilesBlanches(String c, int n) {
		for(int i=81;i<101;i++) {
			tuiles.get(i).setColor(c);
			tuiles.get(i).setNbre(n);
		}	
	}
	
	public void colorTuile(int n){
		for(int i=1;i<21;i++) {
			tuiles.get(i).setColor("R");
		}
		
		for(int i=21;i<41;i++) {
			tuiles.get(i).setColor("J");
		}
		
		for(int i=41;i<61;i++) {
			tuiles.get(i).setColor("B");
		}
		
		for(int i=61;i<81;i++) {
			tuiles.get(i).setColor("N");
		}
		
		for(int i=81;i<101;i++) {
			tuiles.get(i).setColor("BL");
		}	
	}
	
	/*Dans ce code, les tuiles sont rangées dans un ordre précis
	 * dans le sens ou les tuiles rouges sont varient de la position 1 à
	 * la position 21 etc.... Donc determiner la position d'une tuile 
	 * permet donc de savoir de quelle couleur est la tuile. Cette fonctionne se montrera utile 
	 * dans la classe Fabrique au moment de remplir les fabriques.
	 * */
	
	public int numTuile(int a) {
		int n = 0;
			if(a>=1 && a<=21){
				n = n + 2;
			}
			
			if(a>=21 && a<=41){
				n = n + 3;
			}
			
			if(a>=41 && a<=61){
				n = n + 4;
			}
			
			if(a>=61 && a<=81){
				n = n + 5;
			}
			
			if(a>=81 && a<=102){
				n = n + 6;
			}
		return n;
	}
	
	
	/*
	 * Remplis progressivement le sac de tuiles de differentes couleures
	 */
	public void remplissageSac() {
		
			tuilesRouges("rouge",2);
			tuilesJaunes("jaune",3);
			tuilesBleues("bleue",4);
			tuilesNoires("noire",5);	
			tuilesBlanches("blanche",6);
	}
	
	/*
	 * Supprime un element donné de la liste de tuiles
	 * Utile pour eviter d'abuser des attributs dans le code
	 */
	public void remove(int i) {
		tuiles.remove(i);
	}
	
	
}
