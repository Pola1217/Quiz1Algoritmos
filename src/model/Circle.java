package model;

import processing.core.PApplet;

public class Circle extends Shapes {
	
	public Circle(int size, int X, int Y, int direct, int value) {
		
		super(size, X, Y, direct, value);
		
	}

	public void draw (PApplet app) {
		
		app.fill(255,153,255);
		app.ellipse(X, Y, size+2, size+2);
		
		app.fill(255);
		app.textSize(size/2);
		app.text(value + "", X, Y);
		
	}
	
	
	
}
