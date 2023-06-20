package svemir;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Simulator extends Frame {
	
	private Svemir svemir = new Svemir(this);
	private Panel komande = new Panel();
	//private Panel centralniPanel = new Panel();
	private Generator generator;
	
	public Simulator() {
		setBounds(700, 200, 200, 800);
		
		populateWindow();
		pack();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		revalidate();
		setVisible(true);
	}

	private void populateWindow() {

		svemir.setBackground(Color.BLACK);
		add(svemir, BorderLayout.CENTER);
		
		Button pokreni = new Button("Pokreni!");
		
		pokreni.addActionListener((ae) -> {
			
			if(svemir.work && generator.work)
				pokreni.setEnabled(false);
			
			else {
			
			svemir.stvoriIgraca();
			svemir.repaint();
			
			if(generator!=null) {
				generator.interrupt();
			}
			generator = new Generator(svemir);
			
			generator.start();
			generator.go();
			svemir.go();
			

			}
		});
		
		
		komande.add(pokreni);
		add(komande, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		new Simulator();
	}

}
