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
		g.fillRect(x-5, y-15, 120, 80);
		
		//make TC more fancy? 
		//for (int w=-3; w<8; w++) {
		//	g.setColor(Color.ORANGE);
		//	g.fillOval(x+w*12,  y-5, 6, 4);
		//}
		
	}
	
	
	

}
