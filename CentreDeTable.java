import java.util.LinkedList;
import java.util.Scanner;

public class CentreDeTable {

	protected static LinkedList<Tuiles> c;
	protected static Tuiles[]b;
	protected static Tuiles[]temp;
	protected static String  yesOrNo;
	
	public CentreDeTable() {
		c = new LinkedList<Tuiles>();
		c.add(0, new Tuiles());
		c.get(0).couleur = "1";
	}
	
	
	public static void addAtCenter(Tuiles[] a,String s) {
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
			System.out.print("Le centre de table est compose des tuiles suivantes : ");
			for(int i =0;i<c.size();i++) {
				if(c.get(i).couleur.equals("V") ) {
					c.get(i).findFirstColor();
				}
				System.out.print( c.get(i).couleur + " " );
				c.get(i).setColor("V");
			}
			
		} 
		System.out.println();
		}
	
	public static void choix() {
		String s="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez les tuiles qui vous conviennent dans le centre de table");
		s = sc.nextLine();
		String ch = s;  
		int n = 0;
	
		for(int i=0;i<c.size();i++) {
			if(c.get(i).couleur.equals("1")){
				c.remove(i);
			}
		 }
		
		for(int i=0;i<c.size();i++) {
			if(ch.equals(c.get(i).couleur)) {
				c.remove(i);
			} else {
				c.get(i).findFirstColor();
			}
		}
		
		System.out.print("Le centre de table est desormais constitue de:");
		for(int i=0;i<c.size();i++) {
			System.out.print(c.get(i).couleur + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	public static void choixAuCentreDeTable() {
		String s="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous choisir dans le centre de table? Y/N");
		s = sc.nextLine();
		yesOrNo = s;
	}
}

