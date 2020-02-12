package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Shark {
	int x;
	int y;
	Color color;
	
	Shark (int startX, int startY, Color startColor){
		this.x = startX;
		this.y = startY;
		this.color = startColor;
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.gray); 
		g.fillOval(x,y,150,60); //body
		g.fillOval(x+60, y-20, 30,40); //fin
		g.fillOval(x+140, y, 25,50); //tail
		
		g.setColor(Color.black); 
		g.fillOval(x+15,y+15,10,10);//eye
		
		
	
		
	}
	
}

