package model;

import processing.core.PApplet;

public class Triangle extends Shapes {

	private int R, G, B;
	
	public Triangle(int X, int Y, int size, int direct, int numero, PApplet app) {
		super(X, Y, size, direct, numero, app);
		// TODO Auto-generated constructor stub
		
		//random for the figures colors
		R = (int) (Math.random()*255);
		G = (int) (Math.random()*255);
		B = (int) (Math.random()*255);
		
	}
	
	public void drawtriangle (PApplet app) {
		
		app.rect(X, Y, size, size);
		app.fill(R,G,B);
		app.textSize(size/2);
		app.text(numero + "", X, Y);
		
	}
	

}
