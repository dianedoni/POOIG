import java.util.LinkedList;
import java.util.Scanner;

public class Joueur {
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
	
	
}
