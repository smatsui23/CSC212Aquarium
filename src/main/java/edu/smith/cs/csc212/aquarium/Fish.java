package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.lang.Math;
import java.awt.Graphics2D;
import java.util.Random;

public class Fish {
	//Every fish has an z position that has an int. 
	int x; 
	int y;
	Color color;
	boolean isLittle;
	boolean facingLeft;
	Random rand = new Random();
	
	//every fish has a destination
	int destX;
	int destY; 
	
	
	public Fish(Color color, 
			int x, int y, 
			boolean isLittle, boolean facingLeft) {
		this.color = color;
		this.x = x;
		this.y = y;	
		this.isLittle = isLittle;
		this.facingLeft = facingLeft;
		
		this.destX = rand.nextInt(500);
		this.destY = rand.nextInt(500);
	
	}
	
	public void swim() {
		
		//"Fish Destination System"
		if(this.x < this.destX) {
			this.x += 1;
		}
		if(this.x > this.destX) {
			this.x -= 1; 
		}
		
		if (this.y < this.destY) {
			this.y += 1;
		}
		if(this.y > this.destY) {
			this.y -= 1;
		}
		
		//chose new destination when it is close to the current destination
		if (Math.abs(this.destX-this.x) < 5 &&  Math.abs(this.destY-this.y) < 5) {
			this.destX = rand.nextInt(500);
			this.destY = rand.nextInt(500);
		}
	}
		

	public void draw(Graphics2D g) {
		this.swim();
		
		//Not all fish should be small and facing left
		//need some if statements 
		if (isLittle && facingLeft) {
			DrawFish.smallFacingLeft(g, 
				this.color, this.x, this.y);
			
			if(this.x < this.destX) {
				facingLeft = false; 
				DrawFish.smallFacingRight(g,
						this.color, this.x, this.y);
			}
		}	
		
		else if (isLittle && facingLeft != true) {
			DrawFish.smallFacingRight(g, 
				this.color, this.x, this.y);
				
			if(this.x > this.destX) {
				facingLeft = true;
				DrawFish.smallFacingLeft(g,
					this.color, this.x, this.y);
				}
		}
			
	}
}
