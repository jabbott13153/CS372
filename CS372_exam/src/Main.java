import java.util.ArrayList;

public class Main extends xml_file_parser{
	static ArrayList<String> allShapes;
	public static void main(String[] args){
		read_xml();
		//read_txt();
		for(int i = 0; i < parts.size(); i++){
			allShapes.add(parts.get(i));
			
		}
		
	}
}
