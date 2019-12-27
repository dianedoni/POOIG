import java.util.*;
public class PlayerVue{
    protected String prenom;
    protected int id = -1;
    protected ScoreVue score;
    protected LignesMotifVue mesTuiles;
    protected DefausseVue defausse;
    protected MurVue mur;

    public PlayerVue(String p){
	this.prenom = p;
	this.id+=1;
	this.score = new ScoreVue();
	this.mesTuiles = new LignesMotifVue();
	this.defausse = new DefausseVue();
	this.mur = new MurVue();
    }
    
  
}
