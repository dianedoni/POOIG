import java.util.LinkedList;

public class CentreDeTable {

	protected LinkedList<Tuiles> c;
	
	
	public CentreDeTable() {
		this.c = new LinkedList<Tuiles>();
	}
	
	public void createCentreDeTable() {
		for(int i=0;i<100;i++) {
			 this.c.add(i,new Tuiles());
		}
	}
	
	public void addAtCenter(Tuiles[] a,String s) {
		for(int i=0;i<a.length;i++) {
			if(!a[i].couleur.equals(s) && this.c.size() ==0) {
				this.c.add(0,a[i]);
			} else if(!a[i].couleur.equals(s) && this.c.size() !=0) {
				this.c.addLast(a[i]);
			} else {
			
			}
		}
	}
	
	public void afficheCentreDeTable(Tuiles[] a,String s) {
		addAtCenter(a,s);
		if(this.c.size() == 0) {
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

