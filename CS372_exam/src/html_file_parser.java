import java.io.*;


public class html_file_parser {
	//public static void main(String[] args){
	
	public void parse_file(){
		try(FileInputStream is = new FileInputStream("shapes.txt")){
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader rdr = new BufferedReader(ir);
			
			String line =rdr.readLine();
			while(line != null){
				String []parts = line.split("\n");

				for (String p : parts)
					System.out.printf(p);
					
		}
			line =rdr.readLine();
		}
			
		
		catch(Exception ex){System.out.printf("Failed for %s\n", "shapes.txt");}
		
		}
	}


