
public class TwoPlayers extends Fabrique {
	protected Manche manche = new Manche() ;
	
	public TwoPlayers() {
		super();
	}
	
	public int nbFabrique() {
		return super.nbFabrique();
	}
	
	public int nbreJoueurs() {	
		return super.nbreJoueurs();
	}
	
	public void createFabrique() {
		super.createFabrique();
	}
	
	public int nombreDeTuilesAPlacer() {
		return nbFabrique()*4;
	}
	
	/* Min + (Math.random() * (Max - Min))*/
	
	public void remplissage() {
		super.remplissage();
	}
	
	
	public void remplirFabrique() {
		super.remplirFabrique();
	}
	
	
	
	public void afficheApresNChoix() {
		int n = 1;
		int c = nbFabrique();
		String s = nextPlayer();
		while(n<=c) {
			afficheApresChoix(s,firstIndice);
			n++;
			s=nextPlayer();
		}
	}
	
	
	public String nextPlayer() {
		System.out.println(manche.liste.size());
		String s = "";
		int n = nbreJoueurs();
		int indice = firstIndice;
		if(n == 2 && indice ==1) { 
			System.out.println("Le prochain joueur sera " + manche.liste.get(0).nom);
			s = manche.liste.get(0).nom;
			firstIndice = 0;
		}else {
			//try{
			System.out.println("Le prochain joueur sera " + manche.liste.get(1).nom);
			s = manche.liste.get(1).nom;
			firstIndice = 1;
			//}
			//catch(IndexOutOfBoundsException i) {
			System.out.println("Instance non définie");
			//}
		}
		System.out.println("Terminé");
		return s;
	}			
	
	public void afficheNextPlayer() {
		System.out.println(nextPlayer());
	}
	
	public void gameWithTwoPlayers() {
		remplirFabrique();
		System.out.println();
		System.out.println();
		afficheNextPlayer();
		manche.consignes();
		afficheApresChoixFirst();
		//afficheApresNChoix();
		/*try{System.out.println(nextPlayer());}
		catch(Exception e) {
			System.out.println("La fonction nextPlayer() ne marche pas");
		}*/
		System.out.println(manche.liste.size());
	}

}
