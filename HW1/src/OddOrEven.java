import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		System.out.printf("Please enter an integer: \n");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt(); 

		OddorEven(number);
	}
	public static void OddorEven(int input){
		if(input % 2 == 0)
		{
			System.out.printf("It is an even number.\n");
		}
		else
		{
			System.out.printf("It is an odd number.\n");
		}
	}
}
