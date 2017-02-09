import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import javax.swing.JPanel;


public class MyPanelClass extends JPanel{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth()-myInsets.right-1;
		int y2 = getHeight()-myInsets.bottom-1;
		int width = x2 - x1;
		int height = y2 - y1;
		
		//Paint the background
		//g.setColor(Color.DARK_GRAY);
		//g.fillRect(x1, y1, width + 1, height + 1);
		//Draw a border
		//g.setColor(Color.YELLOW);
		//g.drawRect(x1, y1, width, height);
		//g.setColor(Color.BLUE);
		//g.drawRect(x1 + 4, y1 + 4, width - 10, height - 10);
		//g.setColor(Color.WHITE);
		//g.drawLine(x1, y1, x2, y2);
		//g.setColor(Color.RED);
		//g.drawLine(x2, y1, x1, y2);
		//g.setColor(Color.LIGHT_GRAY);
		//g.fillOval((width - 55)/2, (height - 55)/2, 55, 55);
//		Polygon p = new Polygon();
//		p.addPoint(x1 + 5,  y1 + 25);
//		p.addPoint(x1 + 20, y1 + 10);
//		p.addPoint(x1 + 35, y1 + 25);
//		p.addPoint(x1 + 25, y1 + 25);
//		p.addPoint(x1 + 25, y1 + 45);
//		p.addPoint(x1 + 15, y1 + 45);
//		p.addPoint(x1 + 15, y1 + 25);
//		g.setColor(Color.BLACK);
//		g.fillPolygon(p);
//		Polygon p2 = new Polygon();
//		p2.addPoint(x1 + 25, y1 + 73);
//      p2.addPoint(x1 + 41, y1 + 73);
//      p2.addPoint(x1 + 47, y1 + 58);
//      p2.addPoint(x1 + 53, y1 + 73);
//      p2.addPoint(x1 + 69, y1 + 73);
//      p2.addPoint(x1 + 56, y1 + 83);
//      p2.addPoint(x1 + 61, y1 + 98);
//      p2.addPoint(x1 + 47, y1 + 88);
//      p2.addPoint(x1 + 34, y1 + 98);
//      p2.addPoint(x1 + 38, y1 + 83);
//      g.setColor(Color.WHITE);
//      g.drawPolygon(p2);

		g.setColor(Color.RED);
      	g.fillRect(x1, y1, width + 1, height + 1);
      	g.setColor(Color.BLACK);
      	
      	Polygon p5 = new Polygon();
        p5.addPoint(x1, height / 5 * 1);
        p5.addPoint(x2, height / 5 * 1);
        p5.addPoint(x2, height / 5 * 2);
        p5.addPoint(x1, height / 5 * 2);
        g.setColor(Color.WHITE);
        g.fillPolygon(p5);
        
        Polygon p6 = new Polygon();
        p6.addPoint(x1, height / 5 * 3);
        p6.addPoint(x2, height / 5 * 3);
        p6.addPoint(x2, height / 5 * 4);
        p6.addPoint(x1, height / 5 * 4);
        g.setColor(Color.WHITE);
        g.fillPolygon(p6);
      	
      	Polygon p4 = new Polygon();
      	p4.addPoint(x1, y1);
      	p4.addPoint(width / 5 * 2, height / 2);
      	p4.addPoint(x1, y2);
      	g.setColor(Color.BLUE);
      	g.fillPolygon(p4);
      	
      	Polygon p3 = new Polygon();
		p3.addPoint(x1 + 105, y1 + 233);
        p3.addPoint(x1 + 121, y1 + 233);
        p3.addPoint(x1 + 127, y1 + 218);
        p3.addPoint(x1 + 133, y1 + 233);
        p3.addPoint(x1 + 149, y1 + 233);
        p3.addPoint(x1 + 136, y1 + 243);
        p3.addPoint(x1 + 141, y1 + 258);
        p3.addPoint(x1 + 127, y1 + 248);
        p3.addPoint(x1 + 114, y1 + 258);
      	p3.addPoint(x1 + 118, y1 + 243);
      	g.setColor(Color.WHITE);
      	g.fillPolygon(p3);
        
	}

}
