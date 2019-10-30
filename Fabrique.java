import java.util.LinkedList;
import java.util.Random;

public class Fabrique {
	protected LinkedList<Tuiles> centreDeTable;
	protected LinkedList<int[]> tableaux;
	protected Manche m ;
	
	public Fabrique() {
		tableaux = new LinkedList<int[]>();
		centreDeTable = new LinkedList<Tuiles>();
		m = new Manche();
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
				tableaux.add(i, new int[4]);
			}
		}
			
	    if(n == 7) {
		   for(int i=0;i<7;i++) {
				tableaux.add(i, new int[4]);
			}
	    }
	    
		if(n == 9) {
			for(int i=0;i<9;i++) {
				tableaux.add(i, new int[4]);
			}
		}
		
	}
	
	/* Min + (Math.random() * (Max - Min))*/
	
	public void remplissage() {
		int n = nbFabrique();
		createFabrique();
		for(int i=0;i<n;i++) {
			tableaux.get(i);
			for(int j=0;j<4;j++) {
				tableaux.get(i)[j] = (int) (2 + (Math.random() * (6 - 2)));
			}
		}
	}
	
	public void afficheFabrique() {
		remplissage();
		for(int i=0;i<nbFabrique();i++) {
			tableaux.get(i);
			for(int j=0;j<4;j++) {
				System.out.print(tableaux.get(i)[j] + " " );
			}
			System.out.println();
		}
	}
	
	
}
