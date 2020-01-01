import java.util.*;
import java.awt.*;
import javax.swing.*;
public class PlayerVue extends JPanel{ 
    protected String prenom;
    protected int id = -1;
    protected ScoreVue score;
    protected LignesMotifVue mesTuiles;
    protected DefausseVue defausse;
    protected MurVue mur;
    protected Image imgp;
    protected ImageIcon icop;

    public PlayerVue(String p){
	this.icop = new ImageIcon(getClass().getResource("Image/TuilesJoueur.png"));
	this.imgp = this.icop.getImage();
	this.prenom = p;
	this.id+=1;
	this.score = new ScoreVue();
	this.mesTuiles = new LignesMotifVue();
	this.defausse = new DefausseVue();
	this.mur = new MurVue();
    }


    public void affichePlayer(Graphics g){
	g.drawImage(this.imgp,100,50,null);
	g.drawString(this.prenom,100,30);
	g.drawString("Score : "+this.score.score,100,60);
	mesTuiles.afficheMotif(g);
	defausse.afficheDefausse(g);
	mur.afficheMur(g);
    }
  
}
