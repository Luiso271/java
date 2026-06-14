package figura;

import pruebas.Punto;

public class Rectangulo extends Figura{
	
	public Punto p1, p2;
	double lado1 = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
	double lado2 = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
	
	public double calculaPerimetro() {
		return lado1 * 2 + lado2 * 2;
	}
	
	public double calculaArea() {
		return lado1 * lado2;
	}

}
