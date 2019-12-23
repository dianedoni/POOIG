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
