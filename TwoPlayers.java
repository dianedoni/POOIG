public class TwoPlayers extends CommonToAllPlayers{
		
	
	public void remplirFabrique() {
		System.out.println();
		System.out.println("On dispose des fabriques suivantes");
		remplissage();
		for(int i=0;i<nbFabrique();i++) {
			System.out.print( i + "     ");
			for(int j=0;j<4;j++) {
				System.out.print(super.tableaux.get(i)[j].couleur + " ");
			}
			System.out.println();
			}
		System.out.println("Il reste " + (Manche.sac.tuiles.size()-1) + " tuiles dans le sac");
	}
	
	
	public String nextPlayer() {
		String s = "";
		int n = nbreJoueurs();
		int indice = firstIndice;
		if(n == 2 && indice == 1) { 
			System.out.println("Le prochain joueur sera " + manche.liste.get(0).nom);
			s = manche.liste.get(0).nom;
			firstIndice = 0;
		}else {
			try{
			System.out.println("Le prochain joueur sera " + manche.liste.get(1).nom);
			s = manche.liste.get(1).nom;
				firstIndice = 1;
			}
			catch(IndexOutOfBoundsException i) {
			System.out.println("Instance non définie");
			}
		}
		return s;
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
	
	
	public void gameWithTwoPlayers() {
		remplirFabrique();
		System.out.println();
		//System.out.println();
		manche.consignes();
		afficheApresChoixFirst();
		System.out.println();
		System.out.println("*****************************************************************************");
		System.out.println("Pour les prochains tours, vous pouvez à présent choisir des tuiles ");
		System.out.println("parmi celles du centre de table mais le premier qui s'y sert prend la tuile 1");
		System.out.println("*****************************************************************************");
		System.out.println();
		afficheApresNChoix();
	}

}
