package pruebas;

import java.lang.Math;

public class Punto {
	
	int x, y;
	
	Punto(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void imprime() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void desplaza(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}
	
	public double distancia(Punto p) {
		double lado1, lado2;
		lado1 = p.x - this.x;
		lado2 = p.y - this.y;
		return Math.sqrt((lado1 * lado1) + (lado2 * lado2));
	}
}
