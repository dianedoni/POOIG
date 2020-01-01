import java.util.Scanner;
import java.util.InputMismatchException;

public class Plateau {
	protected String proprietaire;
	protected String [] ligne1 = {"   ","   ","   ", "   ", "[ ]"," "," ","[w]","[j]","[r]","[n]","[b]"};
	protected String [] ligne2 = {"   ","   ","   ",  "[ ]", "[ ]"," "," ","[b]","[w]","[j]","[r]","[n]"};
	protected String [] ligne3 = {"   ","   ",  "[ ]","[ ]","[ ]"," "," ","[n]","[b]","[w]","[j]","[r]"}; 
	protected String [] ligne4 = {"   ", "[ ]","[ ]","[ ]","[ ]"," "," ","[r]","[n]","[b]","[w]","[j]"};
	protected String [] ligne5 = {"[ ]","[ ]","[ ]","[ ]","[ ]"," "," ","[r]","[n]","[b]","[w]","[j]"};
	protected Defausse def;
	protected int indicePlateau;
	protected static int [] lignes = {1,2,3,4,5};
	protected static int ligneChoisie;
	protected static int nbreAffichage=0;
	protected static String tuileChoisie;
	
	public Plateau(String nom,int n) {
		proprietaire = nom;
		indicePlateau = n;
		affichePlateau(nom,n);
		System.out.println();
		def = new Defausse(nom);
		
	}

	private class Defausse{
		//protected Joueur joueur;
		protected String[] defausse = new String[7];
		protected int [] n = {-1,-1,-2,-2,-2,-3,-3};
		
		public Defausse(String n) {
			afficheDefausse();
			System.out.println();
			System.out.println("*******************************************");
		}
		
		public void afficheDefausse() {
			for(int i=0;i<n.length;i++) {
				System.out.print(n[i] + "  ");
			}
			
			System.out.println();
			
			for(int i=0;i<defausse.length;i++) {
				defausse[i] = "[ ]";
				System.out.print(defausse[i] + " ");
			}
		}
	}
	
	
	public void firstLine(String nom,int n) {
		int diff = 0;
		if((nbreAffichage == 0 || ligneChoisie != 1) && proprietaire.equals(nom)) {
		System.out.print(lignes[0] + "  ");
		for(int i=0;i<ligne1.length;i++) {
			System.out.print(ligne1[i] + " ");
		}
		System.out.println();
		} else if(ligneChoisie == 1 && Manche.liste.get(n).nbreTuilesChoisies == 1) {
			ligne1[4] = "["+tuileChoisie +"]";
			System.out.print(lignes[0] + "  ");
			for(int i=0;i<ligne1.length;i++) {
				System.out.print(ligne1[i] + " ");
			}
			System.out.println();
		} else {
			diff = ligneChoisie-1;
		}
	}
	
	
	
	public void scndLine(String nom,int n) {	
		int diff = 0;
		if((nbreAffichage == 0 || ligneChoisie != 2) && proprietaire.equals(nom) ) {
			System.out.print(lignes[1] + "  ");
			for(int i=0;i<ligne2.length;i++) {
				System.out.print(ligne2[i] + " ");
		}
		System.out.println();
		} else if(ligneChoisie == 2) {
			ligne2[3] = "["+tuileChoisie +"]";
			ligne2[4] = "["+tuileChoisie +"]";	
			System.out.print(lignes[1] + "  ");
			for(int i=0;i<ligne2.length;i++) {
				System.out.print(ligne2[i] + " ");
			}
			System.out.println();
		} else {
			diff = ligneChoisie-2;
		}
	}
	
	public void thrdLine(String nom,int n) {
		int diff = 0;
		if((nbreAffichage == 0 || ligneChoisie != 3) && proprietaire.equals(nom)) {
			System.out.print(lignes[2] + "  ");
			for(int i=0;i<ligne3.length;i++) {
				System.out.print(ligne3[i] + " ");
		}
		System.out.println();
		} else if(ligneChoisie == 3) {
			ligne3[2] = "["+tuileChoisie +"]";
			ligne3[3] = "["+tuileChoisie +"]";
			ligne3[4] = "["+tuileChoisie +"]";
			System.out.print(lignes[2] + "  ");
			for(int i=0;i<ligne3.length;i++) {
				System.out.print(ligne3[i] + " ");
		}
			System.out.println();
		} else {
			diff = ligneChoisie-3;
		}
	}
	
	public void frthLine(String nom,int n){
		int diff = 0;
		if((nbreAffichage == 0 || ligneChoisie != 4) && proprietaire.equals(nom)) {
			System.out.print(lignes[3] + "  ");
			for(int i=0;i<ligne4.length;i++) {
				System.out.print(ligne4[i] + " ");
		}
		System.out.println();
		} else if(ligneChoisie == 4) {

			ligne4[1] = "["+tuileChoisie +"]";
			ligne4[2] = "["+tuileChoisie +"]";
			ligne4[3] = "["+tuileChoisie +"]";
			ligne4[4] = "["+tuileChoisie +"]";
			System.out.print(lignes[3] + "  ");
			for(int i=0;i<ligne4.length;i++) {
				System.out.print(ligne4[i] + " ");
		}
			System.out.println();
		} else {
			diff = ligneChoisie-4;
		}
	}
	
	public void fifthLine(String nom,int n) {
		int diff = 0;
		if((nbreAffichage == 0 || ligneChoisie != 5) && proprietaire.equals(nom)) {
			System.out.print(lignes[4] + "  ");
			for(int i=0;i<ligne5.length;i++) {
				System.out.print(ligne5[i] + " ");
		}
		System.out.println();
		
		} else if(ligneChoisie == 5) {
			
			System.out.print(ligne5[4] + "    ");
			for(int i=0;i<5;i++) {
				System.out.print("["+tuileChoisie +"]" + " ");
			}
			System.out.print( "   " );
			
			for(int i=7;i<ligne5.length;i++) {
				System.out.print(ligne5[i] + " ");
			}
			System.out.println();
		} else {
			diff = ligneChoisie-5;
		}
	}
	
	public void affichePlateau(String nom,int n) {
		firstLine(nom,n);
		scndLine(nom,n);
		thrdLine(nom,n);
		frthLine(nom,n);
		fifthLine(nom,n);
	}
	
	public int choixDeLigne() {
		System.out.println("sur quelle ligne desirez vous placer vos tuiles ");
		System.out.println("Entrez un chiffre compris entre 1 et 5");
		Scanner sc = new Scanner(System.in);
		try {ligneChoisie = sc.nextInt(); }
		catch (InputMismatchException i) {
			System.out.println("Vous deviez entrer un entier.");
			System.out.println("Recommencez!");
			choixDeLigne();
			}
		return ligneChoisie;
	}
	
	
	public void addToDefausse(int n,String s) {
		for(int a=0;a<n;a++) {
			def.defausse[a] = s;
		}
	}
	
	
	public void afficheApresChoix(String nom,int n) {
		//if(nom.equals(this.proprietaire)) {
		choixDeLigne();
		nbreAffichage++;
		affichePlateau(nom,n);
		System.out.println();
		def = new Defausse(nom);
		//}
	}
}
