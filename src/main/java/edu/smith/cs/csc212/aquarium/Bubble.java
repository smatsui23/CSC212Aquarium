package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.Random;

public class Bubble {
	int x;
	int y;
	int wiggle;
	int delay;
	int size;
	Random rand = new Random();
	
	public Bubble() {
	
		this.x = rand.nextInt(500);
		this.y = rand.nextInt(500);	
		this.wiggle = 0;
		this.delay = 0;
		this.size = rand.nextInt(900);
	}
	
	public void draw(Graphics2D g) {
		//TO DO: randomly sized bubble for each of the 10 sets 
		
		//for (int i = 0; i<bubbles.length; i++) {
			//Font f = g.getFont();
			//g.setFont(f.deriveFont(this.size));
		//}
		
		Font f = g.getFont();
		g.setFont(f.deriveFont(this.size));
		
		//g.setFont(f.deriveFont((float) 50.0));
		g.setColor(Color.white);
		g.drawString(".", this.x+ this.wiggle, this.y);
		
		
		animate();
	}
	
	public void animate() {
		this.delay += 1;
		this.y -= 3;
		if (this.y < -150) {
			//off the screen
			this.x = rand.nextInt(130);
			this.y = 550;
			
		}
		if (this.delay > 100) {
			this.delay = 0;
			this.x -= 40;
			if (this.x < 0 ) {
				this.x = 500;
			}
		}
		
		//(int) tells Java that we don't care about fraction
		this.wiggle = (int)(30.0 * Math.sin(this.y/40.0));
		
	}

}

