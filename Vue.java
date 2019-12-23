<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Vue extends JPanel{
    
    protected static JButton jouer = new JButton("Jouer");
    protected static JButton rejouer = new JButton("Rejouer");
    protected static JButton quitter = new JButton("Quitter");
    protected JLabel label1,label2;
    

    public Vue(){
	
	if(Jeu.jeu.etat == Jeu.jeu.etat.MENU){
	    this.setBackground(Color.grey);
	    this.label1 = new JLabel("MENU");

	    this.jouer.addActionListener(new ActionListener(){

		    public void actionPerformed(ActionEvent clic){
			if(clic.getSource() == jouer){

			    Jeu.fenetre.dispose();
			    Jeu.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    Jeu.fenetre.setSize(800,800);
			    Jeu.fenetre.setResizable(true);
			    Jeu.fenetre.setLocationRelativeTo(null);
			    Jeu.jeu = new JeuVue();
			    Jeu.jeu.etat = Jeu.jeu.etat.JEU;
			    Jeu.fenetre.setContentPane(Jeu.jeu);
			    Jeu.fenetre.repaint();
			    Jeu.fenetre.revalidate();
			    Jeu.fenetre.setVisible(true);
			}
		    }
		});
	    this.quitter.addActionListener(new ActionListener(){

		    public void actionPerformed(ActionEvent clic){
			if(clic.getSource() == quitter){
			    System.exit(0);
			}
		    }
		});
	    this.add(this.label);
	    this.add(this.jouer);
	    this.add(this.quitter);
	    
	}else if(Jeu.jeu.etat == Jeu.jeu.etat.PERDU){

	    this.setBackground(Color.grey);
	    this.label1 = new JLabel("VOUS AVEZ PERDU");
	    this.label2 = new Jlabel("Votre score est de : ");
	    
	    this.rejouer.addActionListener(new ActionListener(){

		    public void actionPerformed(ActionEvent clic){
			if(clic.getSource() == rejouer){

			    Jeu.jeu.etat = Jeu.jeu.etat.MENU;
			    Jeu.fenetre.dispose();
			    Jeu.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    Jeu.fenetre.setSize(800,800);
			    Jeu.fenetre.setResizable(true);
			    Jeu.fenetre.setLocationRelativeTo(null);
			    Jeu.fenetre.setContentPane(new Vue());
			    Jeu.fenetre.repaint();
			    Jeu.fenetre.revalidate();
			    Jeu.fenetre.setVisible(true);
			}
		    }
		});
	    
	    this.quitter.addActionListener(new ActionListener(){

		    public void actionPerformed(ActionEvent clic){
			if(clic.getSource() == quitter){
			    System.exit(0);
			}
		    }
		});
	    this.add(this.label1);
	    this.add(this.label2);
	    this.add(this.rejouer);
	    this.add(this.quitter);
	    
	}else if(Jeu.jeu.etat == Jeu.jeu.etat.GAGNE){
	     this.setBackground(Color.grey);
	    this.label1 = new JLabel("VOUS AVEZ GAGNE");
	     this.label2 = new JLabel("Votre score est de : ");
	    
	    this.rejouer.addActionListener(new ActionListener(){

		    public void actionPerformed(ActionEvent clic){
			if(clic.getSource() == rejouer){

			    JEu.jeu.etat = Jeu.jeu.etat.MENU;
			    Jeu.fenetre.dispose();
			    Jeu.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    Jeu.fenetre.setSize(800,800);
			    Jeu.fenetre.setResizable(true);
			    Jeu.fenetre.setLocationRelativeTo(null);
			    Jeu.fenetre.setContentPane(new Vue());
			    Jeu.fenetre.repaint();
			    Jeu.fenetre.revalidate();
			    Jeu.fenetre.setVisible(true);
			}
		    }
		});
	    this.quitter.addActionListener(new ActionListener(){

		    public void actionPerformed(ActionEvent clic){
			if(clic.getSource() == quitter){
			    System.exit(0);
			}
		    }
		});
	    this.add(this.label1);
	    this.add(this.label2);
	    this.add(this.rejouer);
	    this.add(this.quitter);
	}
    }

} 
=======
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Vue extends JFrame implements ActionListener{
protected JPanel pan;
protected static JButton jouer,recommencer,quitter;

public Vue(){
this.setTitle("Azul");
this.pan = new JPanel();
this.jouer = new JButton("Jouer");
this.recommencer = new JButton("Recommencer");
this.quitter = new JButton("Quitter");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(800,800);
this.setResizable(true);
this.setLocationRelativeTo(null);
this.pan.add(jouer);
this.pan.add(recommencer);
this.pan.add(quitter);
this.setContentPane(pan);
this.setVisible(true);
}


public static void main(String[] args){
Vue vue = new Vue();
}

public void actionPerformed(ActionEvent clic){

}

} 
>>>>>>> 295cb416269d035911207f7707e94ee316839d87
