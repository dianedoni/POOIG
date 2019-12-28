import java.util.*;
public class LignesMotifVue{
    protected LinkedList<TuilesVue> ligne1,ligne2,ligne3,ligne4,ligne5;

    public LignesMotifVue(){
	this.ligne1 = new LinkedList<TuilesVue>();
   	this.ligne2 = new LinkedList<TuilesVue>();
   	this.ligne3 = new LinkedList<TuilesVue>();
   	this.ligne4 = new LinkedList<TuilesVue>();
   	this.ligne5 = new LinkedList<TuilesVue>();
    }


    public boolean ligne1(TuilesVue tuile, FabriquesVue fabrique){
	if(ligne1.size()==0){
	    ligne1.add(tuile);
	    fabrique.fabrique1.remove(tuile);
	    return true;
	}else{
	    return false;
	}
    }


      public boolean ligne2(TuilesVue tuile, FabriquesVue fabrique){
	if(ligne2.size()<2){
	    ligne2.add(tuile);
	    fabrique.fabrique1.remove(tuile);
	    return true;
	}else{
	    return false;
	}
    }



      public boolean ligne3(TuilesVue tuile, FabriquesVue fabrique){
	if(ligne3.size()<3){
	    ligne3.add(tuile);
	    fabrique.fabrique1.remove(tuile);
	    return true;
	}else{
	    return false;
	}
    }



  public boolean ligne4(TuilesVue tuile, FabriquesVue fabrique){
	if(ligne4.size()<4){
	    ligne4.add(tuile);
	    fabrique.fabrique1.remove(tuile);
	    return true;
	}else{
	    return false;
	}
    }


      public boolean ligne5(TuilesVue tuile, FabriquesVue fabrique){
	if(ligne5.size()<5){
	    ligne5.add(tuile);
	    fabrique.fabrique1.remove(tuile);
	    return true;
	}else{
	    return false;
	}
    }
}
