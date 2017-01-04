import java.util.Scanner;

public class BMI_4 {
	public static void main(String[] args){
		//prompt
		System.out.printf("Please enter a weight in pounds.\n");
		
		Scanner input = new Scanner(System.in);
		int weight = input.nextInt();
		
		System.out.printf("Please enter a height in inches.\n");
		Scanner input2 = new Scanner(System.in);
		int height = input2.nextInt();
		
		CalcBMI(weight, height);
	}
	public static void CalcBMI(int weight, int height){
		double FinalCalc = ((double)weight * 703)/((double)height*(double)height);
		
		if(FinalCalc < 18.5){
			System.out.printf("The user's BMI is %f, and is underweight.\n" , FinalCalc);
		}
		else if(FinalCalc >= 18.5 && FinalCalc <= 24.9){
			System.out.printf("The user's BMI is %f, and is normal.\n" , FinalCalc);
		}
		else if(FinalCalc >= 25.0 && FinalCalc <= 29.9){
			System.out.printf("The user's BMI is %f, and is overweight.\n" , FinalCalc);
		}
		else if(FinalCalc >= 30){
			System.out.printf("The user's BMI is %f and is obese.\n" , FinalCalc);
		}
	}
}
