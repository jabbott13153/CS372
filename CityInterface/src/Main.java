import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;


public class Main extends JComponent {
int imageX, imageY;
    Image image, imageField;

    public Main(Image i, Image ifield) {
      image = i;
      imageField = ifield;
      //addMouseMotionListener(this);
    }

    /*public void mouseDragged(MouseEvent e) {
      imageX = e.getX();
      imageY = e.getY();
      repaint();
    }
    /*public void mouseMoved(MouseEvent e) {}*/

    public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
      g2.drawImage(imageField, 0, 0, this);
      g2.drawImage(image, imageX, imageY, this);
    }
    
	static int imageWidth=60, imageHeight=60;
	public static void main(String[] args){
		String background = "/resources/Base_Grass.png";
		String school = "/resources/New Piskel.gif";
		String CityHall = "/resources/CityHall.gif";
		   
		   

		Image School = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(school));
		School = School.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
	    Image Background = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(background));
		JFrame frame = new JFrame("City");
		frame.add( new Main(School, Background) );
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		      frame.setVisible(true);
		    }
		


	}

