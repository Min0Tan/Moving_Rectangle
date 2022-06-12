package HK;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class PanelMouseAdapter extends MouseAdapter { //MouseAdapter »ó¼Ó
	
	MyPanel panel; 

	public PanelMouseAdapter(MyPanel panel) {
		
		this.panel = panel;
	}
	
	public void mouseClicked(MouseEvent e) { 
		panel.x = e.getX();
		panel.y = e.getY();
		panel.repaint();
		

	}
}