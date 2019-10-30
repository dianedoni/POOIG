import java.util.LinkedList;

public class Fabrique {
	protected LinkedList<Tuiles> centreDeTable;
	protected LinkedList<int[]> tableaux;
	protected Manche m;
	
	public Fabrique() {
		centreDeTable = new LinkedList<Tuiles>();
		createFabrique();
	}
	
	public int nbFabrique() {
		int n = 0;
		if(m.nbJoueurs == 2) {
			n = n + 5;
		}
		
		if(m.nbJoueurs == 3) {
			n = n + 7;
		}
		
		if(m.nbJoueurs == 4) {
			n = n + 9;
		}
		
		return n;
	}
	
	public void createFabrique() {
		int n = nbFabrique();
		if(n == 5) {
			for(int i=0;i<5;i++) {
				tableaux.add(i, new int[4]);
			}
	   } else if(n == 7) {
		   for(int i=0;i<7;i++) {
				tableaux.add(i, new int[4]);
			}
		} else {
			for(int i=0;i<9;i++) {
				tableaux.add(i, new int[4]);
			}
		}
	}
	
	
}
