import java.util.LinkedList;
import java.util.Scanner;

public class CommonToAllPlayers implements Fabrique{
	protected LinkedList<Tuiles[]> tableaux;
	protected static Manche manche = new Manche() ;
	protected static CentreDeTable centre;
	protected String nameFirstPlayer;
	protected static int firstIndice;
	protected static int indice;
	protected static int tour=1;
	
	
	public CommonToAllPlayers() {
		tableaux = new LinkedList<Tuiles[]>(); 
		centre = new CentreDeTable();
	}
	
	public int nbFabrique() {
		int n = 0;
		if(Manche.n == 2) { n = n + 5; }
		
		if(Manche.n == 3) { n = n + 7; }
		
		if(Manche.n == 4) { n = n + 9; }
		
		return n;
	}
	
	public int nbreJoueurs() {	
		int n = 0;
		if(nbFabrique() == 5) {	n = n + 2;}
		
		if(nbFabrique() == 7) {	n = n + 3;}
		
		if(nbFabrique() == 9) {	n = n + 4;}
		return n;
	}
	
	public void createFabrique() {
		int n = nbFabrique();
		if(n == 5) {
			for(int i=0;i<5;i++) {
				tableaux.add(i, new Tuiles[4]);
			}
		}	
	    if(n == 7) {
		   for(int i=0;i<7;i++) {
				tableaux.add(i, new Tuiles[4]);
			}
	    }
		if(n == 9) {
			for(int i=0;i<9;i++) {
				tableaux.add(i, new Tuiles[4]);
			}
		}
	}
	
	public int nombreDeTuilesAPlacer() {
		return nbFabrique()*4;
	}
	
	/* Min + (Math.random() * (Max - Min))*/
	
	public void remplissage() {
		int n = nbFabrique(); // trouvons le nombre de fabrique
		createFabrique(); // Ensuite, on cree des fabriques vides qu'on va remplir
		int e = 100; 
		int c = 0;
		int b = 0;
		String s = "";
		if(Manche.sac.tuiles.size() == 101) {
			for(int a=1;a<nombreDeTuilesAPlacer()+1;a++) {	
				for(int i=0;i<n;i++) {	
					for(int j=0;j<4;j++) {
						c = (int) (1+(Math.random() * (e)));
						tableaux.get(i)[j] = new Tuiles(s,b,c);
						tableaux.get(i)[j].setNbre(Manche.sac.numTuile(Manche.sac.tuiles.get(c).pos));
						b = tableaux.get(i)[j].nbre;
						tableaux.get(i)[j].findColor(tableaux.get(i)[j].nbre);
						s = tableaux.get(i)[j].couleur;	
					}
				}
				e--;
				Manche.sac.remove(c);
			}
		} else {
			e = 100 - nombreDeTuilesAPlacer();
			for(int a=1;a<nombreDeTuilesAPlacer()+1;a++) {	
				for(int i=0;i<n;i++) {	
					for(int j=0;j<4;j++) {
						c = (int) (1+(Math.random() * (e)));
						Manche.sac.tuiles.get(a).setPos(c);
						tableaux.get(i)[j] = new Tuiles();
						tableaux.get(i)[j].setNbre(Manche.sac.numTuile(Manche.sac.tuiles.get(c).pos));
						tableaux.get(i)[j].findColor(tableaux.get(i)[j].nbre);	
					}
				}
				e--;
				Manche.sac.remove(c);
			}
		}
	}
	
	
	public void addPlayers() {
		manche.affichage();
		if(manche.nbJoueurCorrect()) {
			manche.addPlayers();
		} else {	
			while(!manche.nbJoueurCorrect()) {
			manche.doNotAddPlayers();
			}
			
		}
	}
	
	public String firstPlayer() {
		System.out.println();
		return nameFirstPlayer = manche.liste.get(firstIndice()).nom;
	}
	
	public int firstIndice() {
		 int a = (int)((Math.random() * (Manche.n)));
		 firstIndice = a;
		 return firstIndice;
	}
	
	public void chooseTuile(String name) {
		System.out.println("Entrez votre choix " + name + ":");
		Scanner sc = new Scanner(System.in);
		String s = "";
		s = sc.nextLine();
		if(s.charAt(1) == 'R') {
			chooseTuileR(s,name);
		}
		
		if(s.charAt(1) == 'J') {
			chooseTuileJ(s,name);
		}
		
		if(s.charAt(1) == 'B' && s.charAt(2) != 'L' ) {
			chooseTuileB(s,name);
		}
		
		if(s.charAt(1) == 'N') {
			chooseTuileN(s,name);
		}
		
		if(s.charAt(1) == 'W') {
			chooseTuileW(s,name);
		}
		
	}
	
	
	public void search(String s,String name) {
		int c = Character.getNumericValue(s.charAt(0));
		String ch = String.valueOf(s.charAt(1));
		if(nameFirstPlayer.equals(name)) {
		manche.liste.get(firstIndice).afficheMosaique(tableaux.get(c),ch,nameFirstPlayer);
		CentreDeTable.afficheCentreDeTable(tableaux.get(c),ch);
		this.resetColor(tableaux.get(c),ch);
		System.out.println();
		} else {
			manche.liste.get(firstIndice).afficheMosaique(tableaux.get(c),ch,name);
			CentreDeTable.afficheCentreDeTable(tableaux.get(c),ch);
			this.resetColor(tableaux.get(c),ch);
			System.out.println();
		}
	}
	
	
	
	public void resetColor(Tuiles[] a,String s) {
		for(int i=0;i<a.length;i++) {
			a[i].setColor("V");
		}
	}
	
	public void chooseTuileR(String s,String name) {
		System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) R");
		System.out.println();
			search(s,name);
	}
	
	public void chooseTuileJ(String s,String name) {	
		System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) J");
		System.out.println();
		search(s,name);
	}
	
	public void chooseTuileB(String s, String name) {
		System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) B");
		System.out.println();
		search(s,name);
	}
	
	public void chooseTuileN(String s, String name) {
		System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) N");
		System.out.println();
		search(s,name);
		
	}
	
	public void chooseTuileW(String s,String name) {
		System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) W");
		System.out.println();
		search(s,name);
	}
	
	public void afficheApresChoixFirst() {
		nameFirstPlayer = firstPlayer();
		System.out.println("Le premier joueur sera " +  nameFirstPlayer);
		chooseTuile(nameFirstPlayer);
		System.out.println("Manche " + tour);
		for(int i=0;i<tableaux.size();i++) {
			System.out.print( i + "     ");
			for(int j=0;j<tableaux.get(i).length;j++) {
				System.out.print(tableaux.get(i)[j].couleur + " ");
			}
			System.out.println();
		}
		System.out.println();
		manche.attributionPlateaux();
		System.out.print(nameFirstPlayer + " ");
		manche.plateaux.get(firstIndice).afficheApresChoix(manche.plateaux.get(firstIndice).ligneChoisie,
		manche.liste.get(firstIndice).tuileChoisie,manche.liste.get(firstIndice).nbreTuilesChoisies);
	}
	
	public void afficheApresChoix(String name,int indice) {
		chooseTuile(name);
		System.out.println("Manche " + tour);
		for(int i=0;i<tableaux.size();i++) {
			System.out.print( i + "     ");
			for(int j=0;j<tableaux.get(i).length;j++) {
				System.out.print(tableaux.get(i)[j].couleur + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print(name + " ");
		manche.plateaux.get(indice).afficheApresChoix(manche.plateaux.get(indice).ligneChoisie,
		manche.liste.get(indice).tuileChoisie,manche.liste.get(indice).nbreTuilesChoisies);
		tour++;
	}
	
	

}
