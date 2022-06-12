package HK;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel{ 
	
	
	public MyPanel() {
		
	}
	
	static int x=20 , y=20 ;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(x,  y,  20,  20); 
	}
	
}
