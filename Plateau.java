import java.util.Scanner;
import java.util.InputMismatchException;

public class Plateau {
	protected String proprietaire;
	protected String [] s = new String[5];
	protected String[] mos = {"[bl]","[j]","[r]","[n]","[b]"};
	protected Defausse def;
	protected int [] lignes = {1,2,3,4,5};
	protected int ligneChoisie;
	
	public Plateau(String s) {
		this.proprietaire = s;
		affichePlateau();
		System.out.println();
		def = new Defausse(s);
		
	}

	public int nbrePlateaux() {
		return Manche.nbJoueurs;
	}
	
	public void firstLine() {
		s[4] = "[ ]";                    
		System.out.print(lignes[0] + "                " + s[4] + "    ");
		for(int i=0;i<mos.length;i++) {
			System.out.print(mos[i] + " ");
		}
		System.out.println();
	}
	
	public void scndLine() {	
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
	}
	
	public void thrdLine() {
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
	}
	
	public void frthLine(){
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
	}
	
	public void fifthLine() {
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
	}
	
	public void affichePlateau() {
		firstLine();
		scndLine();
		thrdLine();
		frthLine();
		fifthLine();
	}
	
	public int choixDeLigne() {
		System.out.println("sur quelle ligne désirez vous placer vos tuiles ");
		System.out.println("Entrez un chiffre compris entre 1 et 5");
		Scanner sc = new Scanner(System.in);
		try { this.ligneChoisie = sc.nextInt(); }
		catch (InputMismatchException i) {
			System.out.println("Vous deviez entrer un entier.");
			System.out.println("Recommencez!");
			choixDeLigne();
			}
		return ligneChoisie;
	}
	
	public void placerTuile(int ligne,String ch,int nbreTuilesAPlacer){
		choixDeLigne();
		nbreTuilesAPlacer = 4 - nbreTuilesAPlacer;
		System.out.println("le nombre de tuiles a placer est: " + nbreTuilesAPlacer);
		ligne = ligneChoisie;
		int n = this.s.length;
		int diff = 0;
		for(int i=0;i<lignes.length;i++) {
			try{if(lignes[i] == ligne) {
				for(int j=n-ligne;j<n;j++) { 
					if(nbreTuilesAPlacer>ligne) {
						diff =nbreTuilesAPlacer-ligne;
						System.out.println("La/Les " + "seul/" + diff + " tuile(s) sera(ont) rajouté(s)  à la défausse");
					} else {
					for(int c=0;c<nbreTuilesAPlacer;c++) {
						s[j] = "[" + ch + "]";
					}
				}
			}		
			}
		}
			catch(Exception e) {
				System.out.println("Choisissez un nombre entre 1 et 5");
			}
		}
		affiche(ligne,ch,nbreTuilesAPlacer);
		System.out.println();
	}
	
	
	public void affiche(int ligne, String ch,int nbreTuilesAPlacer) {
		System.out.print(ligne + " ");
		for(int i=0;i<s.length-ligne;i++) {
			s[i] = "   ";
			System.out.print(s[i] + " ");
		}
		for(int i=s.length-ligne;i<s.length;i++) {
			s[i] = "[" + ch + "]";
			System.out.print(s[i] + " ");
		}
	}
}
