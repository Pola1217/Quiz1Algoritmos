package model;

import java.util.ArrayList;

import model.Circle;
import model.Square;
import model.Triangle;

public class Logic {

	private String[] texto;
	private String[] lineas;
	
	//arrey words
	private ArrayList <String> words;
	
	//array shapes
	private ArrayList <Square> square;
	private ArrayList <Circle> circle;
	private ArrayList <Triangle> triangle;
	
	public Logic(){
		
		//creates word array
		words = new ArrayList<>();
		
		//creates arrays
		square = new ArrayList<>();
		circle = new ArrayList<>();
		triangle = new ArrayList<>();
		//prueba = 0;
	}
	
	
	
	
}
