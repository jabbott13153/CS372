import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args){
	final double PI = 3.14;
	System.out.printf("Please enter the radius of the circle: \n");
	Scanner input = new Scanner(System.in);
	int radius= input.nextInt(); 
	
	double finalCalc = PI*radius*radius;
	System.out.println(finalCalc);
	}
}
