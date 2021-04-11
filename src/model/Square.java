package model;

import processing.core.PApplet;

public class Square extends Shapes {
	
	private int R, G, B;
	
	public Square(int X, int Y, int size, int direct, int numero, PApplet app) {
		
		super(X, Y, size, direct, numero, app);
		
		// TODO Auto-generated constructor stub
		
		R = (int) (Math.random()*255);
		G = (int) (Math.random()*255);
		B = (int) (Math.random()*255);
		
	}

	public void drawsquare (PApplet app) {
		
		app.rect(X, Y, size, size);
		app.fill(R,G,B);
		app.textSize(size/2);
		app.text(numero + "", X, Y);
		
	}
	
}
