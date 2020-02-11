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
	Random rand = new Random();
	
	public Bubble() {
	
		this.x = rand.nextInt(500);
		this.y = rand.nextInt(500);	
		this.wiggle = 0;
		this.delay = 0;
	}
	
	public void draw(Graphics2D g) {
		Font f = g.getFont();
		g.setFont(f.deriveFont(50.0f));
		g.setColor(Color.white);
		g.drawString(".", this.x+ this.wiggle, this.y);
		
		animate();
	}
	
	public void animate() {
		this.delay += 1;
		this.y -= 3;
		if (this.y < -150) {
			//off the screen
			this.x = rand.nextInt(500);
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

