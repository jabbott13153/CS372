import java.util.ArrayList;
import java.util.Random;
/**
 * This class models a city hall
 * */
public class CityHall extends Building{
	Random rnd = new Random();
	String Name;
	String Address;
	ArrayList<String> occupants = new ArrayList<String>();
	
	CityHall(String n, String a){
		super(n,a);
	}
	
	//get and set methods for occupants
	public void addOccupants(String n){
		occupants.add(n);
	}
	
public void getOccupants(){
	System.out.printf("In City Hall: \n");
		for(int i = 0; i < occupants.size(); i++){
			System.out.println(occupants.get(i) + " ");
		}
		System.out.printf("\n\n");
	}
	
}