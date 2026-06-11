package pruebas;

public class Main {
	public static void main(String[] args) {
		
		Linea l = new Linea(new Punto(1,1) , new Punto(5,5));
		System.out.println("La longitud es " + l.longitud());
		System.out.println("Las coordenadas son " + l.coordenadas());
	}

}
