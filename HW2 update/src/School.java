import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;


public class School extends Building{
ArrayList<Person> occupants = new ArrayList<Person>();
	String Name;
	String Address;
	
	School(String n, String a){
		super(n , a);
	}


	//get and set methods for occupants
	public void addOccupants(Person n){
		occupants.add(n);
	}
	
	public ArrayList<Person> getOccupants(){
		return occupants;
	}
}