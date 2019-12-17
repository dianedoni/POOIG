
public class TwoPlayers extends Fabrique {
	
	
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
		String s = "";
		int n = nbreJoueurs();
		int indice = firstIndice;
		if(n == 2 && indice !=1) { 
			System.out.println("Le prochain joueur sera " + manche.liste.get(1).nom);
			s = manche.liste.get(1).nom;
			firstIndice = 1;
		}else {
			System.out.println("Le prochain joueur sera " + manche.liste.get(0).nom); 
			s = manche.liste.get(0).nom;
			firstIndice = 0;
		}
		return s;
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
		manche.plateaux.get(indice).placerTuile(manche.plateaux.get(indice).ligneChoisie,
		manche.liste.get(indice).tuileChoisie,manche.liste.get(indice).nbreTuilesChoisies);
		tour++;
	}
	
	public void gameWithTwoPlayers() {
		remplirFabrique();
		System.out.println();
		System.out.println();
		manche.consignes();
		afficheApresChoixFirst();
		afficheApresNChoix();
		System.out.println();
	}

}
