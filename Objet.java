
public class Objet {
	
	//Classe donnant la structure des tuiles
	protected String couleur;
	protected int nbre;
	protected int pos;
	
	/*Un premier constructeur qui permet d initialiser aux 
	 * valeurs donnees en parametres
	 */
	
	public Objet(String c, int n,int p) {
		this.couleur = c;
		this.nbre = n;
		this.pos = p;
	}
	
	/*Un second constructeur pour initialiser a 0
	 */
	
	public Objet() {
		couleur = "";
		nbre = 0;
		pos = 0;
	}
	
	public String setColor(String s) {
		return this.couleur = s;
	}

	public int setNbre(int n) {
		return this.nbre = n;
	}
	
	public int setPos(int n) {
		return this.pos = n;
	}
	
}
