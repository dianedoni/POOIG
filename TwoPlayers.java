public class TwoPlayers extends CommonToAllPlayers{
		
	
	
	public String nextPlayer() {
		String s = "";
		int n = nbreJoueurs();
		int indice = firstIndice;
		if(n == 2 && indice == 1) { 
			System.out.println("Le prochain joueur sera " + manche.liste.get(0).nom);
			s = manche.liste.get(0).nom;
			firstIndice = 0;
			CommonToAllPlayers.indice = firstIndice;
		}else {
			System.out.println("Le prochain joueur sera " + manche.liste.get(1).nom);
			s = manche.liste.get(1).nom;
			firstIndice = 1;
			CommonToAllPlayers.indice = firstIndice;
		}
		return s;
	}		
	
	
	public void afficheApresNChoix() {
		int n = 1;
		int c = nbFabrique();
		String s = nextPlayer();
		while(CentreDeTable.c.size() != 0 && n<c) {
			CentreDeTable.choixAuCentreDeTable();
			while(!CentreDeTable.yesOrNo.equals("Y") && !CentreDeTable.yesOrNo.equals("N") ) {		
					System.out.println("Entree invalide!");
					System.out.println("On recommmence. Maintenant, entrez Y ou N");
					CentreDeTable.choixAuCentreDeTable();
			}

			if(CentreDeTable.yesOrNo.equals("N")) {
				afficheApresChoix(s,firstIndice);
				s=nextPlayer();
		} else {
			CentreDeTable.choix();
			manche.plateaux.get(indice).afficheApresChoix(s,indice);
			s=nextPlayer();
		}
		}
		 System.out.println("Fin de la manche " + tour);
		 tour++;
	}
	
	public void jouerManchesEnBoucleWith2Players() {
		remplirFabrique();
		System.out.println();
		manche.consignes();
		afficheApresChoixFirst();
		System.out.println();
		System.out.println("*****************************************************************************");
		System.out.println("Pour les prochains tours, vous pouvez a present choisir des tuiles ");
		System.out.println("parmi celles du centre de table mais le premier qui s'y sert prend la tuile 1");
		System.out.println("*****************************************************************************");
		System.out.println();
		afficheApresNChoix();
		
		while(Manche.sac.tuiles.size()!=0) {
			remplirFabrique();
			System.out.println();
			afficheApresChoixFirst();
			afficheApresNChoix();
		}
	}
	
	
	public void gameWithTwoPlayers() {
		jouerManchesEnBoucleWith2Players();
		System.out.println("************PARTIE TERMINEE!****************");
	}

}
