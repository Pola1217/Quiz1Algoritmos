package model;

import java.util.ArrayList;

import model.Circle;
import model.Square;
import model.Triangle;
import processing.core.PApplet;

public class Logic {
	
	//arrey words
	private ArrayList <String> words;
	
	//array shapes
	private ArrayList <Square> square;
	private ArrayList <Circle> circle;
	private ArrayList <Triangle> triangle;
	
	//text 
	private String[] text;
	private String[] lines;
	
	int shapee;
	
	public Logic (PApplet app) {
		
		//creates word array
		words = new ArrayList<>();
		
		//creates arrays
		square = new ArrayList<>();
		circle = new ArrayList<>();
		triangle = new ArrayList<>();
		shapee = 0;
		
		//create text
		text = app.loadStrings("archivoTXT.txt");
	}
	
	public void createtext(PApplet app) {
		
		for (int i = 0; i < text.length; i++) {
			lines = PApplet.split(text[i], " ");
			
			for (int j = 0; j < lines.length; j++) {
				words.add(lines[j]);}}
			
		
	}
	
	public void createshapes(PApplet app) {
		
		for (int i = 0; i < words.size(); i++) {
			
			if (words.get(i).equals("Square")) {
				
				int index = i;
				
				int X = Integer.parseInt(words.get(index+2));
				int Y = Integer.parseInt(words.get(index+3));
				int size = Integer.parseInt(words.get(index+1));
				int direct = Integer.parseInt(words.get(index+4));
				int numero = Integer.parseInt(words.get(index+5));
				
				Square newSquare = new Square (X, Y, size, direct, numero, app);
				
				square.add(newSquare);
				
				shapee++;
			}
		
			if (words.get(i).equals("Circulo")) {
				
				int index = i;
				
				int X = Integer.parseInt(words.get(index+2));
				int Y = Integer.parseInt(words.get(index+3));
				int size = Integer.parseInt(words.get(index+1));
				int direct = Integer.parseInt(words.get(index+4));
				int numero = Integer.parseInt(words.get(index+5));
				
				Circle newCircle = new Circle(X, Y, size, direct, numero, app);
				
				circle.add(newCircle);
				
				shapee++;}
			}
		
		
	}
	
	public void drawshapes(PApplet app) {
		
		
		
		
		for (int i = 0; i < square.size(); i++) {
			Square actual = square.get(i);
			actual.drawsquare(app);
			actual.move();
			actual.limits();
		}
		
		for (int i = 0; i < circle.size(); i++) {
			Circle actual = circle.get(i);
			actual.drawcircle(app);
			actual.move();
			actual.limits();
		}
		
		for (int i = 0; i < triangle.size(); i++) {
			Triangle actual = triangle.get(i);
			actual.drawtriangle(app);
			actual.move();
			actual.limits();
		}
	
	}
}
