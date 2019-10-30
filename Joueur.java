import java.util.LinkedList;

public class Joueur {
	protected String nom; // afin de pouvoir distinguer les joueurs et leur plateau
	protected LinkedList<Tuiles> mosaique;	
	protected int score;
	
	public Joueur(String n) {
		this.nom = n;
		this.score = 0;
		this.mosaique = null;
	}
	
	public void setNom(String n) {
		this.nom =  n;
	}
	
	
}
