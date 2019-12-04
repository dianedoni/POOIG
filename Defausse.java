
public class Defausse {

		protected Joueur joueur;
		protected Plateau plateau;
		protected String[] defausse = new String[7];
		protected int [] n = {-1,-1,-2,-2,-2,-3,-3};
		
		public Defausse(String n) {
			afficheDefausse();
			System.out.println();
			System.out.println("*******************************************");
		}
		
		public void afficheDefausse() {
			for(int i=0;i<n.length;i++) {
				System.out.print(n[i] + "  ");
			}
			
			System.out.println();
			
			for(int i=0;i<defausse.length;i++) {
				defausse[i] = "[ ]";
				System.out.print(defausse[i] + " ");
			}
		}
}
