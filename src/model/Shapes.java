package model;
//import processing.core.PApplet;

public abstract class Shapes {
	
	int X, Y;
	
	int size;
	
	int direcX, direcY, value;
	
	public Shapes (int size, int X, int Y, int direct, int value) {
		
		this.X = X;
		this.Y = Y;
		
		this.size = size;
		
		this.direcX = direct;
		this.direcY = direct;
		
		this.value = value;
		
	}
	
	public void  move () {
		
		X += direcX;
		Y += direcY;
		
	}
	
	public void  limits () {
		
		if(X-size/2<0) {
			direcX = 1;
		}
		
		if(X+size/2>600) {
			direcX = -1;
		}
		
		if(Y-size/2<0) {
			direcY = 1;
		}
		
		if(Y+size/2>600) {
			direcY = -1;
		}
		
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDirecX() {
		return direcX;
	}

	public void setDirecX(int direcX) {
		this.direcX = direcX;
	}

	public int getDirecY() {
		return direcY;
	}

	public void setDirecY(int direcY) {
		this.direcY = direcY;
	}

	public int getNumero() {
		return value;
	}

	public void setNumero(int numero) {
		this.value = numero;
	}
	
	

}
