import java.awt.FlowLayout;


import javax.swing.*;


public class Threads extends JComponent{
	

	public Threads(){
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		Yathzee[] yz = new Yathzee[5];
		for(int i =0; i < 5; i++)
		{
			JLabel l = new JLabel();
			yz[i] = new Yathzee(l);
			this.add(l);
		}
		
		this.setVisible(true);
		
	}
}