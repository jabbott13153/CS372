import javax.swing.*;
import java.awt.*;
import java.math.*;

public class Triangle extends ShapesBase implements Shape {
	
	//constructor
	Triangle(int s1, int s2, int s3, Color sc, int sid){
		super(sc, sid);
		set_side1(s1);
		set_side2(s2);
		set_side3(s3);
		calc_area(s1, s2, s3);
		calc_perimeter(s1, s2, s3);
		
		set_type("Triangle");
		
	}
	
	//shape specific
	private int side_1;
	private int side_2;
	private int side_3;
	private double area;
	private int perimeter;
		
		//get and set for all 3 sides, and for area and perimeter
		public void set_side1(int s) {side_1 = s;}
		public int get_side1(){return side_1;}
		public void set_side2(int s) {side_2 = s;}
		public int get_side2(){return side_2;}
		public void set_side3(int s) {side_3 = s;}
		public int get_side3(){return side_3;}
		
		public void set_area(double a){area = a;}
		public double get_area(){return area;}
		public void set_perimeter(int p){perimeter = p;}
		public int get_perimeter(){return perimeter;}
		
		//methods to calculate the area and perimeter of the triangle
		public void calc_area(int a, int b, int c){
			double s =(((double)a+(double)b+(double)c)/2);
			double Area1 = s*(s-a)*(s-b)*(s-c);
			double final_area = Math.sqrt(Area1);
			set_area(final_area);
		}
		public void calc_perimeter(int a, int b, int c){
			set_perimeter(a+b+c);
		}
		
		
	//methods for interface
		//interface methods
		@Override
		public String toString(){
			//TODO finish this
			String new_id = (String)get_ID();
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
