package model;

import processing.core.PApplet;

public class Square extends Shapes {
	
	
	public Square (int size,int X, int Y, int direct, int value) {
		
		super(size, X, Y, direct, value);
		
	}
		
	public void draw (PApplet app) {
		
		app.fill(178,102,255);
		app.rect(X, Y, size, size);
		
		app.fill(255);
		app.textSize(size/2);
		app.text(value + "", X, Y);
		
		
		
	}
	
}
