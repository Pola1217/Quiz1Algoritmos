package view;

import processing.core.PApplet;

import controller.Controller;

public class Principal extends PApplet {

	public static void main(String[] args) {
		PApplet.main("view.Principal");
	}
	
	Controller controller;
	
	@Override
	public void settings() {
		
		size(600, 600);
		
	}
	
	@Override
	public void setup() {
		
		controller = new Controller(this);
		
		textAlign(CENTER);

		rectMode(CENTER);
		ellipseMode(CENTER);
		
	}
	
	@Override
	public void draw() {
		
		background(0);
		controller.draw(this);
		
	}
	
	@Override
	public void mousePressed() {
		
		controller.move(mouseX, mouseY);
		
		if(mouseButton == RIGHT) {
			
		controller.newshape(mouseX, mouseY);
		
		}
		
	}
	
	
}
