
public class Plateau {
	protected Manche m = new Manche();
	protected String proprietaire;
	protected String [] s = new String[5];
	protected String[] mos = {"[bl]","[j]","[r]","[n]","[b]"};
	
	public Plateau(String s) {
		this.proprietaire = s;
		affichePlateau();
		System.out.println();
	}

	public int nbrePlateaux() {
		return m.nbJoueurs;
	}
	
	public void firstLine() {
		s[4] = "[ ]";                    //
		System.out.print("1" + "                " + s[4] + "    ");
		for(int i=0;i<mos.length;i++) {
			System.out.print(mos[i] + " ");
		}
		System.out.println();
	}
	
	public void scndLine() {	
		mos[0] = "[b]";
		mos[1] = "[bl]";
		mos[2] = "[j]";
		mos[3] = "[r]";
		mos[4] = "[n]";
		s[3] = "[ ]";
		s[4] = "[ ]";                //
		System.out.print("2" + "            " + s[3] + " ");
		System.out.print(s[4] + "    ");
		for(int i=0;i<mos.length;i++) {
			System.out.print(mos[i] + " ");
		}
		System.out.println();
	}
	
	public void thrdLine() {
		mos[0] = "[n]";
		mos[1] = "[b]";
		mos[2] = "[bl]";
		mos[3] = "[j]";
		mos[4] = "[r]";
		s[2] = "[ ]";
		s[3] = "[ ]";
		s[4] = "[ ]";            //
		System.out.print("3" + "        " + s[2] + " ");
		System.out.print(s[3] + " ");
		System.out.print(s[4] + "    ");
		for(int i=0;i<mos.length;i++) {
			System.out.print(mos[i] + " ");
		}
		System.out.println();
	}
	
	public void frthLine(){
		mos[0] = "[r]";
		mos[1] = "[n]";
		mos[2] = "[b]";
		mos[3] = "[bl]";
		mos[4] = "[j]";
		s[1] = "[ ]";
		s[2] = "[ ]";
		s[3] = "[ ]";
		s[4] = "[ ]";        //
		System.out.print("4" + "    " + s[1] + " ");
		System.out.print(s[2] + " ");
		System.out.print(s[3] + " ");
		System.out.print(s[4] + "    ");
		for(int i=0;i<mos.length;i++) {
			System.out.print(mos[i] + " ");
		}
		System.out.println();
	}
	
	public void fifthLine() {
		mos[0] = "[j]";
		mos[1] = "[r]";
		mos[2] = "[n]";
		mos[3] = "[b]";
		mos[4] = "[bl]";
		System.out.print("5" + "");
		for(int i=0;i<s.length-1;i++) {
			System.out.print("[ ]" + " ");
		}
		System.out.print(s[4] + "    ");
		for(int i=0;i<mos.length;i++) {
			System.out.print(mos[i] + " ");
		}
	}
	
	public void affichePlateau() {
		firstLine();
		scndLine();
		thrdLine();
		frthLine();
		fifthLine();
	}
}
