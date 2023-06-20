package svemir;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;

public abstract class Objekat {
	
	protected int x, y;
	protected Color boja;
	
	public Objekat(int x, int y, Color boja) {
		this.x = x;
		this.y = y;
		this.boja = boja;
	}
	
	

	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}



	public void setX(int x) {
		this.x += x;
	}

	public void setY(int y) {
		this.y += y;
	}
	
	
	abstract void crtaj(Graphics g);
	
	public abstract boolean poklapaSe(int x, int y);

}
