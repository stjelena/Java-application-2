package svemir;

import java.awt.Color;
import java.awt.Graphics;

public class NebeskoTelo extends Objekat {
	
	protected int r;
	
	public NebeskoTelo(int x, int y, Color boja, int r) {
		super(x, y, boja);

		this.r = r;
	}
	
	public int getR() {
		return r;
	}
	
	@Override
	void crtaj(Graphics g) {
		g.setColor(boja);
		g.fillOval(x, y, r, r);
	}

	@Override
	public boolean poklapaSe(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
