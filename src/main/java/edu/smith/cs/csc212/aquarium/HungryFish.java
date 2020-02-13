package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class HungryFish {
	int x;
	int y;
	Color color;
	
	HungryFish(int startX, int startY, Color startColor){
		this.x = startX;
		this.y = startY;
		this.color = startColor;
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.yellow);
		g.fillRect(x-10,y-15,10,140);
		g.setColor(this.color);
		g.fillRect(x-5, y-15, 10, 150);
		
	}

}
