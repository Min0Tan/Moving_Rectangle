package HK;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class MyKeyAdapter extends KeyAdapter {
	
	MyPanel panel;
	
	public MyKeyAdapter(MyPanel panel) {
		this.panel = panel;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode) {
		case KeyEvent.VK_UP:
			panel.setLocation(panel.getX(), panel.getY()-50);
			panel.repaint();
			break;
		case KeyEvent.VK_DOWN:
			panel.setLocation(panel.getX(), panel.getY()+50);
			break;
		case KeyEvent.VK_LEFT:
			panel.setLocation(panel.getX()-50, panel.getY());
			break;
		case KeyEvent.VK_RIGHT:
			panel.setLocation(panel.getX()+50, panel.getY());
			break;
		}
		
	}

}