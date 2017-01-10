import java.util.Random;

public class Teacher extends Person implements Employee{
	int gradeLevel = 0;
	String certification = "";
	int ID;
	
	Random rnd = new Random();
	int IDrand = rnd.nextInt()%500000;
	
	Teacher(String n, int a, String pn, int gL, String c)
	{
		super(n, a, pn);
		gradeLevel = gL;
		certification = c;
		ID = IDrand;
	}
	
	public void payEmployee(){
		 System.out.printf("This teacher has been payed.\n");
	}
	
	public int askID(int id){
		return id;
	}
}
