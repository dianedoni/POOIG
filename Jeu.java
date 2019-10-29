import java.util.LinkedList;

public class Jeu extends Manche {
	protected LinkedList<Joueur> liste;
	protected LinkedList<Fabrique> fabriques;
	
	public void addPlayer(Joueur j) {
		if(liste.size() == 0) {
			liste.add(0,j);
		} else {
			liste.add(liste.size(),j);
		}
	}
	
	public int nbFabrique(LinkedList<Joueur> l){
		int n = 0;
		if(l.size() == 2) {
			n = n + 5;
		}
		if(l.size() == 3) {
			n = n + 7;
		}
		if(l.size() == 4) {
			n = n + 9;
		}
		return n;
	}
}
