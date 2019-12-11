import java.util.Scanner;

public class Plateau {
	protected Manche m = new Manche();
	protected String proprietaire;
	protected String [] s = new String[5];
	protected String[] mos = {"[bl]","[j]","[r]","[n]","[b]"};
	protected Defausse def;
	protected int ligne;
	
	public Plateau(String s) {
		this.proprietaire = s;
		affichePlateau();
		System.out.println();
		def = new Defausse(s);
		
	}

	public int nbrePlateaux() {
		return m.nbJoueurs;
	}
	
	public void firstLine() {
		ligne = 1;
		s[4] = "[ ]";                    
		System.out.print(ligne + "                " + s[4] + "    ");
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
		ligne = 2;
		System.out.print(ligne + "            " + s[3] + " ");
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
		ligne = 3;
		System.out.print(ligne + "        " + s[2] + " ");
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
		ligne = 4;
		System.out.print(ligne+ "    " + s[1] + " ");
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
		ligne = 5;
		System.out.print(ligne + "");
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
	
	public String choixDeLigne() {
		System.out.println("Sur quelle ligne désirez vous placer vos tuiles ");
		System.out.println("Entrez un chiffre compris entre 1 et 5");
		Scanner sc = new Scanner(System.in);
		String s = "";
		s = sc.nextLine();
		return s;
	}
	
	public void placerTuile(int n,String s) {
		
	}
}
