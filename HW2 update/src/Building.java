/**
 * Building is the base class for School and City Hall
 * It contains the constructors that will be used for both, as well as the get and set methods
 * */
public class Building{
	String Name;
	String Address;
	
	Building(String n, String a){
		setName(n);
		setAddress(a);
	}
	//set and get methods for:
	//a.)Name
	public void setName(String n){
		Name = n;
	}
	public String getName(){
		return Name;
	}
	//b.)Address
	public void setAddress(String a){
		Address = a;
	}
	public String getAddress(){
		return Address;
	}
	
	
	//set and get methods for occupants
	
}