import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Vue extends JPanel{
    
    protected static JButton jouer = new JButton("Jouer");
    protected static JButton rejouer = new JButton("Rejouer");
    protected static JButton quitter = new JButton("Quitter");
    protected JLabel label1,label2,label3;
    

    public Vue(){

    }


    public static void main(String[] args){
	Vue vue = new Vue();
    }

} 
