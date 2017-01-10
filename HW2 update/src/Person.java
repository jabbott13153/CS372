
public class Person {
	String Name = "";
	int Age = 0;
	String PhoneNumber = "";
	
	//default constructor
	Person(){
		Name = "Jane Doe";
		Age = 0;
		PhoneNumber = "555-555-5555";
	}
	
	//all variables constructor
	Person(String n, int a, String pn){
		setName(n);
		setAge(a);
		setPhoneNumber(pn);
	}
	
	//get and set methods for:
	//a.)Name
	public void setName(String n){
		Name = n;
	}
	public String getName(){
		return Name;
	}
	//b.)age
	public void setAge(int a){
		Age = a;
	}
	public int getAge(){
		return Age;
	}
	//c.)Phone Number
	public void setPhoneNumber(String pn){
		PhoneNumber = pn;
	}
	public String getPhoneNumber(){
		return PhoneNumber;
	}
}
