import java.util.*;
public class PlayerVue{
    protected String prenom;
    protected int id = -1;
    protected ScoreVue score;
    protected LinkedList<TuilesVue> mesTuiles;
    protected DefausseVue defausse;

public PlayerVue(String p){
this.prenom = p;
this.id+=1;
this.score = new ScoreVue();
this.mesTuiles = new LinkedList<TuilesVue>();
this.defausse = new DefausseVue();
}
    
  
}
