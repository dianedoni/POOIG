import java.util.LinkedList;
import java.util.Random;

public class Tuiles extends Objet {
	protected LinkedList<Objet> objets;
	
	public Tuiles(String c, int n,int pos){
		super(c,n,pos);
		this.objets = new LinkedList<Objet>();
	}
	
	
	public Tuiles() {	
		this.couleur = "";
		this.nbre = 0;
		this.pos = 0;
	}
	
	public void findColor(int n) {
		if(n == 2) {
			this.couleur = "R";
		}
		
		if(n == 3) {
			this.couleur = "J";
			
		}
		
		if(n == 4) {
			this.couleur = "B";
		}
		
		if(n == 5) {
			this.couleur = "N";
		}
		
		if(n == 6) {
			this.couleur = "BL";
		}
	}
	
	
	
	public void addTuile(String c,int n) {
		if(objets.size() == 0) {
			objets.add(0,new Objet());
		} else {
			objets.addLast(new Objet());
		}
	}
	
	
	
}
