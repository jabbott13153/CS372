
import java.util.ArrayList;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.JButton;

public class myJButton extends JButton {
		
		 Image icon;
		 Building myBuilding;
		 Police myPolice;
		 Teacher myTeacher;
		 Kid myKid;
		
		/**
		 * Setters for all variables
		 * @param i
		 * @param s
		 * @param ch
		 * @param p
		 * @param t
		 * @param k
		 */
		public void setIcon(Image i){
			icon = i;
		}
		public void setBuilding(Building b){
			myBuilding = b;
		}
		
		public void setPolice(Police p){
			myPolice = p;
		}
		public void setTeacher(Teacher t){
			myTeacher = t;
		}
		public void setKid(Kid k){
			myKid = k;
		}
		/**
		 * getters for all variables except icon
		 * @return
		 */
		public Building getBuilding(){
			return myBuilding;
		}
		public String getBuildingName(){
			return myBuilding.getName();
		}
		public String getBuildingA(){
			return myBuilding.getAddress();
		}
		/*
		public CityHall getcHall(){
			return mycHall;
		}
		public String getcHallName(){
			return mycHall.getName();
		}
		public String getcHallA(){
			return mycHall.getName();
		}*/
		public Police getPolice(){
			return myPolice;
		}
		public Kid getKid(){
			return myKid;
		}
		
		
		/**
		 * constructor for a school button
		 * @param i
		 * @param s
		 */
		myJButton(Icon i, Building b){
			setIcon(i);
			setBuilding(b);
		}
		
		/*/**
		 * Constructor for a city hall button
		 * @param i
		 * @param ch
		 
		myJButton(Icon i, CityHall ch){
			setIcon(i);
			setcHall(ch);
		}*/
		/**
		 * Constructor for a Police button
		 * @param i
		 * @param p
		 */
		myJButton(Icon i, Police p){
			setIcon(i);
			setPolice(p);
		}
		/**
		 * Constructor for a Kid button
		 * @param i
		 * @param k
		 */
		myJButton(Icon i, Kid k){
			setIcon(i);
			setKid(k);
		}
		/**
		 * Constructor for a teacher button
		 * @param i
		 * @param t
		 */
		myJButton(Icon i, Teacher t){
			setIcon(i);
			setTeacher(t);
		}
		public void bOccupants(){
		if(myBuilding == (School)myBuilding){
			
		}
		}
}


