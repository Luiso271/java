package figura;

import pruebas.Punto;

public class Main {
	public static void main(String[] args) {
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(5,5);
		Rectangulo r = new Rectangulo();
		
		r.p1 = p1;
		r.p2 = p2;
		
		System.out.println(r.calculaPerimetro());
	}

}
