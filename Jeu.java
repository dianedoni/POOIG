
import javax.swing.*;
import java.util.*;

public class Jeu {

	protected static JeuVue jeu;
	protected static JFrame fenetre;

	

    public static void choix(){

	System.out.println("Souhaitez-vous jouer en textuel ou en interface graphique ?\n1 - textuel\n2 - interface graphique");

	Scanner sc = new Scanner(System.in);
	try{
	    int tmp = sc.nextInt();
	    if(tmp == 1){

		Manche m = new Manche();
		m.commence();


	    }else if(tmp == 2){
		nb_joueurs();
		nom_joueurs();
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
	}catch(InputMismatchException e){
	    System.out.println("Veuillez saisir soit 1 soit 2");
	    choix();
	}
    }


    public static void nom_joueurs(){
	for(int i=0;i<JeuVue.nb_joueurs;i++) {
	    System.out.println("Le nom du joueur " + (i+1) + " est: ");
	    Scanner sc = new Scanner(System.in);
	    JeuVue.joueurs.add(new PlayerVue(sc.nextLine()));
	    System.out.println(JeuVue.joueurs.get(i).prenom);
	}
    }
    
	
    public static void nb_joueurs(){
	System.out.println("Combien de joueurs etes-vous ?");
	Scanner sc = new Scanner(System.in);
	try{
	    JeuVue.nb_joueurs = sc.nextInt();
	    if(JeuVue.nb_joueurs <2 ||JeuVue.nb_joueurs >4 ){
		System.out.println("Veuillez saisir un entier entre 2 et 4");
		nb_joueurs();
	    }
        }catch(InputMismatchException e){
	    System.out.println("Veuillez saisir un entier compris entre 2 et 4");
	    nb_joueurs();
	}       
    }
    
	

    public static void main(String[] args) {
	choix();		
    }
}
