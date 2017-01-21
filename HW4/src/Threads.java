import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Thread;
import java.net.URL;

public class Threads extends JFrame implements MouseListener, ActionListener{
	public static Icon[] diceSides = new Icon[6];
	Yahtzee[] yz = new Yahtzee[5];
	Thread[] ts = new Thread[5];
	public Threads(){
		
		JButton rollButton = new JButton("ROLL");
		this.add(rollButton);
		rollButton.setFocusPainted(false);
		rollButton.addMouseListener(this);
		addMouseListener(this);
		rollButton.addActionListener(this);
		
		
//		JButton stopButton = new JButton("STOP");
//		this.add(stopButton);
//		stopButton.setFocusPainted(false);
//		stopButton.addMouseListener(this);
//		addMouseListener(this);
		
		
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//stores the address for images
		final String side_1 = "http://www.clipartkid.com/images/160/dice-1-clip-art-at-clker-com-vector-clip-art-online-royalty-free-GIXbjz-clipart.png";
		final String side_2 = "http://www.clipartkid.com/images/160/dice-2-clip-art-at-clker-com-vector-clip-art-online-royalty-free-dyonra-clipart.png";
		final String side_3 = "http://www.clipartkid.com/images/160/dice-3-clip-art-at-clker-com-vector-clip-art-online-royalty-free-UvzDUn-clipart.png";
		final String side_4 = "http://www.clipartkid.com/images/557/die-showing-four-clipart-etc-5AagHQ-clipart.gif";
		final String side_5 = "http://www.clipartkid.com/images/376/dice-5-clip-art-at-clker-com-vector-clip-art-online-royalty-free-G32zIM-clipart.png";
		final String side_6 = "http://www.clipartkid.com/images/161/dice-6-clip-art-at-clker-com-vector-clip-art-online-royalty-free-VSJiYZ-clipart.png";
		
		try{
		URL s1 = new URL(side_1);
		URL s2 = new URL(side_2);
		URL s3 = new URL(side_3);
		URL s4 = new URL(side_4);
		URL s5 = new URL(side_5);
		URL s6 = new URL(side_6);
		
		Image dice1 = toolkit.getImage(s1);
		Image dice2 = toolkit.getImage(s2);
		Image dice3 = toolkit.getImage(s3);
		Image dice4 = toolkit.getImage(s4);
		Image dice5 = toolkit.getImage(s5);
		Image dice6 = toolkit.getImage(s6);
		
		dice1 = dice1.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		dice2 = dice2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		dice3 = dice3.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		dice4 = dice4.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		dice5 = dice5.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		dice6 = dice6.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		
		Icon dice_1 = new ImageIcon(dice1);
		Icon dice_2 = new ImageIcon(dice2);
		Icon dice_3 = new ImageIcon(dice3);
		Icon dice_4 = new ImageIcon(dice4);
		Icon dice_5 = new ImageIcon(dice5);
		Icon dice_6 = new ImageIcon(dice6);
		
		diceSides[0] = dice_1;
		diceSides[1] = dice_2;
		diceSides[2] = dice_3;
		diceSides[3] = dice_4;
		diceSides[4] = dice_5;
		diceSides[5] = dice_6;
		
		for(int i = 0; i < 5; i++){
		JLabel l = new JLabel();
		yz[i] = new Yahtzee(l, diceSides);
		l.setIcon(dice_1);
		l.setText(String.format("%d",i));
		this.add(l);
		}
		
		this.setVisible(true);
		
//		for(int i =0; i < 5; i++){
//			ts[i] = new Thread(yz[i]);
//			ts[i].start();
//			
//		}
		}
		catch(Exception ex) {
			System.out.printf("The images failed you (%s).\n", ex.getMessage());
			}
		
	}
		public int[] diceValue = {1,2,3,4,5,6};
		
		Random rnd = new Random();
		int whichDice = rnd.nextInt()%5;
		
		
		//main method
		public static void main(String[] args){
			Threads t = new Threads();
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			for(int i =0; i < 5; i++){
				ts[i] = new Thread(yz[i]);
				ts[i].start();
				
			}
			
		}
	}

class Yahtzee implements Runnable {
	private JLabel label;
	private Icon[] diceSides = new Icon[6];
	private int Total;
	public Yahtzee(JLabel _label, Icon[] ds){
		label = _label;
		diceSides = ds;
	}
	
	public void setDiceSides(Icon[] ds){diceSides = ds;}

	public String[] diceValue = {"1","2","3","4","5","6"};
	
	//int whichDice = rnd.nextInt()%5;
	
	public void run(){
		Random rnd = new Random();
		int whichDice = rnd.nextInt();
		for(int i = 10; i > 0; i--){
			
			whichDice = rnd.nextInt(6);
			Total += whichDice + 1;
			label.setText(diceValue[whichDice]);
			label.setVisible(true);
			try{
				Thread.sleep(100);
			}
			catch(Exception ex){;}
				
};

		}
	}
