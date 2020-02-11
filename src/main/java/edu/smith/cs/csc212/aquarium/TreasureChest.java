package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class TreasureChest {
	int x;
	int y;
	Color color;
	
	TreasureChest(int startX, int startY, Color startColor){
		this.x = startX;
		this.y = startY;
		this.color = startColor;
	}
	
	public void draw(Graphics2D g) {
		g.setColor(this.color);
		g.fillRect(x-7, y-15, 14, 10);
		
		
	}
	
	
	

}
