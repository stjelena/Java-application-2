package svemir;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Svemir extends Canvas implements Runnable {
	
	private Simulator owner;
	public ArrayList<NebeskoTelo> nebeskaTela= new ArrayList<>();
	private Thread thread;;
	public boolean work;
	private Igrac igrac;
	private ArrayList<Metak> meci= new ArrayList<>();
	
	public Svemir(Simulator owner) {
		this.owner = owner;
		this.setBackground(Color.BLACK);
		this.setSize(200, 350);;
	}
	
	public void dodajNebeskoTelo(NebeskoTelo nb) {
		nebeskaTela.add(nb);
	}
	
	@Override
	public void paint(Graphics g) {
		
		for(int i = 0; i < nebeskaTela.size(); i++) {
			g.setColor(nebeskaTela.get(i).boja);
			nebeskaTela.get(i).crtaj(g);
		}
		igrac.crtaj(g);
	}
	
	public synchronized void finish() {
		if(thread != null) {
			thread.interrupt();
			work = false;
		}
		while (thread != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
	}
	
	public void go() {
		if (thread == null) {
			thread = new Thread(this);
			work = true;
		}
		thread.start();
	}

	@Override
	public void run() {
		
		try {
			repaint();
			while(work) {
				thread.sleep(100);
				for(int i = 0; i < nebeskaTela.size(); i++) {
					
					nebeskaTela.get(i).setY(5);
				}
				repaint();
			}
		} catch (InterruptedException e) {}
		
		synchronized (this) {
			thread = null;
			notify();
		}
	}

	public void stvoriIgraca() {
		
		igrac = new Igrac(this.getWidth()/2, this.getHeight() - 10/3, Color.RED, 10);
		
	}

}
