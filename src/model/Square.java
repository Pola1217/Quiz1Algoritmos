package model;

import processing.core.PApplet;

public class Square extends Shapes {
	
	private int R, G, B;
	
	public Square(int X, int Y, int size, int direct, int numero, PApplet app) {
		super(X, Y, size, direct, numero, app);
		// TODO Auto-generated constructor stub
		
		R = (int)(Math.random()*11);
		G = (int)(Math.random()*11);
		B = (int)(Math.random()*11);
		
	}

	public void drawsquare (PApplet app) {
		
		
		
	}
	
}
