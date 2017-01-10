import java.util.ArrayList;

public class School extends Building{
ArrayList<String> occupants = new ArrayList<String>();
	String Name;
	String Address;
	
	School(String n, String a){
		super(n , a);
	}


	//get and set methods for occupants
	public void addOccupants(String n){
		occupants.add(n);
	}
	
	public void getOccupants(){
		System.out.printf("In School: \n");
		for(int i = 0; i < occupants.size(); i++){
			System.out.println(occupants.get(i) + " ");
		}
		System.out.printf("\n\n");
	}
}