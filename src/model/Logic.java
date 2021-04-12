package model;

import processing.core.PApplet;
import java.util.ArrayList;

//import model.Circle;
//import model.Square;
//import model.Triangle;


public class Logic {
	
	//text 
	private String[] text;
	private String[] lines;
	
	//array words
	private ArrayList <String> words;
	
	//array shapes
	private ArrayList <Square> square;
	private ArrayList <Circle> circle;
	private ArrayList <Triangle> triangle;
	
	
	
	public Logic () {
		
		//creates word array
		words = new ArrayList<>();
		
		//creates arrays
		square = new ArrayList<>();
		circle = new ArrayList<>();
		triangle = new ArrayList<>();
		
		
		
	}
	
	public void createtext(PApplet app) {
		
	text = app.loadStrings("texto/texto.txt");
		
		for (int i = 0; i < text.length; i++) {
			
			lines = PApplet.split(text[i]," ");
			
			for (int j = 0; j < lines.length; j++) {
				
				words.add(lines[j]);
				
			}
			
		}
			
	}
	
	public void createshapes() {
		
		for (int i = 0; i < words.size(); i++) {
			
			if (words.get(i).equals("Cuadrado")) {
				
				int size = Integer.parseInt(words.get(i+1));
				
				int X = Integer.parseInt(words.get(i+2));
				int Y = Integer.parseInt(words.get(i+3));
				
				int direct = Integer.parseInt(words.get(i+4));
				int numero = Integer.parseInt(words.get(i+5));
				
				Square newSquare = new Square (size, X, Y, direct, numero);
				
				square.add(newSquare);
				
			}
		
			if (words.get(i).equals("Circulo")) {
				
				int size = Integer.parseInt(words.get(i+1));
				
				int X = Integer.parseInt(words.get(i+2));
				int Y = Integer.parseInt(words.get(i+3));
				
				int direct = Integer.parseInt(words.get(i+4));
				int numero = Integer.parseInt(words.get(i+5));
				
				Circle newCircle = new Circle (size, X, Y, direct, numero);
				
				circle.add(newCircle);
				
				
			}
		}
	}
	
	public void draw(PApplet app) {
			
			
			for (int i = 0; i < square.size(); i++) {
				
				Square actual = square.get(i);
				
				actual.draw(app);
				actual.move();
				actual.limits();
				
			}
			
			for (int i = 0; i < circle.size(); i++) {
				
				Circle actual = circle.get(i);
				
				actual.draw(app);
				actual.move();
				actual.limits();
				
			}
			
			for (int i = 0; i < triangle.size(); i++) {
				
				Triangle actual = triangle.get(i);
				
				actual.draw(app);
				actual.move();
				actual.limits();
				
			}
		
		}
	
	
	
	public void combine (PApplet app) {

		int more = 0;
		boolean combine = false;
		
		//fusion square-square
				for(int i=0;i < square.size(); i++) {
					
					for(int j=1;j < square.size();j++) {
						
					Square actual = square.get(i);
					Square actual1 = square.get(j);
					
					if(actual.getSize()>actual1.getSize()) { 
						
						more = actual.getSize();
					
					}
					
					if(actual.getSize()<actual1.getSize()) {
						
						more = actual1.getSize();
					
					if(PApplet.dist(actual.getX(),actual.getY(),actual1.getX(),actual1.getY())< more) {
						
						combine = true;
						
					}
						if(combine == true) {
						
							int size = actual.getSize()+actual1.getSize();
							
							int X = (actual.getX()+actual1.getX());
							int Y = (actual.getY()+actual1.getY());
							
							int direct = 1;
							
							int value = actual.getValue()+actual1.getValue();
							
						
						Triangle newTri = new Triangle (size, X, Y, direct, value);
						
						triangle.add(newTri);
						square.remove(actual);
						square.remove(actual1);
						
						
						combine = false;
					}
						
				}
			}
				
		}
				
		//fusion circle-circle	
		for(int i=0; i < circle.size();i++) {
			
					for(int j=1; j < circle.size();j++) {
						
					Circle actual = circle.get(i);
					Circle actual1 = circle.get(j);
					
					if(actual.getSize()>actual1.getSize()) {
						
						more = actual.getSize();
					
					}
					
					if(actual.getSize()<actual1.getSize()) {
						
						more = actual1.getSize();
					
					if(PApplet.dist(actual.getX(),actual.getY(),actual1.getX(),actual1.getY()) < more) {
						
						combine = true;
						
					}
					
						if(combine == true) {
							
							int size = actual.getSize()+actual1.getSize();
							
							int X = (actual.getX()+actual1.getX());
							int Y = (actual.getY()+actual1.getY());
							
							int value = actual.getValue()+actual1.getValue();
							
							int direct = 1;
						
						Triangle newTri = new Triangle (size, X, Y, direct, value);
						
						triangle.add(newTri);
						circle.remove(actual);
						circle.remove(actual1);
						
						combine = false;
						
					}
				}
					
			}
					
		}
					
		//fusion square-circle
		for(int i = 0; i < square.size();i++) {
			
			Square actual = square.get(i);
			
			for (int j = 0;j < circle.size();j++) {
				
			Circle actual1 = circle.get(j);
			
			if(PApplet.dist(actual.getX(),actual.getY(),actual1.getX(),actual1.getY()) < actual1.getSize()) {
				
				combine = true;
				
			}
			
				if(combine == true) {
					
					int size = actual.getSize()+actual1.getSize();
					
					int X = (actual.getX()+actual1.getX())/2;
					int Y = (actual.getY()+actual1.getY())/2;
					
					int value = actual.getValue()+actual1.getValue();
					
					int direct = 1;
				
				Triangle newTri = new Triangle (size, X, Y, direct, value);
				
				triangle.add(newTri);
				square.remove(actual);
				circle.remove(actual1);
				
				combine = false;
				
			}
		}
	}

}
	
	public ArrayList<String> getWords() {
		return words;
	}
	public void setWords(ArrayList<String> words) {
		this.words = words;
	}
	public ArrayList<Square> getSquare() {
		return square;
	}
	public void setSquare(ArrayList<Square> square) {
		this.square = square;
	}
	public ArrayList<Circle> getCircle() {
		return circle;
	}
	public void setCircle(ArrayList<Circle> circle) {
		this.circle = circle;
	}
	public ArrayList<Triangle> getTriangle() {
		return triangle;
	}
	public void setTriangle(ArrayList<Triangle> triangle) {
		this.triangle = triangle;
	}
	public String[] getText() {
		return text;
	}
	public void setText(String[] text) {
		this.text = text;
	}
	public String[] getLines() {
		return lines;
	}
	public void setLines(String[] lines) {
		this.lines = lines;
	}

}
