import java.util.LinkedList;
import java.util.Scanner;

public class Joueur implements ChoixTuiles {
	protected String nom; // afin de pouvoir distinguer les joueurs et leur plateau
	protected LinkedList<Tuiles> mosaique;
	protected int score;
	protected Manche m = new Manche();

	
	public Joueur(String n) {
		this.nom = n;
		this.score = 0;
		this.mosaique = new LinkedList<Tuiles>();
	}
	
	public void setNom(String n) {
		this.nom =  n;
	}

	public void chooseTuile(String n) {
		System.out.println("Entrez votre choix " + n + ":");
		Scanner sc = new Scanner(System.in);
		String s = "";
		s = sc.nextLine();
		if(s.charAt(1) == 'R') {
			System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la tuile R");
		}
		if(s.charAt(1) == 'J') {
			System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la tuile J");
		}
		
		if(s.charAt(1) == 'B' && s.charAt(2) != 'L' ) {
			System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la tuile B");
		}
		
		if(s.charAt(1) == 'N') {
			System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la tuile N");
		}
		
		if(s.charAt(1) == 'B' && s.charAt(2) == 'L') {
			System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la tuile BL");
		}
		
		if(mosaique.size() == 0) {
			mosaique.add(0, new Tuiles());
		} else {
			mosaique.addLast(new Tuiles());
		}
		
	}
	
	
}
