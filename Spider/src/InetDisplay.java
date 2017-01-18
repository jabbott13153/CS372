import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.*;
import java.util.HashMap;
import java.util.Map;


public class InetDisplay {
	static HashMap<String, Boolean> crawlerAdd = new HashMap<String, Boolean>();
	 
		
    public static void main(String[] args) {
        try {
            String TensorFlow = "https://www.tensorflow.org/tutorials/mnist/pros/";
           
            URL url = new URL(TensorFlow);
            BufferedReader rdr = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = rdr.readLine();
           
            while (line != null) {
                Pattern email = Pattern.compile("<a\\s*?href=\"(http:.*?)\"");
                Matcher matcher = email.matcher(line);
                if (matcher.find())
                {
                    crawlerAdd.put(matcher.group(1), false);
                }
                line = rdr.readLine();
            }
        }
        catch (Exception ex) {
            System.out.printf("Oops: %s", ex.getMessage());
        }
        
        
        int count =100;
        while(count > 0){
        	String Address;
        	Set<String> set = crawlerAdd.keySet();
        	
        	for(Map.Entry<String, Boolean> e: crawlerAdd.entrySet()){
        	    Address = e.getKey();
        	    System.out.println(Address + "\r");
        	}
        	count--;
        }
    }
}
