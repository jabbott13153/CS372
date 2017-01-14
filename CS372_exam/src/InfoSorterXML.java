import java.util.ArrayList;

public class InfoSorterXML extends xml_file_parser {
	public static void makeReadable(ArrayList<String> prts){
	for(int i = 0; i < parts.size(); i++){
		prts.get(i).replace("\'", "");
		prts.get(i).replace("<", "");
		prts.get(i).replace(">", "");
		prts.get(i).replace("\\", "");
		
		
	}
	for(String p : prts){
		System.out.printf(p);
	}
}
}
