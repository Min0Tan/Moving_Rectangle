package HK;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{ 
	
	public MyFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		this.setSize(500, 500); 
		
		MyPanel panel = new MyPanel();

		this.add(panel); 
		
		this.addKeyListener(new MyKeyAdapter(panel)); 
		panel.addMouseListener(new PanelMouseAdapter(panel)); 
		
		this.setVisible(true);
	}

}