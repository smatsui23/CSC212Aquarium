package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	//Every fish has an z position that has an int. 
	int x; 
	int y;
	Color color;
	boolean isLittle;
	boolean facingLeft;
	
	//every fish has a destination
	int destX;
	int destY; 
	
	public Fish(Color color, 
			int x, int y, 
			boolean isLittle) {
		this.color = color;
		this.x = x;
		this.y = y;	
		this.isLittle = isLittle;
		
		this.destX = 450;
		this.destY = 450;
	}
	
	public void swim() {
		//"Fish Destination System"
		if (this.y < this.destY) {
			this.y += 1;
		}
		
	}
	
	public void draw(Graphics2D g) {
		this.swim();
		
		//Not all fish should be small and facing left
		//need some if statements 
		
		DrawFish.smallFacingLeft(g, 
				this.color, this.x, this.y);
		
	}
	}
