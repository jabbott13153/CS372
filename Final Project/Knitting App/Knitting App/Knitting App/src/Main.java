import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/**
	 * these arrays will store all of the individual objects
	 */
	static ItemStorage is = new ItemStorage();
	public static void main(String[] args){
		
		
//		YarnWindow yw = new YarnWindow();
//		NeedleWindow nw = new NeedleWindow();
//		PatternWindow pw = new PatternWindow();
//		ReadIn ri = new ReadIn("Test 1","This is test #1.txt");
		
//		Scanner scanner = new Scanner(System.in);
		//default needle, pattern, and yarn objects
		//these will be initialized at the beginning of the program when it is first started
		Needles defaultNeedle = new Needles(8, 10, "Default");
		Yarn defaultYarn = new Yarn("Blue", "Acrylic", 4, "Default2");
		Pattern defaultPattern = new Pattern("Default");
		
		defaultNeedle.setAddNotes("This is only an example.");
		defaultYarn.setAddNotes("This is only an example.");
		defaultPattern.setAddNotes("This is only an example.");
		
		try{
		is.setAllNeedles(defaultNeedle);
		is.setAllYarn(defaultYarn);
		is.setAllPatterns(defaultPattern);
		}
		catch(Exception ex){System.out.printf("The computer has decided it has "
				+ "had enough of your antics, and wishes you to go away.\n\t%s\n", ex.getMessage());}
		//creating the main window interface
		MainWindow mw = new MainWindow(is);
		mw.setSize(300,300);
		
		
	}
}
