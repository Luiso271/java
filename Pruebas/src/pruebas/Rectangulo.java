package pruebas;

public class Rectangulo {
	
	Punto p1, p2;
	
	Rectangulo(Punto p1, Punto p2){
		
		if((p1.x > p2.x) || (p1.y > p2.y)) {
			System.err.println("Error, las coordenadas no corresponden a las esquinas por defecto");
		}else {
			this.p1 = p1;
			this.p2 = p2;
		}
	}
	
	public int area() {
		int lado1 = p2.x - p1.x;
		int lado2 = p2.y - p1.y;
		return lado1 * lado2;
	}
	
	public int perimetro() {
		int lado1 = p2.x - p1.x;
		int lado2 = p2.y - p1.y;
		return ((lado1 * 2) + (lado2 * 2));
	}

}
