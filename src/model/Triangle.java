package model;

import processing.core.PApplet;

public class Triangle extends Shapes {

	private int R, G, B;
	
	public Triangle(int X, int Y, int size, int direct, int numero, PApplet app) {
		super(X, Y, size, direct, numero, app);
		// TODO Auto-generated constructor stub
		
		//random for the figures colors
		R = (int)(Math.random()*20);
		G = (int)(Math.random()*11);
		B = (int)(Math.random()*11);
		
	}
	

}
