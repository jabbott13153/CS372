import java.util.ArrayList;
/**
 * City is where all of the other classes will be implemented
 * */
public class City {
	public static void main(String[] args){
	Police CityPolice[] = {new Police("Gary Johnson", 67, "2532239"),
			new Police("Libby Walters", 25, "5555555"),
			new Police("Aleisha Smith", 66, "54482266"),
			new Police("Austin Rabbit", 24, "2006156")};
	CityPolice[0].setRole(Police.PoliceRole.Captain);
	CityPolice[1].setRole(Police.PoliceRole.Patrol);
	CityPolice[2].setRole(Police.PoliceRole.Chief);
	CityPolice[3].setRole(Police.PoliceRole.Sargent);
	
	Teacher SchoolTeacher[] = {new Teacher("Jane Austin", 25, "2352762",  5, "Washington State"),
			new Teacher("Aleta Abbott", 53, "5145862", 3, "Washington State"),
			new Teacher("Pete Tucker", 125, "4444444", 12, "Washington State Computer Science")};
	

	Kid SchoolKids[] = {new Kid("Jimmy", 5, "7777777", "Snickers"),
			new Kid("Nancy", 12, "5556688" , "Smarties"),
			new Kid("Lori",16, "1236548" , "Chocolate")};
	
	School jordanElbrige = new School("Jordan Elbridge", "10013 Jordan Road");
	CityHall spokaneCityHall = new CityHall("Spokane City Hall", "125 Freya Street");
	
	ArrayList<Building> cityBuilding = new ArrayList<Building>();
	cityBuilding.add(jordanElbrige);
	cityBuilding.add(spokaneCityHall);
	
	ArrayList<Person[]> cityPeople = new ArrayList<Person[]>();
	cityPeople.add(SchoolKids);
	cityPeople.add(SchoolTeacher);
	cityPeople.add(CityPolice);
	
	
	for(int i = 0; i < SchoolTeacher.length; i++){
		jordanElbrige.addOccupants(SchoolTeacher[i]);
			
	}
	for(int j = 0; j < SchoolKids.length; j++){
		jordanElbrige.addOccupants(SchoolKids[j]);
	}
	
	for(int k = 0; k < CityPolice.length; k++){
		spokaneCityHall.addOccupants(CityPolice[k]);
	}
	
	jordanElbrige.getOccupants();
	spokaneCityHall.getOccupants();

	System.out.println("The Buildings in the city are: \n");
	for(int i = 0; i < cityBuilding.size(); i++){
		System.out.println(cityBuilding.get(i).getName());
	}
	System.out.println("\n\n");
	
	System.out.println("The people in the city are: \n");
	for(int i = 0; i < SchoolKids.length; i++){
		System.out.println(SchoolKids[i].getName()+ " ");
	}
	for(int i = 0; i < SchoolTeacher.length; i++){
		System.out.println(SchoolTeacher[i].getName() + " ");
	}
	for(int i = 0; i < CityPolice.length; i++){
		System.out.println(CityPolice[i].getName() + " ");
	}
	System.out.println("\n\n");
	
	for(int i = 0; i < SchoolTeacher.length; i++){
		SchoolTeacher[i].payEmployee();
	}
	
	for(int i = 0; i < CityPolice.length; i++){
		CityPolice[i].payEmployee();
	}
}

}
