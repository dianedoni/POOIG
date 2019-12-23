import javax.swing.*;
import java.util.*;
public class Jeu {
	protected static Vue vue;
	protected static JeuVue jeu;
	protected static JFrame fenetre;
	
	
	public static void choix(){
	System.out.println("Souhaitez-vous jouer en textuel ou en interface graphique ?\n1 - textuel \n 2 - interface graphique");
		Scanner sc = new Scanner(System.in);
		int tmp = sc.nextInt();
		if(tmp == 1){
		Manche m = new Manche();
		m.commence();
		/*CentreDeTable c = 	new CentreDeTable();
		Tuiles [] a = {new Tuiles(),new Tuiles(),new Tuiles(),new Tuiles()};
		a[0].couleur = "R";
		a[1].couleur = "B";
		a[2].couleur = "J";
		a[3].couleur = "R";
		
		Tuiles [] b = {new Tuiles(),new Tuiles(),new Tuiles(),new Tuiles()};
		b[0].couleur = "N";
		b[1].couleur = "R";
		b[2].couleur = "N";
		b[3].couleur = "B";
		
		CentreDeTable.afficheCentreDeTable(a,"R");
		CentreDeTable.afficheCentreDeTable(b,"N");
		System.out.println("La taille de centre de table est :" + CentreDeTable.c.size());
		*/
		}else if(tmp == 2){
		this.fenetre = new Frame("Azul");
		this.fenetre.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
		this.fenetre.setSize(800,800);
		this.fenetre.setResizable(true);
		this.fenetre.setLocationRelativeTo(null);
		}else{
		System.out.println("Veuillez saisir une donnee coherente");
		choix();
		}
	}
	
	
	public static void main(String[] args) {
		choix();
		
	}
	
	
}
