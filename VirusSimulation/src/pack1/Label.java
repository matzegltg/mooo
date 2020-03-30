package pack1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.JLabel;

public class Label extends JLabel {
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(Var.background1, Var.backgroundX1 + 2, 0, Var.screenwidth, Var.screenheight, null);
		g.drawImage(Var.background2, Var.backgroundX2, 0, Var.screenwidth, Var.screenheight, null);
		repaint();
	}

}
