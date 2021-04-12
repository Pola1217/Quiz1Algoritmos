package controller;

import processing.core.PApplet;

import model.Logic;

import model.Square;
import model.Circle;
import model.Triangle;

public class Controller {

	Logic logic;
	
	boolean typeS;
	
	public Controller(PApplet app) {
		
		logic = new Logic(app);
			
		typeS = true;
		
		logic.createtext(app);
		logic.createshapes();
		
	}
	
	public void draw(PApplet app) {
		
		logic.combine(app);
		logic.draw(app);
		
	}
	
	public void move (int mouseX, int mouseY) {
		
		for(int i = 0;  i < logic.getSquare().size();i++) {
			
			Square actual = logic.getSquare().get(i);
			
			if(actual.getX()-actual.getSize()/2 < mouseX && actual.getX()+actual.getSize()/2>mouseX
				&& actual.getY()-actual.getSize()/2 < mouseY && actual.getY()+actual.getSize()/2>mouseY) {
				
				if(actual.getDirecX() != 0 && actual.getDirecY()!= 0) {actual.setDirecX(0); actual.setDirecY(0);
				
				}
				
				else { actual.setDirecX(-1); actual.setDirecY(1);
				
				}
			}	
		}
		
		for(int i = 0;  i < logic.getCircle().size();i++) {
			
			Circle actual = logic.getCircle().get(i);
		
			if(actual.getX()-actual.getSize()/2 < mouseX && actual.getX()+actual.getSize()/2>mouseX
					&& actual.getY()-actual.getSize()/2 < mouseY && actual.getY()+actual.getSize()/2>mouseY) {
					
					if(actual.getDirecX() != 0 && actual.getDirecY()!= 0) {actual.setDirecX(0); actual.setDirecY(0);
					
					}
					
					else { actual.setDirecX(-1); actual.setDirecY(1);
					
					}
				}	
			}
		
		
		for(int i = 0;  i < logic.getTriangle().size();i++) {
			
			Triangle actual = logic.getTriangle().get(i);
			
			if(actual.getX()-actual.getSize()/2<mouseX&&actual.getX()+actual.getSize()/2>mouseX
					&& actual.getY()-actual.getSize()/2<mouseY&&actual.getY()+actual.getSize()/2>mouseY) {
					
					if(actual.getDirecX() != 0 && actual.getDirecY()!= 0) {actual.setDirecX(0); actual.setDirecY(0);
					
					}
					
					else { actual.setDirecX(-1); actual.setDirecY(1);
					
					}
				}	
			}
		
	}
	
	public void newshape (int mouseX, int mouseY) {
			
			if (typeS==true) {
				
				Square actual = new Square ((int)(20 + (Math.random()*100)), mouseX, mouseY, 5, (int)(Math.random()*10));
				
				logic.getSquare().add(actual);
				
				typeS = false;
				
			}
			
		else {
			
			Circle actual = new Circle ((int)(20 + (Math.random()*100)), mouseX, mouseY, 5, (int)(Math.random()*10));
			
			logic.getCircle().add(actual);
			
			typeS = true;
			
			}	
	}
	
	
	
	
}
	
