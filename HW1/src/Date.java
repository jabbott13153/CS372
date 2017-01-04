
public class Date {
	//initializing variables
	int month = 0;
	int year = 0;
	int day = 0;
	
	//default constructor
	Date(){
		month = 1;
		day = 1;
		year = 1;
	}
	
	//Constructor provided with all three values
	Date(int m, int d, int y)
	{
		setMonth(m);
		setDay(d);
		setYear(y);
	}
	
	//get and set methods for:
	//a.)month
	public void setMonth(int m){
		month = m;
	}
	public int getMonth(){
		return month;
	}
	//b.)year
	public void setYear(int y) {
		year = y;
	}
	public int getYear(){
		return year;
	}
	//c.)day
	public void setDay(int d){
		day = d;
	}
	public int getDay(){
		return day;
	}
	
	//creating a method to print the current date out to the screen
	public void displayDate(Date dd){
		System.out.printf("The entered date is " + dd.getMonth() + "/" + dd.getDay() + "/" +dd.getYear()+ ".\n\n");
	}
}
