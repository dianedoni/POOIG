import java.util.LinkedList;
import java.util.Scanner;

public class CentreDeTable {

	protected static LinkedList<Tuiles> c;
	protected static Tuiles[]b;
	protected static Tuiles[]temp;
	protected static String  yesOrNo;
	protected static String choixTuileAuCentreDeTable;
	protected static int nbreTuilesChoisies;
	
	public CentreDeTable() {
		c = new LinkedList<Tuiles>();
	}
	
	
	public static void addAtCenter(Tuiles[] a,String s) {
		for(int i=0;i<a.length;i++) {
			a[i].findFirstColor();
			if(!a[i].couleur.equals(s)) {
				c.addLast(a[i]);
				} else {
					nbreTuilesChoisies++;
				}
		}
		System.out.println("Ce tour, " + nbreTuilesChoisies + " tuiles. seront placés dans le centre de table");
	}
	
	public static String getYesOrNo() {
		String s="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Vous etes sur de votre choix? ");
		s = sc.nextLine();
		yesOrNo = s;
		return yesOrNo;
	}
	
	public static void afficheCentreDeTable(Tuiles[] a,String s) {
		addAtCenter(a,s);
		if(c.size() == 0) {
			System.out.println("Le centre de table est vide");
		}else {
			System.out.print("Le centre de table est compose des tuiles suivantes : ");
			for(int i =0;i<c.size();i++) {
				c.get(i).findFirstColor();
				System.out.print(c.get(i).couleur + " " );
				c.get(i).setColor("V");
			}
		} 	
		System.out.println();
		triSelection();
		System.out.print("Voici le centre de table triee : ");
		for(int i =0;i<c.size();i++) {
			
			c.get(i).findFirstColor();
			System.out.print(c.get(i).couleur + " " );
			c.get(i).setColor("V");
		}
		System.out.println();
	}

	public static void choix() {
		String s="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez les tuiles qui vous conviennent dans le centre de table");
		s = sc.nextLine();
		String ch = String.valueOf(s.charAt(0)); 
		choixTuileAuCentreDeTable = ch;
		c.get(0).findFirstColor();
			
		searchToSuppress(c.get(0),ch);
		
		System.out.print("Le centre de table est desormais constitue de:");
		
		triSelection();
		System.out.print("Voici le centre de table triee : ");
		for(int i =0;i<c.size();i++) {
			c.get(i).findFirstColor();
			System.out.print(c.get(i).couleur + " " );
			c.get(i).setColor("V");
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
	
	public static int searchForTri(LinkedList<Tuiles> l,int i) {
		int m = i;
		int j = i + 1;
		while(j<l.size()) {
			if(l.get(i).nbre == l.get(m).nbre) {
				m = j;
			}
			j++;
		}
		return m;
	}
	
	public static void echange(LinkedList<Tuiles> l,int i,int j) {
		int x = l.get(i).nbre;
		l.get(i).nbre = l.get(j).nbre;
		l.get(j).nbre = x;	 
	}
	
	public static void triSelection() {
		int i = 0;
		while(i<c.size()) {
			int m = searchForTri(c,i);
			echange(c,i,m);
			i++;
		}
	}
	
	public static void searchToSuppress(Tuiles a,String s) {
		int i=0;
		if(c.size() == 0) {
			System.out.println("Le centre de table est vide");
		} else  {
		while(i<c.size()) {
			if(a.couleur.equals(s)) {
				c.remove(i);
				}
			i++;
			}
		}
	}
}

