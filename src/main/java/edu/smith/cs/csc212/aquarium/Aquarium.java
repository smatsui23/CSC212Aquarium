package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import me.jjfoley.gfx.GFX;
import me.jjfoley.gfx.IntPoint;

/**
 * Aquarium is a graphical "application" that uses some code I built and have
 * shared with you that takes care of opening a window and communicating with
 * the user in a simple way.
 * 
 * The method draw is called 50 times per second, so we make an animation by
 * drawing our fish in one place, and moving that place slightly. The next time
 * draw gets called, our fish looks like it moved!
 * 
 * @author jfoley
 *
 */
public class Aquarium extends GFX {
	
	
	/**
	 * This is a static variable that tells us how wide the aquarium is.
	 */
	public static int WIDTH = 500;
	/**
	 * This is a static variable that tells us how tall the aquarium is.
	 */
	public static int HEIGHT = 500;

	/**
	 * Put a snail on the top of the tank.
	 */
	Snail algorithm = new Snail(177, Snail.HEIGHT + 1, "top");

	/**
	 * This is a constructor, code that runs when we make a new Aquarium.
	 */
	
	
	Bubble crush = new Bubble();
	Bubble [] bubbles = new Bubble[10];
	
	TreasureChest gold = new TreasureChest(0, 485, Color.yellow);
	
	Food seaweedA = new Food(380, 400, Color.green);
	Food seaweedB = new Food(400, 400, Color.green);
	Food seaweedC = new Food(420, 400, Color.green);
	
	Shark Jaws = new Shark(250, 250, Color.gray);
	
	
	public Aquarium() {
		// Here we ask GFX to make our window of size WIDTH and HEIGHT.
		// Don't change this here, edit the variables instead.
		super(WIDTH, HEIGHT);
		
		for (int i = 0; i<bubbles.length; i++) {
			bubbles[i] = new Bubble();
		}
	
	}
	
	
	int fish3X = 100;

	Fish nemo = new Fish(Color.orange,10,10, true, false);
	Fish marlin = new Fish(Color.magenta, 100, 100, true, false);
	Fish fishA = new Fish(Color.yellow, 130, 130, true, false);
	Fish fishB = new Fish(Color.darkGray, 200, 200, false, true);
	Fish fishC = new Fish(Color.green, 400, 300, true, true);

 
	@Override
	public void draw(Graphics2D g) {
		// Draw the "ocean" background.
		g.setColor(Color.blue);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//TO DO: GREENER TANK 
		int R = 0;
		int G = 10;
		int B = 255;
		
		for (int i = 0; i<5; i++) {
			//how to assign the "greener color"
			
			Color Greener = new Color(R, G, B);
			g.setColor(Greener);
			g.fillRect(0, 0, getWidth(), getHeight());
			G += 50;
			B -= 20;
		}
		
		
		
		IntPoint maybeClick = this.processClick();
		if(maybeClick != null) {
			nemo.destX = maybeClick.x;
			nemo.destY = maybeClick.y;
		}
		
		//Draw the fishes
		nemo.draw(g);
		marlin.draw(g);
		fishA.draw(g);
		fishB.draw(g);
		fishC.draw(g);
		

		//Little Fish Moves
		DrawFish.smallFacingRight(g, Color.red,fish3X, 200);

		// Draw our snail!
		algorithm.draw(g);

		// Move the fish!
		fish3X += 3;
		if (fish3X > getWidth()+10) {
			fish3X = 10;
		}
		
		//draw bubbles
		crush.draw(g);
		
		for(Bubble b: this.bubbles) {
			b.draw(g);
		}
		
		//draw TreasureChest
		gold.draw(g);
		
		//draw Food
		seaweedA.draw(g);
		seaweedB.draw(g);
		seaweedC.draw(g);
		
		//draw Shark
		Jaws.draw(g);
				
	}

	public static void main(String[] args) {
		// Uncomment this to make it go slower!
		// GFX.FPS = 10;
		// This is potentially helpful for debugging movement if there are too many print statements!

		// Note that we can store an Aquarium in a variable of type GFX because Aquarium
		// is a very specific GFX, much like 7 can be stored in a variable of type int!
		GFX app = new Aquarium();
		app.start();
	}

}

