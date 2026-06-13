package electrodomesticos;

public class Main {
	public static void main(String[] args) {
		Lavadora l = new Lavadora(500, 96, "Azul",'A', 50);
		System.out.println(l.precioFinal());
	}
	

}
