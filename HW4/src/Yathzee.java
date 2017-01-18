import java.awt.*;
import java.lang.Thread;
import java.net.URL;

import javax.swing.*;
import java.util.ArrayList;

public class Yathzee extends JComponent {
	
	private JLabel label;
	public 	Yathzee(JLabel _label){
		label = _label;
}
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	//stores the address for images
	String side_1 = "/resources/dice-1-clip-art-at-clker-com-vector-clip-art-online-royalty-free-GIXbjz-clipart.png";
	String side_2 = "/resources/dice-2-clip-art-at-clker-com-vector-clip-art-online-royalty-free-dyonra-clipart.png";
	String side_3 = "/resources/dice-3-clip-art-at-clker-com-vector-clip-art-online-royalty-free-UvzDUn-clipart.png";
	String side_4 = "resources/time-4-kindergarten-subitizing-building-strong-number-sense-in-yCsR0P-clipart.png";
	String side_5 = "/resources/dice-5-clip-art-at-clker-com-vector-clip-art-online-royalty-free-vcYj2s-clipart.png";
	String side_6 = "/resources/dice-clipart-best-aWbEso-clipart.png";
	
	URL s1 =getClass().getResource(side_1);
	URL s2 =getClass().getResource(side_2);
	URL s3 =getClass().getResource(side_3);
	URL s4 =getClass().getResource(side_4);
	URL s5 =getClass().getResource(side_5);
	URL s6 =getClass().getResource(side_6);
	
	Image dice_1 = toolkit.getImage(s1);
	Image dice_2 = toolkit.getImage(s2);
	Image dice_3 = toolkit.getImage(s3);
	Image dice_4 = toolkit.getImage(s4);
	Image dice_5 = toolkit.getImage(s5);
	Image dice_6 = toolkit.getImage(s6);
	
	private Image[] dice_sides = {dice_1, dice_2, dice_3, dice_4, dice_5, dice_6};
	ArrayList<JLabel> dice;
	
//	public void Window(){
//		JFrame mainFrame = new JFrame("Yahtzee Dice");
//		mainFrame.setVisible(true);
//		mainFrame.setLayout(new FlowLayout());
//		
//		
//		JLabel dice1 = new JLabel();
//		JLabel dice2 = new JLabel();
//		JLabel dice3 = new JLabel();
//		JLabel dice4 = new JLabel();
//		JLabel dice5 = new JLabel();
//		
//		dice = new ArrayList<JLabel>();
//		dice.add(dice1);
//		dice.add(dice2);
//		dice.add(dice3);
//		dice.add(dice4);
//		dice.add(dice5);
//	}
	
		
		
	}
	
	public static void main(String[] args){
		
	}
}
