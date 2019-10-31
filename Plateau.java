
public class Plateau {
	protected Manche m = new Manche();
	protected String proprietaire;
	
	public Plateau() {
		for(int i=0;i<nbrePlateaux();i++) {
			this.proprietaire = m.liste.get(i).nom;
		}
	}

	public int nbrePlateaux() {
		return m.nbJoueurs;
	}
	
	public void attributionPlateaux() {
		
	}
	
}
