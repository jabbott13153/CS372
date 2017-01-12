import java.util.ArrayList;
import java.util.Random;
/**
 * This class models a city hall
 * */
public class CityHall extends Building{
	Random rnd = new Random();
	String Name;
	String Address;
	ArrayList<Person> occupants = new ArrayList<Person>();
	
	CityHall(String n, String a){
		super(n,a);
	}
	
	//get and set methods for occupants
	public void addOccupants(Person n){
		occupants.add(n);
	}
	
public ArrayList<Person> getOccupants(){
	return occupants;
	}
	
}