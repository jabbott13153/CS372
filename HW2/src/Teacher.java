
public class Teacher extends Person {
	int gradeLevel = 0;
	String certification = "";
	
	Teacher(String n, int a, String pn, int gL, String c)
	{
		super(n, a, pn);
		gradeLevel = gL;
		certification = c;
	}
}
