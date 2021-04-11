package model;

import processing.core.PApplet;

public class Circle extends Shapes {

	private int R, G, B;
	
	public Circle(int X, int Y, int size, int direct, int numero, PApplet app) {
		super(X, Y, size, direct, numero, app);
		// TODO Auto-generated constructor stub
		
		//random for the figures colors
		R = (int)(Math.random()*11);
		G = (int)(Math.random()*11);
		B = (int)(Math.random()*11);
		
	}

	public void drawcircle (PApplet app) {
		
		
		
	}
}
