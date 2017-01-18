import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.*;
import java.util.HashMap;


public class InetDisplay {
	HashMap<String, Boolean> crawlerAdd = new HashMap<String, Boolean>();
    public static void main(String[] args) {
        try {
            System.out.print("What would you like to search? ");
            Scanner in = new Scanner(System.in);
            String s = in.next();
            String TensorFlow = "https://www.tensorflow.org";
            URL url = new URL(TensorFlow);
            BufferedReader rdr = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            int i=50;
            while ((line = rdr.readLine()) != null && i > 0) {
                i--;
                System.out.printf("%s\n", line);
            }
        }
        catch (Exception ex) {
            System.out.printf("Oops: %s", ex.getMessage());
        }
        try (FileInputStream is = new FileInputStream("faculty.html")) {
            InputStreamReader ir = new InputStreamReader(is);
            BufferedReader rdr = new BufferedReader(ir);
            String line = rdr.readLine();
            while (line != null) {
                Pattern email = Pattern.compile("<a\\s*?href=\"(http:.*?)\"");
                Matcher matcher = email.matcher(line);
                if (matcher.find())
                    System.out.printf("email: %s\n", matcher.group(1));
                line = rdr.readLine();
            }

        }
        catch (Exception ex) { System.out.printf("Failed for %s\n", "faculty.html");}
    }

    }
}
