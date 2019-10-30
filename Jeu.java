import java.util.LinkedList;
import java.util.Scanner;

public class Jeu extends Manche {
	protected LinkedList<Joueur> liste;
	protected LinkedList<Fabrique> fabriques;
	protected int nbJoueurs;
	
	/* Il faut tout d abord savoir le nombre de 
	 * joueurs afin de pouvoir savoir le nombre de fabriques necessaires
	 * et de lancer le jeu
	 * */
	
	public Jeu(){
		liste = new LinkedList<Joueur>();
		System.out.println("Ce jeu peut avoir uniquement 2,3 ou 4 joueurs");
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Combien de joueurs pour cette partie?"); 
	    nbJoueurs = sc.nextInt();
		addPlayers(liste);
	}
	
	
	// Methode accessoire de verification
	public boolean nbJoueurCorrect() { 
		return nbJoueurs>=2 && nbJoueurs<=4;
	}
	
	/*Des qu on a le nombre de joueurs, on determine le nombre de fabriques 
	 * qu il faut, le jeu commence a se mettre en place
	 * */
	
	
	public int nbFabrique(){
		int n = 0;
		if(nbJoueurs == 2) {
			n = n + 5;
		}
		
		if(nbJoueurs == 3) {
			n = n + 7;
		}
		
		if(nbJoueurs == 4) {
			n = n + 9;
		}
		
		return n;
	}
	
	
	public void remplirListe(LinkedList<Joueur> j) {
		if(j.size() == 0) {
			for(int i=0;i<nbJoueurs;i++) {
				j.add(i, new Joueur(""));
			}
		}
	}
	
	public void addPlayersAux(LinkedList<Joueur> j) {
		remplirListe(j);
		int n = nbJoueurs;
		String s = "";
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.println("Le nom du joueur " + i + " est");
			s = sc.nextLine();
			j.get(i).setNom(s);
		}
	}
	
	
	
	
	public void doNotAddPlayers(LinkedList<Joueur> j) {
		if(!nbJoueurCorrect()) {
			System.out.println("Recommencons");
			Jeu jeu = new Jeu();
		}
	}
	
	public void addPlayers(LinkedList<Joueur> j) {
		if(nbJoueurCorrect()) {
			addPlayersAux(j);
		} else {
			doNotAddPlayers(j);
		}
	}
	
	

		
		
	
}
