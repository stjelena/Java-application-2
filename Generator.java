package svemir;

import java.awt.Color;
import java.util.Random;

public class Generator extends Thread{
	
	private Svemir svemir;
	public boolean work;
	
	public Generator(Svemir svemir) {
		this.svemir = svemir;
	}
	
	@Override
	public void run() {
		
		try {
		
		while(!Thread.interrupted()) {
			
			  Random rand = new Random(); 
		      int x_random = rand.nextInt(200); 
		      
		      Random rand2 = new Random();
		      int low = 10;
		      int high = 30;
		      int r_rand = rand2.nextInt(high-low) + low;
		      
			  svemir.dodajNebeskoTelo(
					new Kometa(x_random, 0, Color.GRAY, r_rand)
					 // new NebeskoTelo(x_random, 0, Color.GRAY, r_rand)
					);
			  
			  sleep(900);
		}}
		catch(InterruptedException e) {}
		
	}
	
	
	public synchronized void go() {
		work = true;
		notify();
	}
	
	public synchronized void finish() {
		if(this != null) {
			interrupt();
			work = false;
		}
		while (this != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
	}
	
	
	

}
