import java.util.LinkedList;
import java.util.Scanner;


public class Manche {
	protected LinkedList<Joueur> liste;
	protected Fabrique fabrique;
	protected int nbJoueurs;
	protected Sac sac;
	protected int n ;
	protected LinkedList<Plateau> plateaux;
	
	/* pour recuperer le nombre de joueurs et pouvoir 
	l utiliser sans toutefois avoir besoin du Scanner*/
	
	public Manche() {
		liste = new LinkedList<Joueur>();
		sac = new Sac("rouge",2);
	}
	
	public void commence() {
		fabrique = new Fabrique();
		fabrique.m.affichage();
		fabrique.remplirFabrique();
		
		System.out.println();
		attributionPlateaux();
		
		System.out.println();
		consignes();
			
		fabrique.afficheFApresChoix();
		System.out.println();
		
		//System.out.println("Au joueur suivant de jouer.");
	}
	
	
	public void affichage() {
		System.out.println("*********************************");
		System.out.println("               AZUL              ");
		System.out.println("*********************************");
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Combien de joueurs pour cette partie?"); 
	    nbJoueurs = sc.nextInt();
	    System.out.println("Il y a " + nbJoueurs + " joueurs");
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
			Scanner sc = new Scanner(System.in);
			if(liste.size() == 0) {
				for(int i=0;i<nbJoueurs;i++) {
					System.out.println("Le nom du joueur " + i + " est: ");
					liste.add(i, new Joueur(""));
					liste.get(i).setNom(sc.nextLine());
				}
			}
			
		}
		
		/*Sinon on reprend depuis le debut et ce avec la methode
		 * doNotAddPlayers(liste de joueurs)
		 */
		
		public void doNotAddPlayers() {
			if(!nbJoueurCorrect()) {
				System.out.println("Recommencons");
				affichage();
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
		
		// Gere les tours successifs du jeu
		public void nTour() {
			
		}

		
		public void consignes() {
			System.out.println("***************Consignes***************");
			System.out.println("Pour prendre les tuiles que vous desirez, choisissez d abord ");
			System.out.println("la fabrique concernee en indiquant un numero entre 0 et "
					+ (fabrique.nbFabrique()-1) + ".");
			System.out.println("Ensuite choississez les tuiles qui vous interessent dans cette fabrique.");
			System.out.println("Pour cela vous avez le choix entre les caracteres {R,J,B,N,BL} avec BL "
					+ "representant le blanc.");
			System.out.println("Mis a part cela, indiquez aussi un nombre entre 2 et 6 specifiques respectivement"
					+ " aux tuiles {R,J,B,N,BL}");
			System.out.println();
		}
		
		public void attributionPlateaux() {
			System.out.println("Les joueurs ont donc leurs plateaux pour la construction");
			plateaux = new LinkedList<Plateau>();
			for(int i=0;i<fabrique.m.nbJoueurs;i++) {
				System.out.println(fabrique.m.liste.get(i).nom);
				new Plateau(fabrique.m.liste.get(i).nom);
				System.out.println();
			}
		}
		
}
