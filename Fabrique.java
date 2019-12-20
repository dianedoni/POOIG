import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

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
	
	/*Permet de déterminer le nombre de tuiles
	 * a utiliser au cours d une manche
	 * pour pouvoir savoir le nombre de tuiles à distribuer dans une manche.
	 */
	 int nombreDeTuilesAPlacer();
	
	/* Min + (Math.random() * (Max - Min))*/
	 void remplissage();
	
	
	public void remplirFabrique();
	
	/*Apres avoir trouve le nombre de fabriques necessaires, on choisit aleatoirement 
	 * le nom du premier joueur
	 */
	public String firstPlayer();
	
	public int firstIndice();
	
	public void chooseTuile(String name);
	
	
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
