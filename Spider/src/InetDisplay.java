/**
 * @Author Julia Abbott
 * 
 * Overview: a webcrawler
 * 		
 */

import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class InetDisplay {
	/**
	 * crawlerAdd = Hashmap to hold both the address of a website and whether they have already been added to the ArrayList AllAddress
	 * AllAddress = Arraylist to hold only the string form of all addresses the webcrawler finds
	 * TensorFlow = initial website to start crawler
	 */
	static HashMap<String, Boolean> crawlerAdd = new HashMap<String, Boolean>();
	static ArrayList<String> AllAddress = new ArrayList<String>();
	static String TensorFlow = "http://www.whitworth.edu/cms/";	
	/**
	 * main method for web crawler
	 */
    public static void main(String[] args) {
    	/**
    	 * calling newAddress to start webcrawler
    	 */
       newAddress(TensorFlow);
        
        /**
         * count = counter for while loop.
         * declares the string type Address, which holds the current address from crawlerAdd
         * for each value of CrawlerAdd, it checks to see if the key's value is false
         * If the value is false, it stores the key in Address, adds Address to AllAddress, and sets the value to true
         */
        int count =100;
        while(count > 0){
        	String Address;
             	
        	for(Map.Entry<String, Boolean> e: crawlerAdd.entrySet()){
        		if(e.getValue() == false)
        		{
        		Address = e.getKey();
           	    //System.out.println(Address + "\r");
        		AllAddress.add(Address);
           	    crawlerAdd.put(Address, true);    
           	    
        	    }
        	}
        	/**
        	 * method to check that webcrawler is indeed working by outputting addresses in AllAddress
        	 */
        	for(int j = 0; j < AllAddress.size(); j++)
            	//System.out.println("\tAll Addresses are: \n" + AllAddress.get(j) + "\n");
        	
        		for(int i = 0; i < AllAddress.size(); i++){
        			newAddress(AllAddress.get(i));
        		}

        /**\
         * Decrement count to avoid infinite loop
         */
        	count--;
        }
        /**
         * Output all addresses acquired at the end of the program
         */
        for(int j = 0; j < AllAddress.size(); j++)
        	System.out.printf("At the end of the day, all Addresses are: \r" + AllAddress.get(j) + "\r");
    }
    /**
     * Method to take addresses stored in AllAddress, and apply the crawler to each and every one
     * @param a -- The address of a website in string form
     */
    public static void newAddress(String a){
    	try {
    		/**
    		 * creates a URL object, and uses a buffered reader to open a stream from it
    		 */
            URL url = new URL(a);
            BufferedReader rdr = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = rdr.readLine();
           /**
            * uses regex to search for instances of website addresses while there are still lines on the webpage's html page
            * when an instance is found, it adds it to the hashmap with the value of false
            */
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
    	/**
    	 * prints out the associated error that caused the exception
    	 */
        catch (Exception ex) {
            System.out.printf("Oops: %s\r", ex.getMessage());
        }
    }
    
}
