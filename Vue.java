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
	    this.setBackground(Color.GRAY);
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
	    this.add(this.label1);
	    this.add(this.jouer);
	    this.add(this.quitter);
	    
	}else if(Jeu.jeu.etat == Jeu.jeu.etat.PERDU){

	    this.setBackground(Color.GRAY);
	    this.label1 = new JLabel("VOUS AVEZ PERDU");
	    this.label2 = new JLabel("Votre score est de : ");
	    
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
	    this.setBackground(Color.GRAY);
	    this.label1 = new JLabel("VOUS AVEZ GAGNE");
	    this.label2 = new JLabel("Votre score est de : ");
	    
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
	}
    }

} 
