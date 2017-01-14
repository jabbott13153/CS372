import java.awt.Color;
import java.awt.*;

public class Rectangle extends ShapesBase implements Shape {
	//constructor
	Rectangle(int w, int l, Color sc, int sid){
		super(sc, sid);
		set_width(w);
		set_length(l);
		calc_area(w, l);
		calc_perimeter(w, l);
		set_type("Rectangle");
	}
	
	
	//shape specific
	private int width;
	private int length;
	private int perimeter;
	private int area;
	
	//get and set for length and width
	public void set_width(int w){width = w;}
	public void set_length(int l){length = l;}
	public int get_width(){return width;}
	public int get_length(){return length;}
	
	//get and set for area and perimeter
	public void set_area(int a){area = a;}
	public int get_area(){return area;}
	public void set_perimeter(int p){perimeter = p;}
	public int get_perimeter(){return perimeter;}
	
	
	
	
	//methods to calculate the area and perimeter
	public void calc_area(int w, int l){
		set_area(w*l);
	}
	public void calc_perimeter(int w, int l){
		set_perimeter((2 * w) + (2 * l));
	}
	
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
