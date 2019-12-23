
public class FourPlayers extends CommonToAllPlayers{
	
	public void remplirFabrique() {
		System.out.println();
		System.out.println("On dispose des fabriques suivantes");
		remplissage();
		for(int i=0;i<nbFabrique();i++) {
			System.out.print( i + "     ");
			for(int j=0;j<4;j++) {
				System.out.print(tableaux.get(i)[j].couleur + " ");
			}
			System.out.println();
			}
		System.out.println("Il reste " + (Manche.sac.tuiles.size()-1) + " tuiles dans le sac");
	}
	
	public String nextPlayer() {
		String s = "";
		int nb = nbreJoueurs();
		int indice = firstIndice;
		if(nb == 4 && indice == 0) { 
			nb = nb - 3;
			System.out.println("Le prochain joueur sera " + manche.liste.get(nb).nom);
			s = manche.liste.get(nb).nom;
			firstIndice = nb;
		}
		if(nb == 4 && indice == 1) {
				nb = nb - 2;
				System.out.println("Le prochain joueur sera " + manche.liste.get(nb).nom);
				s = manche.liste.get(nb).nom;
				firstIndice = nb;
		}
		
		if( nb == 4 && indice == 2 ) {
			nb = nb - 1;
			System.out.println("Le prochain joueur sera " + manche.liste.get(nb).nom);
			s = manche.liste.get(nb).nom;
			firstIndice = nb;
		}
		
		if( nb == 4 && indice == 3 ) {
			nb = 0;
			System.out.println("Le prochain joueur sera " + manche.liste.get(nb).nom);
			s = manche.liste.get(nb).nom;
			firstIndice = nb;
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
	public void gameWithFourPlayers() {
		remplirFabrique();
		System.out.println();
		System.out.println();
		manche.consignes();
		afficheApresChoixFirst();
		System.out.println();
		System.out.println("*****************************************************************************");
		System.out.println("Pour les prochains tours, vous pouvez à présent choisir des tuiles ");
		System.out.println("parmi celles du centre de table mais le premier qui s'y sert prend la tuile 1");
		System.out.println("*****************************************************************************");
		System.out.println();
		afficheApresNChoix();
		System.out.println("Terminé");
	}

}
