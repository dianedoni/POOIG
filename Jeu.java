
import javax.swing.*;
import java.util.*;

public class Jeu {

	protected static JeuVue jeu;
	protected static JFrame fenetre;

	
    //gerer le cas ou ce ne serait pas un entier
	public static void choix(){

	System.out.println("Souhaitez-vous jouer en textuel ou en interface graphique ?\n1 - textuel\n2 - interface graphique");

		Scanner sc = new Scanner(System.in);
		int tmp = sc.nextInt();
		if(tmp == 1){

		Manche m = new Manche();
		m.commence();


		}else if(tmp == 2){

		fenetre = new JFrame("Azul");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1600,800);
		fenetre.setResizable(true);
		fenetre.setLocationRelativeTo(null);
		fenetre.setContentPane(new Vue());		
		fenetre.setVisible(true);
		

		}else{
		
		System.out.println("Veuillez saisir une donnee coherente");
		choix();
		}
	}

	

	

	public static void main(String[] args) {
		choix();		
	}
}
