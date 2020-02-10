package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Bubble {
	int x;
	int y;
	int wiggle;
	public Bubble() {
		this.x = 250;
		this.y = 250;	
		this.wiggle = 0;
	}
	
	public void draw(Graphics2D g) {
		Font f = g.getFont();
		g.setFont(f.deriveFont(50.0f));
		g.setColor(Color.white);
		g.drawString(".", this.x+ this.wiggle, this.y);
		
		animate();
	}
	
	public void animate() {
		this.y -= 3;
		if (this.y < -50) {
			this.y = 550;
			
		}
		//(int) tells Java that we don't care about fraction
		this.wiggle = (int)(30.0 * Math.sin(this.y/40.0));
		
	}

}

