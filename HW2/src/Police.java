
public class Police extends Person {
	
	public enum PoliceRole{
		Patrol,
		Sargent,
		Captain,
		Chief
	}
	
	Police(String Name, int Age, String PhoneNumber, PoliceRole role)
	{
		super(Name, Age, PhoneNumber);
		PoliceRole(role);
	}
}
