package svemir;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Kometa extends NebeskoTelo {
	
	private int[] xx = {0,0,0,0,0};
	private int[] yy = {0,0,0,0,0};

	public Kometa(int x, int y, Color boja, int r) {
		super(x, y, boja, r);

		boja = Color.GRAY;
		
		
	}

	@Override
	void crtaj(Graphics g) {
		g.setColor(boja);
		
	
		
		Random rand = new Random();
		int orij = rand.nextInt(10);
		
		for (int i = 0; i < 5; i++) {
			xx[i] = (int)((Math.cos(2*i*(Math.PI/5) + orij)*r)+x);
			yy[i] = (int)((Math.sin(2*i*(Math.PI/5) + orij)*r)+y);
		}
		
		g.fillPolygon(xx, yy, 5);
	}
	
	@Override
	public boolean poklapaSe(int x, int y) {
		if (Math.abs(x-this.x) < 2*r) {
			return true;
		}
		else return false;
	}
	
}
