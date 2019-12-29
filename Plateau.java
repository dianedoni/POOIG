import java.util.Scanner;
import java.util.InputMismatchException;

public class Plateau {
	protected String proprietaire;
	protected String [] s = new String[5];
	protected String[] mos = {"[bl]","[j]","[r]","[n]","[b]"};
	protected static Defausse def;
	protected int [] lignes = {1,2,3,4,5};
	protected static int ligneChoisie;
	protected static int nbreAffichage=0;
	protected String tuileChoisie;
	
	public Plateau(String s) {
		this.proprietaire = s;
		affichePlateau();
		System.out.println();
		def = new Defausse(s);
		
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
	
	
	public void firstLine() {
		int diff = 0;
		if(nbreAffichage == 0 || ligneChoisie != 1) {
		s[4] = "[ ]";                    
		System.out.print(lignes[0] + "                " + s[4] + "    ");
		for(int i=0;i<mos.length;i++) {
			System.out.print(mos[i] + " ");
		}
		System.out.println();
		} else if(ligneChoisie == 1) {
			s[4] = "["+tuileChoisie +"]";
			System.out.print(lignes[0] + "                " + s[4] + "    ");
			for(int i=0;i<mos.length;i++) {
				System.out.print(mos[i] + " ");
			}
			System.out.println();
		} else {
			diff = ligneChoisie-1;
		}
	}
	
	public void scndLine() {	
		int diff = 0;
		if(nbreAffichage == 0 || ligneChoisie != 2 ) {
		mos[0] = "[b]";
		mos[1] = "[bl]";
		mos[2] = "[j]";
		mos[3] = "[r]";
		mos[4] = "[n]";
		s[3] = "[ ]";
		s[4] = "[ ]"; 
		System.out.print(lignes[1] + "            " + s[3] + " ");
		System.out.print(s[4] + "    ");
		for(int i=0;i<mos.length;i++) {
			System.out.print(mos[i] + " ");
		}
		System.out.println();
		} else if(ligneChoisie == 2) {
			mos[0] = "[b]";
			mos[1] = "[bl]";
			mos[2] = "[j]";
			mos[3] = "[r]";
			mos[4] = "[n]";
			s[3] = "[ ]";
			s[4] = "[ ]"; 
			s[3] = "["+tuileChoisie +"]";
			s[4] = "["+tuileChoisie +"]";
			System.out.print(lignes[1] + "            " + s[3] + " ");
			System.out.print(s[4] + "    ");
			for(int i=0;i<mos.length;i++) {
				System.out.print(mos[i] + " ");
			}
			System.out.println();
		} else {
			diff = ligneChoisie-2;
		}
	}
	
	public void thrdLine() {
		int diff = 0;
		if(nbreAffichage == 0 || ligneChoisie != 3) {
		mos[0] = "[n]";
		mos[1] = "[b]";
		mos[2] = "[bl]";
		mos[3] = "[j]";
		mos[4] = "[r]";
		s[2] = "[ ]";
		s[3] = "[ ]";
		s[4] = "[ ]";  
		System.out.print(lignes[2] + "        " + s[2] + " ");
		System.out.print(s[3] + " ");
		System.out.print(s[4] + "    ");
		for(int i=0;i<mos.length;i++) {
			System.out.print(mos[i] + " ");
		}
		System.out.println();
		} else if(ligneChoisie == 3) {
			mos[0] = "[n]";
			mos[1] = "[b]";
			mos[2] = "[bl]";
			mos[3] = "[j]";
			mos[4] = "[r]";
			s[2] = "["+tuileChoisie +"]";
			s[3] = "["+tuileChoisie +"]";
			s[4] = "["+tuileChoisie +"]";
			System.out.print(lignes[2] + "        " + s[2] + " ");
			System.out.print(s[3] + " ");
			System.out.print(s[4] + "    ");
			for(int i=0;i<mos.length;i++) {
				System.out.print(mos[i] + " ");
			}
			System.out.println();
		} else {
			diff = ligneChoisie-3;
		}
	}
	
	public void frthLine(){
		int diff = 0;
		if(nbreAffichage == 0 || ligneChoisie != 4) {
		mos[0] = "[r]";
		mos[1] = "[n]";
		mos[2] = "[b]";
		mos[3] = "[bl]";
		mos[4] = "[j]";
		s[1] = "[ ]";
		s[2] = "[ ]";
		s[3] = "[ ]";
		s[4] = "[ ]";  
		System.out.print(lignes[3] + "    " + s[1] + " ");
		System.out.print(s[2] + " ");
		System.out.print(s[3] + " ");
		System.out.print(s[4] + "    ");
		for(int i=0;i<mos.length;i++) {
			System.out.print(mos[i] + " ");
		}
		System.out.println();
		} else if(ligneChoisie == 4) {
			mos[0] = "[r]";
			mos[1] = "[n]";
			mos[2] = "[b]";
			mos[3] = "[bl]";
			mos[4] = "[j]";
			s[1] = "["+tuileChoisie +"]";
			s[2] = "["+tuileChoisie +"]";
			s[3] = "["+tuileChoisie +"]";
			s[4] = "["+tuileChoisie +"]";
			System.out.print(lignes[3] + "    " + s[1] + " ");
			System.out.print(s[2] + " ");
			System.out.print(s[3] + " ");
			System.out.print(s[4] + "    ");
			for(int i=0;i<mos.length;i++) {
				System.out.print(mos[i] + " ");
			}
			System.out.println();
		} else {
			diff = ligneChoisie-4;
		}
	}
	
	public void fifthLine() {
		int diff = 0;
		if(nbreAffichage == 0 || ligneChoisie != 5) {
		mos[0] = "[j]";
		mos[1] = "[r]";
		mos[2] = "[n]";
		mos[3] = "[b]";
		mos[4] = "[bl]";
		System.out.print(lignes[4] + "");
		for(int i=0;i<s.length-1;i++) {
			System.out.print("[ ]" + " ");
		}
		System.out.print(s[4] + "    ");
		for(int i=0;i<mos.length;i++) {
			System.out.print(mos[i] + " ");
		}
		System.out.println();
		} else if(ligneChoisie == 5) {
			mos[0] = "[j]";
			mos[1] = "[r]";
			mos[2] = "[n]";
			mos[3] = "[b]";
			mos[4] = "[bl]";
			System.out.print(lignes[4] + "");
			for(int i=0;i<s.length-1;i++) {
				System.out.print("["+tuileChoisie +"]" + " ");
			}
			System.out.print(s[4] + "    ");
			for(int i=0;i<mos.length;i++) {
				System.out.print(mos[i] + " ");
			}
			System.out.println();
		} else {
			diff = ligneChoisie-5;
		}
	}
	
	public void affichePlateau() {
		firstLine();
		scndLine();
		thrdLine();
		frthLine();
		fifthLine();
		
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
	
	public void placerTuile(int ligne,String ch,int nbreTuilesAPlacer){
		choixDeLigne();
		System.out.println();
	}
	
	public void addToDefausse(int n,String s) {
		for(int a=0;a<n;a++) {
			def.defausse[a] = s;
		}
	}
	
	
	
	/*public void afficheDefausse() {
		for(int i=0;i<defausse.n.length;i++) {
			System.out.print(defausse.n[i] + "  ");
		}
		
		System.out.println();
		
		for(int i=0;i<defausse.defausse.length;i++) {
			defausse.defausse[i] = "[ ]";
			System.out.print(defausse.defausse[i] + " ");
		}
	}*/
	
	public String exchangeValues(String ch, String s) {
		ch = s;
		return ch;
	}
	
	public void afficheApresChoix(int ligne, String ch,int nbreTuilesAPlacer) {
	
		tuileChoisie = ch;
		placerTuile(ligne,ch,nbreTuilesAPlacer);
		nbreAffichage++;
		affichePlateau();
	}
}
