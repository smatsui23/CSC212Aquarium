package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bubble {
	//Every fish has an z position that has an int. 
	int x; 
	int y;
	Color color;
	 
	
	public Bubble(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;	

	}
	
	public void drift() {
		this.y += 1;
	}
	
}
