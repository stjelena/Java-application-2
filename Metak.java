package svemir;

import java.awt.Color;
import java.awt.Graphics;

public class Metak {
	
	private int duzina, Xpoc, Xkraj, Ypoc, Ykraj;
	
	
	public Metak(int duzina, int xpoc, int xkraj, int ypoc, int ykraj) {
		super();
		this.duzina = duzina;
		Xpoc = xpoc;
		Xkraj = xkraj;
		Ypoc = ypoc;
		Ykraj = ykraj;
	}
	
	
	public int getDuzina() {
		return duzina;
	}

	public int getXpoc() {
		return Xpoc;
	}


	public int getXkraj() {
		return Xkraj;
	}


	public int getYpoc() {
		return Ypoc;
	}


	public int getYkraj() {
		return Ykraj;
	}

	public void crtaj(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawLine(Xpoc, Ypoc, Xkraj, Ykraj);
	}
	
	public void pomeriMetak() {
		
	}
	

}
