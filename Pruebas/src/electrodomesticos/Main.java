package electrodomesticos;

public class Main {
	public static void main(String[] args) {
		Electrodomestico e = new Electrodomestico(100, 54, "Rosa", 'F');
		for(int i = 0; i < e.precio_consumo.length; i++) {
			for(int j = 0; j < e.precio_consumo[0].length; j++) {
				System.out.print(e.precio_consumo[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
