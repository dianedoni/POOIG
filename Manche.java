import java.util.LinkedList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Manche {
	protected LinkedList<Joueur> liste;
	protected Fabrique fabrique;
	protected static TwoPlayers two;
	protected static ThreePlayers three;
	protected static FourPlayers four;
	protected static int nbJoueurs;
	protected static Sac sac;
	protected static int n ;
	protected LinkedList<Plateau> plateaux;
	
	/* pour recuperer le nombre de joueurs et pouvoir 
	l utiliser sans toutefois avoir besoin du Scanner*/
	
	public Manche() {
		liste = new LinkedList<Joueur>();
		sac = new Sac("rouge",2);
		plateaux = new LinkedList<Plateau>();
	}
	
	public void commence() {
		
		gameWithNumberOfPlayers();
	}
	
	public void gameWithNumberOfPlayers(){
		if(nbJoueurs == 2) {
			two = new TwoPlayers();
			two.gameWithTwoPlayers();
			//two.afficheNextPlayer();
			System.out.println();
		} else if(nbJoueurs == 3){
			three = new ThreePlayers();
			three.gameWithThreePlayers();
			System.out.println();
		} else {
			four = new FourPlayers();
			four.gameWithFourPlayers();
			System.out.println();
		}
	}
	
	public void affichage() {
		System.out.println("*********************************");
		System.out.println("               AZUL              ");
		System.out.println("*********************************");
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Combien de joueurs pour cette partie?"); 
	    try{nbJoueurs = sc.nextInt();}
	    catch(InputMismatchException i) {
	    	System.out.println("Vous devez entrer un nombre et non des caractères");
	    }
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
				System.out.println("Recommencons, il ne peut y avoir moins de 2 et  plus de 4 joueurs");
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
		public int bonneFabrique() {
			int n = 0;
			Fabrique f = new Fabrique();
			if(nbJoueurs == 2) {
				f = two;
				n = n + 5;
			} else if(nbJoueurs == 3) {
				f = three;
				n = n + 7;
			} else {
				n = n + 9;
			}
			return n;
		}

		
		public void consignes() {
			System.out.println("***************Consignes***************");
			System.out.println("Pour prendre les tuiles que vous desirez, choisissez d abord ");
			System.out.println("la fabrique concernee en indiquant un numero entre 0 et "
				+ (bonneFabrique()-1) + ".");
			System.out.println("Ensuite choississez les tuiles qui vous interessent dans cette fabrique.");
			System.out.println("Pour cela vous avez le choix entre les caracteres {R,J,B,N,BL} avec BL "
					+ "representant le blanc.");
			System.out.println("Mis a part cela, indiquez aussi un nombre entre 2 et 6 specifiques respectivement"
					+ " aux tuiles {R,J,B,N,BL}");
			System.out.println();
		}
		
		public void attributionPlateaux() {
			System.out.println("Les joueurs ont donc leurs plateaux pour la construction");
			for(int i=0;i<nbJoueurs;i++) {
				System.out.println(liste.get(i).nom);
				Plateau p = new Plateau(liste.get(i).nom);
				plateaux.add(i,p);
				System.out.println();
			}
		}
		
}
