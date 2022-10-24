import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MethodPractice extends JPanel{
	
	// Practice calling methods with parameters
	// by drawing the required shapes/patterns from the document
	public void paint(Graphics g) {
		
//		//What do these numbers mean in terms 
//		g.fillOval(200, 200, 200, 200);
//		
//		//Methods!!!!
//		/*
//		 * name( parameters )
//		 * parameters - data for the method
//		 * 
//		 */
//		
//		g.fillRect(0, 0, 50, 50);
//		g.drawLine(0, 300, 600, 300);
//		g.drawLine(300, 0, 300, 600);
		
//		g.drawRect(10, 10, 100, 100);
//		g.drawRect(60, 60, 100, 100);
//		g.drawLine(10, 10, 60, 60);
//		g.drawLine(110, 10, 160, 60);
//		g.drawLine(10, 110, 60, 160);
//		g.drawLine(110, 110, 160, 160);
//		
//		g.drawOval(300, 10, 200, 200);
//		g.drawOval(300, 85, 200, 50);
//		g.drawOval(300, 60, 200, 100);
//		g.drawOval(300, 35, 200, 150);
//		g.drawOval(375, 10, 50, 200);
//		g.drawOval(350, 10, 100, 200);
//		g.drawOval(325, 10, 150, 200);
//		
//		g.drawOval(300, 300, 200, 200);
//		g.drawLine(300, 400, 400, 500);
//		g.drawLine(300, 400, 477, 337);
//		g.drawLine(400, 500, 477, 337);
//		g.drawOval(339, 372, 95, 95);
//		
//		g.fillRect(10, 200, 25, 125);
//		g.fillRect(10, 200, 50, 25);
//		g.fillRect(60, 200, 25, 125);
//		g.fillRect(10, 250, 50, 25);
//		g.fillRect(100, 200, 25, 125);
//		g.fillRect(100, 200, 50, 25);
//		g.fillRect(100, 250, 50, 25);
//		g.fillRect(150, 200, 25, 75);
//		g.fillRect(190, 200, 25, 125);
//		g.fillRect(190, 200, 75, 25);
//		g.fillRect(190, 300, 75, 25);
//		g.fillRect(280, 200, 75, 25);
//		g.fillRect(280, 200, 25, 75);
//		g.fillRect(280, 250, 75, 25);
//		g.fillRect(330, 250, 25, 75);
//		g.fillRect(280, 300, 75, 25);
//		
//		g.fillArc(100, 350, 50, 50, 150, 240);
//		g.fillArc(131, 387, 50, 50, 60, 240);
//		g.fillArc(69, 387, 50, 50, 240, 240);
//		g.fillArc(100, 424, 50, 50, 330, 240);
		
		
		g.setColor(Color.YELLOW);
		g.fillOval(300, 10, 200, 200);
		g.setColor(Color.BLACK);
		g.drawOval(300, 10, 200, 200);
		g.setColor(Color.GRAY);
		g.fillOval(343, 60, 75, 75);
		g.fillOval(386, 60, 75, 75);
		g.fillRect(416, 90, 85, 10);
		g.fillRect(300, 90, 85, 10);
		g.setColor(Color.black);
		g.fillOval(355, 78, 40, 40);
		g.fillOval(410, 78, 40, 40);
		g.drawArc(325, 25, 150, 150, 220, 100);
		g.setColor(Color.WHITE);
		g.fillOval(355, 80, 20, 20);
		g.fillOval(410, 80, 20, 20);
	
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		MethodPractice m = new MethodPractice();
	}
	
	public MethodPractice() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
