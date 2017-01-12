
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;


public class Window extends JComponent implements MouseListener {
	
	int imageX, imageY;
	Image image;
	
	static myJButton btnCityHall;
	static myJButton btnSchool;
	
	static ArrayList<Person[]> cityPeople;
	static ArrayList<Building> cityBuilding;
	
	
	static School jordanElbrige = new School("Jordan Elbridge", "10013 Jordan Road");
	static CityHall spokaneCityHall = new CityHall("Spokane City Hall", "125 Freya Street");
	
	
	static int imageWidth = 160, imageHeight = 160;
	public Window() {
		/** 
		 * setting the correct images to their corresponding buttons. These will be school and CityHall
		 * */
		
		String school = "/resources/New Piskel.gif";
		String CityHall = "/resources/CityHall.gif";
		 
		   
		/**
		 * creating images for the school, city hall.
		 */
		Image SchoolImg = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(school));
		SchoolImg = SchoolImg.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
		
	    
	    Image cityHallImg = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(CityHall));
	    cityHallImg = cityHallImg.getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
		
		 Icon citySchool = new ImageIcon(SchoolImg);
		 Icon btnHall = new ImageIcon(cityHallImg);
		
			
		
		/**
		 * Creating the JFrame that will hold the interface.
		 * */
		JFrame cityFrame = new JFrame("Chinchilla City");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		
		cityFrame.getContentPane().setLayout(gridBagLayout);
		
		btnSchool = new myJButton(citySchool, jordanElbrige);
		jordanElbrige.setButton(btnSchool);
		GridBagConstraints gbc_btnSchool = new GridBagConstraints();
		gbc_btnSchool.insets = new Insets(0, 0, 5, 5);
		gbc_btnSchool.gridx = 1;
		gbc_btnSchool.gridy = 1;
		cityFrame.getContentPane().add(btnSchool, gbc_btnSchool);
		btnSchool.setBorderPainted(false);
		btnSchool.setContentAreaFilled(false);
		btnSchool.setFocusPainted(false);
		btnSchool.setOpaque(false);
		btnSchool.addMouseListener(this);
		addMouseListener(this);
		
		
		btnCityHall = new myJButton(btnHall, spokaneCityHall);
		spokaneCityHall.setButton(btnCityHall);
		GridBagConstraints gbc_btnCityHall = new GridBagConstraints();
		gbc_btnCityHall.gridx = 8;
		gbc_btnCityHall.gridy = 4;
		cityFrame.getContentPane().add(btnCityHall, gbc_btnCityHall);
		btnCityHall.setBorderPainted(false);
		btnCityHall.setContentAreaFilled(false);
		btnCityHall.setFocusPainted(false);
		btnCityHall.setOpaque(false);
		btnCityHall.addMouseListener(this);
		addMouseListener(this);
		
		
		/** 
		 * setting up the frame size, and the background for the frame
		 */
		
		
		cityFrame.getContentPane().setBackground(new Color(26,124,58));
		cityFrame.setOpacity(1.0f);
		cityFrame.setSize(800, 500);
		cityFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		cityFrame.setVisible(true);

		
		
	}
		
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() instanceof myJButton){
			JFrame frame = new JFrame();
			myJButton b = (myJButton)e.getSource();
			JButton tbutton = new JButton(b.getBuildingName());
			JButton tbutton2 = new JButton(b.getBuildingA());
			frame.add(tbutton);
			frame.add(tbutton2);
			
			frame.setLayout(new FlowLayout());
			frame.setSize(300, 300);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		}	
		if(e.getSource() instanceof myJButton){
			myJButton b = (myJButton)e.getSource();
			if(b.getBuilding() == (School)b.getBuilding()){
				schoolFrame();
				
			}
			if(b.getBuilding() == (CityHall)b.getBuilding()){
				cityHallFrame();
			}
		}
			
	}
			
				

	
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * a method to show a new frame on the screen when the school button is pressed
	 * will also display all people inside of school
	 */
public void schoolFrame(ArrayList<myJButton> b){
	JFrame schoolFrame = new JFrame("The City School");
	
	for(int i = 0; i < b.size(); i++){
		schoolFrame.add(b.get(i));
	}
	
	schoolFrame.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE );
}
/**
 * a method to show a new frame on the screen when the city hall button is pressed
 * will also display all people inside of school
 */
public void cityHallFrame(ArrayList<Person[]> p){
	JFrame cityHallFrame = new JFrame("The City Hall");
	
	
	for(int j = 0; j < p.size(); j++){
	if(p.get(j)[j] instanceof Police)
		cityHallFrame.add(p.get(j)[j].getButton());
	}
	cityHallFrame.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE );
}

	
	

	/**
	 * redefining paint method from JComponent.
	 * Will be used to drag the city people around to different buildings
	 * @param g
	 */
	/*public void paint(Graphics g) {
	      Graphics2D g2 = (Graphics2D)g;
	      g2.drawImage(imageField, 0, 0, this);
	      g2.drawImage(image, imageX, imageY, this);
	    }

	}*/

}
