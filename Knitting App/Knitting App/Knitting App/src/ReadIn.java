import java.io.*;

public class ReadIn {
	String fileName;
	public void setFileName(String fn){fileName = fn;}
	public String getFileName(){return fileName;}
	
	
    ReadIn(String fileName, String PatternName) {
        
        
        try (FileInputStream is = new FileInputStream("chinchilla pattern.txt")){
        	
        	InputStreamReader ir = new InputStreamReader(is);
        	BufferedReader rdr = new BufferedReader(ir);
        	String line = rdr.readLine();
        	
        	while(line!= null){
        		System.out.println(line);
        		line=rdr.readLine();
        	}
//        	FileWriter fw = new FileWriter(PatternName);
//        	BufferedWriter bw = new BufferedWriter(fw);
//        	while(line != null){
//        		bw.write(line);
//        	}
        	//bw.close();
        	rdr.close();
        }
        catch(Exception ex){System.out.printf("The computer sincerely disagrees with you, "
        		+ "and wishes you would take your nonesense elsewhere.\n\t%s", ex.getMessage());}
        
        System.out.printf("The computer is pleased with you and has done as you have requested.\n");
          
    }
}