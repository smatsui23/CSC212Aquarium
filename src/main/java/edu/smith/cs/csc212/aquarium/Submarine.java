package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Submarine {
	int x;
	int y;
	Color color;
	
	Submarine(int startX, int startY, Color startColor){
		this.x = startX;
		this.y = startY;
		this.color = startColor;
		
		
	}
	public void draw(Graphics2D g) {
		g.setColor(this.color);
		g.fillOval(x-20,  y-4,  40, 8);
	}
	
	

}
