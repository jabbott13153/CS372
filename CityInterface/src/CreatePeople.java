import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;


public class CreatePeople{
	/**
	 * creating a class that will generate the images of the city people.
	 * Will need HW2 update in order to work
	 */
	
	/**
	 * creating variables to hold image addresses, and to start the image loading process.
	 * */
	
	/** 
	 * setting the correct images to their corresponding buttons. These will be PoliceIMG, TeachersIMG, and KidIMG
	 ** Also setting the size for these images
	 * */
	
	static ArrayList<Person[]> cityPeople;
	static ArrayList<Building> cityBuilding;
	
	static int imageWidth=160, imageHeight=160;
	
	static String kid = "/resources/child_m.gif";
	static String police = "/resources/police_in_building_2.gif";
	static String teacher = "/resources/teacher_f.gif";
	   
	static ArrayList<myJButton> People; 
	/**
	 * creating images for the police, teacher, and kid.
	 */
	public static void generatePeople(ArrayList<Person[]> p){
	Image PoliceIMG = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(police));
	PoliceIMG = PoliceIMG.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	
    
    Image TeachersIMG = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(teacher));
    TeachersIMG = TeachersIMG.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
    
    Image KidIMG = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(kid));
    KidIMG = KidIMG.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	
	 Icon TImg = new ImageIcon(TeachersIMG);
	 Icon PImg = new ImageIcon(PoliceIMG);
	 Icon KImg = new ImageIcon(KidIMG);
	 
	 
	 /**
	  * The method to be used to create all images of the city people, and to assign them to the appropriate building. 
	  * @param p
	  */
	 People = new ArrayList<myJButton>();
		 for(int i = 0; i < p.size(); i++){
			 if(p.get(i)[i] instanceof Teacher)
				 People.add(new myJButton(TImg, (Teacher)p.get(i)[i]));
						 
			 
			 if(p.get(i)[i] instanceof Police)
				 People.add(new myJButton(TImg, (Police)p.get(i)[i]));
			 
			 if(p.get(i)[i] instanceof Kid)
				 People.add(new myJButton(TImg, (Kid)p.get(i)[i]));
			 
		 }
	}
	/**
	 * Main method for the entire project
	 * @param args
	 */
public static void main(String[] args){
		
		Window w = new Window();
		
		
		/**
		 * setting up the city
		 */
		
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
			
			cityBuilding = new ArrayList<Building>();
			cityBuilding.add(jordanElbrige);
			cityBuilding.add(spokaneCityHall);
			
			cityPeople = new ArrayList<Person[]>();
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
				/**
				 * end of setup
				 * 
				 */
		generatePeople(cityPeople);
	}
}
	 

