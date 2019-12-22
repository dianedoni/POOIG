import java.util.LinkedList;

public class CentreDeTable {

	protected static LinkedList<Tuiles> c;
	
	public CentreDeTable() {
		c = new LinkedList<Tuiles>();
	}
	
	public void createCentreDeTable() {
		for(int i=0;i<100;i++) {
			 c.add(i,new Tuiles());
		}
	}
	
	public static void addAtCenter(Tuiles[] a,String s) {
		for(int i=0;i<a.length;i++) {
			if(!a[i].couleur.equals(s) && c.size() ==0 && c.size()==0) {
				c.addLast(a[i]);
				} else {
					c.addLast(a[i]);
				}
			 if(!a[i].couleur.equals(s) && c.size() !=0) {
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
			for(int i =0;i<a.length;i++) {
				if(!a[i].couleur.equals(s)) {
				System.out.print( a[i].couleur + " " );
				} else {
				}
			}
			} 
		System.out.println();
		}
	
}

