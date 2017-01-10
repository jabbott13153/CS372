import java.util.Random;

public class Police extends Person implements Employee{
	Random rand = new Random();
	PoliceRole role;
	int ID = 0;
	
	public enum PoliceRole{
		Patrol,
		Sargent,
		Captain,
		Chief
	}
	
	int IDrnd = rand.nextInt() % 500000;
	
	Police(String Name, int Age, String PhoneNumber)
	{
		super(Name, Age, PhoneNumber);
		
		ID = IDrnd;
	}
	
	public void payEmployee(){
		System.out.printf("This police person has been payed.\n");
	}
	
	public int askID(int id){
		
		return id;
	}
	//set and get for PoliceRole
	public void setRole(PoliceRole r){
		role = r;
	}
	public PoliceRole getRole(){
		return role;
	}
}
