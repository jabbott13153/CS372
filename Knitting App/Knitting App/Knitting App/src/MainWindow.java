import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class MainWindow extends JComponent implements MouseListener, ActionListener {
	MainWindow(){
		try{
	JFrame mainWindow = new JFrame("Knitting App");
	mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	mainWindow.getContentPane().setLayout(new BorderLayout());
	
	JPanel panel = new JPanel();
	mainWindow.getContentPane().add(panel, BorderLayout.WEST);
	GridBagLayout gbl_panel = new GridBagLayout();
	gbl_panel.columnWidths = new int[]{55, 0};
	gbl_panel.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0};
	gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
	gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel.setLayout(gbl_panel);
	
	JButton btnYarn = new JButton("Yarn");
	GridBagConstraints gbc_btnYarn = new GridBagConstraints();
	gbc_btnYarn.insets = new Insets(0, 0, 5, 0);
	gbc_btnYarn.gridx = 0;
	gbc_btnYarn.gridy = 1;
	panel.add(btnYarn, gbc_btnYarn);
	btnYarn.addMouseListener(this);
	
	JButton btnPatterns = new JButton("Patterns");
	GridBagConstraints gbc_btnPatterns = new GridBagConstraints();
	gbc_btnPatterns.insets = new Insets(0, 0, 5, 0);
	gbc_btnPatterns.gridx = 0;
	gbc_btnPatterns.gridy = 3;
	panel.add(btnPatterns, gbc_btnPatterns);
	btnPatterns.addMouseListener(this);
	
	JButton btnNeedles = new JButton("Needles");
	GridBagConstraints gbc_btnNeedles = new GridBagConstraints();
	gbc_btnNeedles.insets = new Insets(0, 0, 5, 0);
	gbc_btnNeedles.gridx = 0;
	gbc_btnNeedles.gridy = 5;
	panel.add(btnNeedles, gbc_btnNeedles);
	btnNeedles.addMouseListener(this);
	
	JButton btnNotions = new JButton("Notions");
	GridBagConstraints gbc_btnNotions = new GridBagConstraints();
	gbc_btnNotions.gridx = 0;
	gbc_btnNotions.gridy = 7;
	panel.add(btnNotions, gbc_btnNotions);
	
	JScrollPane scrollPane = new JScrollPane();
	mainWindow.getContentPane().add(scrollPane, BorderLayout.CENTER);
	btnNotions.addMouseListener(this);
	
	mainWindow.setSize(300, 300);
	mainWindow.setVisible(true);
		}
	catch(Exception ex){
		System.out.printf("The computer is mad at you and your images.\n\t %s\n", ex.getMessage());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
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

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}
