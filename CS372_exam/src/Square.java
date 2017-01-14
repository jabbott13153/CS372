import java.awt.Color;
import java.awt.*;

public class Square extends ShapesBase implements Shape {
	//constructor
	Square(int s, Color sc, int sid){
		super(sc, sid);
		set_side(s);
		calc_area(s);
		calc_perimeter(s);
		set_type("Square");
	}
	
	//shape specific
	private int side;
	private int perimeter;
	private int area;
		
		//get and set for side, perimeter, and area
		public void set_side(int s){side = s;}
		public int get_side(){return side;}
		public void set_area(int a){area = a;}
		public int get_area(){return area;}
		public void set_perimeter(int p){perimeter = p;}
		public int get_perimeter(){return perimeter;}
		
		//methods to calculate the perimeter and the area
		public void calc_perimeter(int s){
			perimeter = 4* s;
		}
		public void calc_area(int s){
			area = s*s;
		}
		
	//methods for interface	
		//interface methods
		@Override
		public String toString(){
			//TODO finish this
			String new_id = String.format(get_ID());
		}
		
		@Override
		public String getKind() {
			// TODO Auto-generated method stub
			return get_type();
		}

		@Override
		public String getDetailString() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getID() {
			// TODO Auto-generated method stub
			return get_ID();
		}
		
	
	
}
