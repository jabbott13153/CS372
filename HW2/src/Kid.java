
public class Kid extends Person {
	//favorite candy
	String favCandy = "";
	
	Kid(String n, int a, String pn, String fc){
		super(n, a, pn);
		favCandy = fc;
	}
	
	//get and set for favCandy
	public void setCandy(String fc){
		favCandy = fc;
	}
}
