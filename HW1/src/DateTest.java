public class DateTest {
public static void main(String[] args){
	System.out.printf("The date that I will be entering is 7/08/91.\n");
	Date d = new Date(7, 8, 91);
	d.displayDate(d);
	
	System.out.printf("The date that will be displayed will be the default constructor.\n");
	Date cd = new Date();
	cd.displayDate(cd);
}
}
