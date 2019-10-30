import java.util.LinkedList;
import java.util.Scanner;

public class Manche {
	protected int n ;//nbre de manches
	protected LinkedList<Joueur> liste;
	protected LinkedList<Fabrique> fabriques;
	protected int nbJoueurs;
	
	/* Il faut tout d abord savoir le nombre de 
	 * joueurs afin de pouvoir savoir le nombre de fabriques necessaires
	 * et de lancer le jeu
	 * */
	
	public Manche() {
		liste = new LinkedList<Joueur>();
		System.out.println("Ce jeu peut avoir uniquement 2,3 ou 4 joueurs");
		Scanner sc = new Scanner(System.in); 
		System.out.println("Combien de joueurs pour cette partie?"); 
		nbJoueurs = sc.nextInt();
		addPlayers(liste);
	}
	
	public Manche(int n) {
		this.n = n;
	}
	
	// Methode de verification afin de respecter les regles du jeu
		
	public boolean nbJoueurCorrect() { 
		return nbJoueurs>=2 && nbJoueurs<=4;
	}
		
		
	/* Avec le nombre de joueur, on peut determiner le nombre de fabriques 
	 * qui vont etre utilisees pendant une partie	
	 */
		
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
		
		/*Ensuite, on remplit une liste de joueur avec le nombre de
		 * joueurs donne en entree. Cette methode est une factorisation 
		 * du code addPlayers
		 * */
		
	public void remplirListe(LinkedList<Joueur> j) {
		if(j.size() == 0) {
			for(int i=0;i<nbJoueurs;i++) {
				j.add(i, new Joueur(""));
			}
		}
	}
		
		/*Afin de ne pas avoir un code trop compacte, je continue 
		 * avec ma factorisation, et donc addPlayersAux va etre utile 
		 * dans le cas ou la methode nbJoueurCorrect() est vrai
		 */
	
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
		
		
		
		/*Sinon on reprend depuis le debut et ce avec la methode
		 * doNotAddPlayers(liste de joueurs)
		 */
		
		public void doNotAddPlayers(LinkedList<Joueur> j) {
			if(!nbJoueurCorrect()) {
				System.out.println("Recommencons");
				Jeu jeu = new Jeu();
			}
		}
		
		/*Enfin on a tous les elements necessaires
		 * pour remplir la liste des joueurs avec addPlayers(liste de joueurs)
		 * */
		
		public void addPlayers(LinkedList<Joueur> j) {
			if(nbJoueurCorrect()) {
				addPlayersAux(j);
			} else {
				doNotAddPlayers(j);
			}
		}
		
		
}
