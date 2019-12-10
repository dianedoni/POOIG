import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Fabrique {
	protected LinkedList<Tuiles[]> tableaux;
	protected Manche m = new Manche() ;
	protected CentreDeTable centre;
	
	
	public Fabrique() {
		tableaux = new LinkedList<Tuiles[]>(); 
		centre = new CentreDeTable();
	}
	
	/*En fonction du nombre de joueurs on trouve le
	 * nombre de fabriques necessaires pour jouer
	 */
	
	public int nbFabrique() {
		int n = 0;
		if(m.n == 2) { n = n + 5; }
		
		if(m.n == 3) { n = n + 7; }
		
		if(m.n == 4) { n = n + 9; }
		
		return n;
	}
	
	/*
	 * Calcul en fonction de fabriques, le nombre 
	 * de joueurs qu'il y a 
	 */
	public int nbreJoueurs() {
		
		int n = 0;
		if(nbFabrique() == 5) {
			n = n + 2;
		}
		
		if(nbFabrique() == 7) {
			n = n + 3;
		}
		
		if(nbFabrique() == 9) {
			n = n + 4;
		}
		return n;
	}
	
	/*Les fabriques sont alors representes par des tableaux de tuiles
	 * qui representent les tuiles R,J,B,N,BL respectivement : rouges
	 * jaunes, bleues, noires et blanches
	 * */
	
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
	
	/*Permet de déterminer le nombre de tuiles
	 * a utiliser au cours d une manche
	 * pour pouvoir savoir le nombre de tuiles à distribuer dans une manche.
	 */
	public int nombreDeTuilesAPlacer() {
		return nbFabrique()*4;
		
	}
	
	/* Min + (Math.random() * (Max - Min))*/
	
	public void remplissage() {
		int n = nbFabrique(); // trouvons le nombre de fabrique
		createFabrique(); // Ensuite, on crée des fabriques vides qu'on va remplir
		int e = 100; 
		int c = 0;
		int b = 0;
		String s = "";
		if(m.sac.tuiles.size() == 101) {
			for(int a=1;a<nombreDeTuilesAPlacer()+1;a++) {	
				for(int i=0;i<n;i++) {	
					for(int j=0;j<4;j++) {
						c = (int) (1+(Math.random() * (e)));
						tableaux.get(i)[j] = new Tuiles(s,b,c);
						tableaux.get(i)[j].setNbre(m.sac.numTuile(m.sac.tuiles.get(c).pos));
						b = tableaux.get(i)[j].nbre;
						tableaux.get(i)[j].findColor(tableaux.get(i)[j].nbre);
						s = tableaux.get(i)[j].couleur;
						
					}
					
				}
				e--;
				m.sac.remove(c);
			}
		} else {
			e = 100 - nombreDeTuilesAPlacer();
			for(int a=1;a<nombreDeTuilesAPlacer()+1;a++) {	
				for(int i=0;i<n;i++) {	
					for(int j=0;j<4;j++) {
						c = (int) (1+(Math.random() * (e)));
						m.sac.tuiles.get(a).setPos(c);
						tableaux.get(i)[j] = new Tuiles();
						tableaux.get(i)[j].setNbre(m.sac.numTuile(m.sac.tuiles.get(c).pos));
						tableaux.get(i)[j].findColor(tableaux.get(i)[j].nbre);	
					}
				}
				e--;
				m.sac.remove(c);
			}
		}
	}
	
	
	public void remplirFabrique() {
		if(m.nbJoueurCorrect()) {
		m.addPlayers();
		System.out.println();
		System.out.println("On dispose les fabriques suivantes");
		remplissage();
		for(int i=0;i<nbFabrique();i++) {
			System.out.print( i + "     ");
			for(int j=0;j<4;j++) {
				System.out.print(tableaux.get(i)[j].couleur + " ");
			}
			System.out.println();
			}
		System.out.println("Il reste " + (m.sac.tuiles.size()-1) + " tuiles dans le sac");
		} else {
			while(!m.nbJoueurCorrect()) {
			m.doNotAddPlayers();
			}
			remplirFabrique();	
		}
	}
	
	
	/*Apres avoir trouve le nombre de fabriques necessaires, on choisit aleatoirement 
	 * le nom du premier joueur
	 */
	public String firstPlayer() {
		System.out.println();
		int a = (int)((Math.random() * (m.n)));
		return m.liste.get(a).nom;
		
	}
	
	public void chooseTuile(String n) {
		System.out.println("Entrez votre choix " + n + ":");
		Scanner sc = new Scanner(System.in);
		String s = "";
		s = sc.nextLine();
		
		if(s.charAt(1) == 'R') {
			chooseTuileR(s);
		}
		
		if(s.charAt(1) == 'J') {
			chooseTuileJ(s);
		}
		
		if(s.charAt(1) == 'B' && s.charAt(2) != 'L' ) {
			chooseTuileB(s);
		}
		
		if(s.charAt(1) == 'N') {
			chooseTuileN(s);
		}
		
		if(s.charAt(1) == 'B' && s.charAt(2) == 'L') {
			chooseTuileBL(s);
		}
		
	}
	
	
	
	public void search(String s) {
		int c = Character.getNumericValue( s.charAt(0));
		String ch = String.valueOf(s.charAt(1));
		centre.affiche(tableaux.get(c),ch);
		this.resetColor(tableaux.get(c),ch);
	}
	
	
	public void resetColor(Tuiles[] a,String s) {
		for(int i=0;i<a.length;i++) {
			if(a[i].couleur == s) {
				a[i].setColor("vide");
			}
		}
	}
	
	public void chooseTuileR(String s) {
		System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) R");
		search(s);
	}
	
	public void chooseTuileJ(String s) {	
		System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) J");
		search(s);
	}
	
	
	public void chooseTuileB(String s) {
		System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) B");
		search(s);
	}
	
	
	public void chooseTuileN(String s) {
		System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) N");
		search(s);
	}
	
	public void chooseTuileBL(String s) {
		System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) BL");
		int c = Character.getNumericValue( s.charAt(0));
		Tuiles a = new Tuiles();
		String ch = String.valueOf(s.charAt(1));
		String h = ch + String.valueOf(s.charAt(2));
		//int c2 = Character.getNumericValue(s.charAt(2));
		int c3 = Character.getNumericValue(s.charAt(3));
		System.out.println(ch);
		System.out.println(h);
			for(int i=0;i<4;i++) {
				if(tableaux.get(c)[i].findColor2(c3) == ch ) {
					a = tableaux.get(c)[i];
					centre.addAtCenter(tableaux.get(c),ch);
					this.resetColor(tableaux.get(c),ch);
				}
			}
		}	
	
	
	public void afficheFApresChoix() {
		String first = firstPlayer();
		System.out.println("Le premier joueur sera " + first);
		chooseTuile(first);
		for(int i=0;i<tableaux.size();i++) {
			System.out.print( i + "     ");
			for(int j=0;j<tableaux.get(i).length;j++) {
				System.out.print(tableaux.get(i)[j].couleur + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
		
	
}
