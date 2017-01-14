import java.awt.Color;
import java.awt.*;
import java.util.ArrayList;

public class Circle extends ShapesBase implements Shape{
	//constructor
	Circle(int r, Color sc, int sid){
		super(sc, sid);
		set_radius(r);
		calc_area(r);
		calc_perimeter(r);
		set_type("Circle");
	}
	
	//shape specific
	private int radius;
	private double area;
	private double circumference;
	private final double PI = 3.14159;
	Image imgC;
		
		//get and set for radius, area, and circumference
		public void set_radius(int r){radius = r;}
		public int get_radius(){return radius;}
		public void set_area(double a){area = a;}
		public double get_area(){return area;}
		public void set_perimeter(double p){circumference = p;}
		public double get_perimeter(){return circumference;}
		
	
	//methods to calculate the perimeter and the area of the circle
	public void calc_area(int r){
		set_area(PI*((double)r * (double)r));
	}
	
	public void calc_perimeter(int r){
		set_perimeter(2*PI*(double)r);
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
