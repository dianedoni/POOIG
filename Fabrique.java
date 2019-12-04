import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Fabrique {
	protected LinkedList<Tuiles> centreDeTable = new LinkedList<>();
	protected LinkedList<Tuiles[]> tableaux;
	protected Manche m = new Manche() ;
	
	
	public Fabrique() {
		tableaux = new LinkedList<Tuiles[]>();
	}
	
	/*En fonction du nombre de joueurs on trouvele
	 * nombre de fabriques necessaires pour jouer
	 */
	
	public int nbFabrique() {
		int n = 0;
		if(m.n == 2) {
			n = n + 5;
		}
		
		if(m.n == 3) {
			n = n + 7;
		}
		
		if(m.n == 4) {
			n = n + 9;
		}
		
		return n;
	}
	
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
	
	/*Les fabriques sont alors representes par des tableaux d entiers
	 * qui representent les tuiles 2,3,4,5,6 respectivement : rouges
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
	 * pour pouvoir 
	 */
	public int nombreDeTuilesAPlacer() {
		return nbFabrique()*4;
		
	}
	
	/* Min + (Math.random() * (Max - Min))*/
	
	public void remplissage(Sac s) {
		int n = nbFabrique(); // trouvons le nombre de fabrique
		createFabrique(); // Ensuite, on crée des fabriques
		int e = 100;
		int c = 0;
		if(s.tuiles.size() == 101) {
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
		System.out.println("On dispose des fabriques suivantes");
		remplissage(m.sac);
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
		int a = (int)(1+(Math.random() * (m.n-1)));
		return m.liste.get(a).nom;
		
	}
	
	public void chooseTuile(String n) {
		System.out.println("Entrez votre choix " + n + ":");
		Scanner sc = new Scanner(System.in);
		//String a = "";
		String s = "";
		s = sc.nextLine();
		if(s.charAt(1) == 'R') {
			System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) R");
			for(int i=0;i<nbFabrique();i++) {
				for(int j=0;j<4;j++) {
					if(tableaux.get(i)[j].findColor2(s.charAt(2)) == "R" && i == s.charAt(0)) {
						centreDeTable.add(tableaux.get(i)[j]);
						tableaux.get(i)[j].setColor("vide");
					}
				}
			}
		}
		
		
		if(s.charAt(1) == 'J') {
			System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) J");
			for(int i=0;i<nbFabrique();i++) {
				for(int j=0;j<4;j++) {
					if(tableaux.get(i)[j].findColor2(s.charAt(2)) == "J" && i == s.charAt(0)) {
						centreDeTable.add(tableaux.get(i)[j]);
						tableaux.get(i)[j].setColor("vide");
					}
				}
			}
		}
		
		
		
		if(s.charAt(1) == 'B' && s.charAt(2) != 'L' ) {
			System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) B");
			for(int i=0;i<nbFabrique();i++) {
				for(int j=0;j<4;j++) {
					if(tableaux.get(i)[j].findColor2(s.charAt(2)) == "B" && i == s.charAt(0)) {
						centreDeTable.add(tableaux.get(i)[j]);
						tableaux.get(i)[j].setColor("vide");
					}
				}
			}
		}
		
		if(s.charAt(1) == 'N') {
			System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) N");
			for(int i=0;i<nbFabrique();i++) {
				for(int j=0;j<4;j++) {
					if(tableaux.get(i)[j].findColor2(s.charAt(2)) == "N" && i == s.charAt(0)) {
						centreDeTable.add(tableaux.get(i)[j]);
						tableaux.get(i)[j].setColor("vide");
					}
				}
			}
		}
		
		if(s.charAt(1) == 'B' && s.charAt(2) == 'L') {
			System.out.println("Vous avez choisi la fabrique " + s.charAt(0) + " et la/les tuile(s) BL");
			for(int i=0;i<nbFabrique();i++) {
				for(int j=0;j<4;j++) {
					if(tableaux.get(i)[j].findColor2(s.charAt(3)) == "BL" && i == s.charAt(0)) {
						centreDeTable.add(tableaux.get(i)[j]);
						tableaux.get(i)[j].setColor("vide");			
					}
				}
			}
		}			
	}
	
	public void afficheFApresChoix() {
		String first = firstPlayer();
		chooseTuile(first);
		for(int i=0;i<nbFabrique();i++) {
			System.out.print( i + "     ");
			for(int j=0;j<4;j++) {
				System.out.print(tableaux.get(i)[j].couleur + " ");
			}
			System.out.println();
		}
	}
	
}
