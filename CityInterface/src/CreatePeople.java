import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;


public class CreatePeople extends Window {
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
	
	static int imageWidth=160, imageHeight=160;
	
	String kid = "/resources/child_m.gif";
	String police = "/resources/police_in_building_2.gif";
	String teacher = "/resources/teacher_f.gif";
	   
	   
	/**
	 * creating images for the police, teacher, and kid.
	 */
	
	Image PoliceIMG = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(police));
	PoliceIMG = PoliceIMG.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	
    
    Image TeachersIMG = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(teacher));
    cTeachersIMG = TeachersIMG.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
    
    Image KidIMG = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(kid));
    KidIMG = KidIMG.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	
	 Icon TImg = new ImageIcon(TeachersIMG);
	 Icon PImg = new ImageIcon(PoliceIMG);
	 Icon KImg = new ImageIcon(KidIMG);
	 
	 /**
	  * The method to be used to create all images of the city people, and to assign them to the appropriate building. 
	  * @param p
	  */
	 public void generatePeople(ArrayList<Person> p){
		 for(int i = 0; i < p.size(); i++){
			 if(p.get(i) instanceof Teacher)
			 	 p.get(i).setButton(new JButton(TImg));
						 
			 if(p.get(i) instanceof Police)
				 p.get(i).setButton(new JButton(PImg));
			 
			 if(p.get(i) instanceof Kid)
				 p.get(i).setButton(new JButton(KImg));
			 
		 }
		 
		 
	 }
}
