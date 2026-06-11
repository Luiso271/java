package pruebas;

import java.lang.Math;

public class Linea {
	
	Punto p1, p2;
	
	Linea(Punto p1, Punto p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void setP1(int x, int y) {
		this.p1 = new Punto(x, y);
	}
	
	public void setP2(int x, int y) {
		this.p2 = new Punto(x, y);
	}
	
	public String getP1() {
		return ("(" + this.p1.x + ", " + this.p1.y + ")");
	}
	
	public String getP2() {
		return ("(" + this.p2.x + ", " + this.p2.y + ")");
	}
	
	public double longitud() {
		double lado1, lado2;
		lado1 = this.p1.x - this.p2.x;
		lado2 = this.p2.y - this.p2.y;
		return Math.sqrt((lado1 * lado1) + (lado2 * lado2));
	}
	
	public String coordenadas() {
		return (getP1() + ", " + getP2());
	}

}
