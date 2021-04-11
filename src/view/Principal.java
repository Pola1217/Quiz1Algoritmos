package view;

import processing.core.PApplet;

import controller.Controller;

public class Principal extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Principal");
	}
	
	Controller controller;
	
	
	@Override
	public void settings() {
		
		size(600, 600);
		
	}


	
	@Override
	public void setup() {
		
		textAlign(CENTER,CENTER);
		rectMode(CENTER);
		ellipseMode(CENTER);
		controller = new Controller(this);
		
	}
	
	@Override
	public void draw() {
		
		background(255);
		
	}
	
	@Override
	public void mousePressed() {
		
		
		
	}
	
	
}
