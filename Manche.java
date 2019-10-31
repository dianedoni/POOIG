import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class Manche {
	protected LinkedList<Joueur> liste;
	protected Fabrique fabrique;
	protected int nbJoueurs;
	protected Sac sac;
	protected int n ;
	/* pour recuperer le nombre de joueurs et pouvoir 
	l utiliser sans toutefois avoir besoin du Scanner*/
	
	public Manche() {
		liste = new LinkedList<Joueur>();
		sac = new Sac();
	}
	
	public void commence() {
		fabrique = new Fabrique();
		fabrique.m.affichage();
		fabrique.remplirFabrique();
		//System.out.println("Le premier joueur est " +  firstPlayer());
	}
	
	
	public void affichage() {
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Combien de joueurs pour cette partie?"); 
	    nbJoueurs = sc.nextInt();
	    System.out.println("Il y a " + nbJoueurs + " joueurs");
		addPlayers(liste);
		n = nbJoueurs;
		
	}
	// Methode de verification afin de respecter les regles du jeu
		
		public boolean nbJoueurCorrect() { 
			return nbJoueurs>=2 && nbJoueurs<=4;
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
		
		/*public void afficheNoms(LinkedList<Joueur> j) {
			for(int i=0;i<j.size();i++) {
				System.out.println(j.get(i).nom);
			}
		}*/
		
		
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
		
		//On choisit aleatoirement le premier joueur au debut de chaque partie
		public String firstPlayer() {
			int a = (int)((Math.random() * (n)));
			return this.liste.get(a).nom;
		}
		
		
}
