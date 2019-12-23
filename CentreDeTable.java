import java.util.LinkedList;

public class CentreDeTable {

	protected static LinkedList<Tuiles> c;
	protected static Tuiles[]b;
	protected static Tuiles[]temp;
	protected static Tuiles tuile;
	
	public CentreDeTable() {
		c = new LinkedList<Tuiles>();
		c.add(0, new Tuiles());
		
	}
	
	
	public static void addAtCenter(Tuiles[] a,String s) {
		c.get(0).couleur = "1";
		for(int i=0;i<a.length;i++) {
			if(!a[i].couleur.equals(s)) {
				c.addLast(a[i]);
				} else {
		
				}
		}
		
	}
	
	public static void afficheCentreDeTable(Tuiles[] a,String s) {
		addAtCenter(a,s);
		if(c.size() == 0) {
			System.out.println("Le centre de table est vide");
		}else {
			System.out.print("Le centre de table est composé des tuiles suivantes : ");
			for(int i =0;i<c.size();i++) {
				if(c.get(i).couleur.equals("V") ) {
					c.get(i).findFirstColor();
				}
				System.out.print( c.get(i).couleur + " " );
			}
		} 
		System.out.println();
		}
	
}

