import java.util.LinkedList;

public class Tuiles extends Objet {
	protected LinkedList<Objet> objets;
	protected static int num=-1;
	protected int id;
	{num++;}
	
	public Tuiles(String c, int n,int pos){
		super(c,n,pos);
		this.objets = new LinkedList<Objet>();
		this.id = num;
	}
	
	
	public Tuiles() {	
		this.couleur = "";
		this.nbre = 0;
		this.pos = 0;
	}
	
	// Avec en argument un nombre compris entre 2 et 6 permet
	//de trouver la tuile correspondante
	
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
		
		/*switch(n){
		case '2':
			if(n == 2)
		 		this.couleur = "R";
		 break;
		case '3':
			if(n == 3)
				this.couleur = "J";
		 break;
		case '4':
			if(n == 4)
				this.couleur = "B";
		 break;
		case '5':
			if(n == 5)
				this.couleur = "N";
		 break;
		case '6':
			if(n == 6)
				this.couleur = "BL";
		 break;
		default:System.out.print(n);
		}*/

	}
	
	
	
	public void addTuile(String c,int n) {
		if(objets.size() == 0) {
			objets.add(0,new Objet());
		} else {
			objets.addLast(new Objet());
		}
	}
	
	public String findColor2(int n) {
		String s = "";
		if(n == 2) {
			s = "R";
		}
		
		if(n == 3) {
			s = "J";
		}
		
		if(n == 4) {
			s = "B";
		}
		
		if(n == 5) {
			s = "N";
		}
		
		if(n == 6) {
			s = "BL";
		}
		return s;
	}
	
	
	
}
