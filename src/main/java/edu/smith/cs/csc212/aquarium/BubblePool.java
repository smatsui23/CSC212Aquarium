
package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import me.jjfoley.gfx.GFX;

public class BubblePool extends GFX {
	
	Bubble crush = new Bubble();
	
	public void draw(Graphics2D g) {
		//This is the ocean
		g.setColor(Color.blue);
		g.fillRect(0, 0, getWidth(), getHeight());
		//Draw our wave
		crush.draw(g);
	
	}
	
	public static void main(String[] args) {
		BubblePool app = new BubblePool();
		app.start();
	}

}
