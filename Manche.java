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
		sac = new Sac();
	}
	
	public void commence() {
		fabrique = new Fabrique();
		fabrique.m.affichage();
		fabrique.remplirFabrique();
		System.out.println("Le premier joueur est " + firstPlayer() );
	}
	
	
	public void affichage() {
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Combien de joueurs pour cette partie?"); 
	    nbJoueurs = sc.nextInt();
	    System.out.println("Il y a " + nbJoueurs + " joueurs");
		addPlayers();
		n = nbJoueurs;
		
	}
	
	
		// Methode de verification afin de respecter les regles du jeu
		
		public boolean nbJoueurCorrect() { 
			return nbJoueurs>=2 && nbJoueurs<=4;
		}
		
		
		/*Afin de ne pas avoir un code trop compacte, je continue 
		 * avec ma factorisation, et donc addPlayersAux va etre utile 
		 * dans le cas ou la methode nbJoueurCorrect() est vrai
		 */
		public void addPlayersAux() {
			liste = new LinkedList<Joueur>();
			Scanner sc = new Scanner(System.in);
			if(liste.size() == 0) {
				for(int i=0;i<nbJoueurs;i++) {
					System.out.println("Le nom du joueur " + i + " est");
					liste.add(i, new Joueur(sc.nextLine()));
				}
			}
			
		}
		
		
		/*Sinon on reprend depuis le debut et ce avec la methode
		 * doNotAddPlayers(liste de joueurs)
		 */
		
		public void doNotAddPlayers() {
			if(!nbJoueurCorrect()) {
				System.out.println("Recommencons");
				Jeu jeu = new Jeu();
			}
		}
		
		/*Enfin on a tous les elements necessaires
		 * pour remplir la liste des joueurs avec addPlayers(liste de joueurs)
		 * */
		
		public void addPlayers() {
			if(nbJoueurCorrect()) {
				addPlayersAux();
			} else {
				doNotAddPlayers();
			}
		}
		
		//On choisit aleatoirement le premier joueur au debut de chaque partie
		public String firstPlayer() {
			int a = (int)((Math.random() * (n-1)));
			return liste.get(a).nom;
		}
		
		
}
