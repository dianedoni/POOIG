import java.util.LinkedList;

public class CentreDeTable {

	protected LinkedList<Tuiles> c;
	
	public CentreDeTable() {
		c = new LinkedList<Tuiles>();
	}
	
	public void addAtCenter(Tuiles a) {
		if(c.size() == 0) {
			c.add(0,a);
		} else {
			c.addLast(a);;
		}
	}
}

