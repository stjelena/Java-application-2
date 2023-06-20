package svemir;

import java.awt.Color;
import java.awt.Graphics;

public class Igrac extends NebeskoTelo {
	
	private int[] xx = {0, 0, 0};
	private int[] yy = {0, 0, 0};

	public Igrac(int x, int y, Color boja, int r) {
		super(x, y, boja, r);

		this.boja = Color.RED;
		this.r = 10;
	}
	
	@Override
	void crtaj(Graphics g) {
		
		int[] xx = {x - r, x, x + r};
		int[] yy = {y, y-r, y};
		
		/*
		for(int i = 0; i < 3; i++) {
			xx[i] = (int)(this.x + r*Math.cos(i*2*(Math.PI/3)));
			yy[i] = (int)(this.y + r*Math.sin(i*2*(Math.PI/3)));
		}
		*/
		g.setColor(boja);
		g.fillPolygon(xx, yy, 3);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y-r;
	}

}
