public interface Fabrique {
	
	/*En fonction du nombre de joueurs on trouve le
	 * nombre de fabriques necessaires pour jouer
	 */
	
	 int nbFabrique();
		
	
	/*
	 * Calcul en fonction de fabriques, le nombre 
	 * de joueurs qu'il y a 
	 */
	 int nbreJoueurs();	

	
	/*Les fabriques sont alors representes par des tableaux de tuiles
	 * qui representent les tuiles R,J,B,N,BL respectivement : rouges
	 * jaunes, bleues, noires et blanches
	 * */
	
	 void createFabrique();
	
	/*Permet de d�terminer le nombre de tuiles
	 * a utiliser au cours d une manche
	 * pour pouvoir savoir le nombre de tuiles � distribuer dans une manche.
	 */
	 int nombreDeTuilesAPlacer();
	
	 /*
	  * On remplit au pr�alable la liste de tableaux de tuiles de 
	  * tuiles vides afin de ne pas avoir d'erreurs � la compilation par rapport 
	  * � l'instanciation
	  */
	 void remplissage();
	
	
	public void addPlayers();
	
	/*Apres avoir trouve le nombre de fabriques necessaires, on choisit aleatoirement 
	 * le nom du premier joueur en se servant de firstIndice()
	 */
	public String firstPlayer();
	
	
	/*
	 * Indique aleatoirement un indice dans la liste 
	 * qui sera celui du premier joueur
	 */
	public int firstIndice();
	
	/*
	 * Comme son nom l'indique, cette fonction est celle qui permet � un 
	 * quelconque joueur de choisir la tuile qu'il veut
	 */
	public void chooseTuile(String name);
	
	/*
	 * 
	 */
	public void search(String s,String name);
	
	
	
	public void resetColor(Tuiles[] a,String s);
	
	public void chooseTuileR(String s,String name);
	
	public void chooseTuileJ(String s,String name);
	
	public void chooseTuileB(String s, String name);
	
	public void chooseTuileN(String s, String name);
	
	public void chooseTuileBL(String s,String name);
		
	public void afficheApresChoixFirst();
	
	
	public void afficheApresChoix(String name,int indice);
	
		
}
