import java.io.*;
import java.util.regex.*;
import java.util.ArrayList;

public class xml_file_parser {
	public static ArrayList<String> parts;
	public static ArrayList<ShapesBase> shapes = new ArrayList<ShapesBase>();
	//public static void main(String[] args){
	
		public static void read_xml(){
		//use for checking loop
		//int i = 1;
		try(FileInputStream is = new FileInputStream("shapes.xml")){
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader rdr = new BufferedReader(ir);
			String line = rdr.readLine();
			parts = new ArrayList<String>();
			while(line != null){
				//System.out.printf("The chinchillas are coming!!! \n");
				//System.out.println(i++);
				Pattern color = Pattern.compile("\"circle color=(.*?)\"");
				Matcher matcher = color.matcher(line);
				if(matcher.find())
					System.out.printf("The color is: %s", matcher.group(1));
				line = rdr.readLine();
				parts.add(line);
				
			}
			
		}
		catch(Exception ex){System.out.printf("Failed for %s\n", "shapes.xml");}
		//makeReadable(parts);
		
	
	}
		public static void read_txt(){
			try(FileInputStream is = new FileInputStream("shapes.txt")){
				InputStreamReader ir = new InputStreamReader(is);
				BufferedReader rdr = new BufferedReader(ir);
				
				String line =rdr.readLine();
				while(line != null){
					String []partsi = line.split("\n");
					
//					for (String p : partsi)
//						System.out.printf(p);
					for(int i = 0; i < partsi.length; i++){
						parts.add(partsi[i]);
					}
					for(String p : parts)
						System.out.printf(p);
						
			}
				line =rdr.readLine();
			}
				
			
			catch(Exception ex){System.out.printf("Failed for %s\n", "shapes.txt");}
		}
		
		
	public static void makeReadable(ArrayList<String> prts){
		for(int i = 0; i < parts.size(); i++){
			prts.get(i).replace("'", "");
			prts.get(i).replace("<", "");
			prts.get(i).replace(">", "");
			prts.get(i).replace("\\", "");
			
			
		}
		for(String p : prts){
			System.out.printf(p);
		}
	}
	
	public static void sortShapes(ArrayList<String> ac){

		for(int i = 0; i < ac.size(); i++){
			Pattern shape;
			if(shape == Pattern.compile("\"<(.*?)\"")){
				Matcher matcher = shape.matcher(ac.get(i));
				if(matcher.find())
					shapes.add(new Circle())
			}
			shape = Pattern.compile("\"circle color=(.*?)\"");
			
				System.out.printf("The color is: %s", matcher.group(1));
			
			parts.add(i);
			
		}
	}
}

	

