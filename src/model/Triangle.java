package model;

import processing.core.PApplet;

public class Triangle extends Shapes {

	
	public Triangle( int size, int X, int Y, int direct, int value) {
		
		super(size, X, Y, direct, value);
		
	}
	
	public void draw (PApplet app) {
		
		app.fill(255,204,229);
		
		app.triangle(X, Y-size, X-size, Y+size, X+size, Y+size);
		
		app.fill(255);
		app.textSize(size-30);
		app.text(value + " ", X, Y);
		
		
	}
	

}
