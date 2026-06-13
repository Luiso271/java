package electrodomesticos;

public class Electrodomestico {

	protected double precio_base = 100, peso = 5;
	protected String color = "Blanco";
	protected char consumo = 'F';
	String colores[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
	char consumos[] = {'A', 'B', 'C', 'D', 'E', 'F'};
	boolean check;
	String precio_consumo[][] = {{"A","B", "C", "D", "E", "F" }, {"100", "80", "60", "50", "30", "10"}};
	double precio_peso[][] = {{19, 49, 79, 80}, {10, 50, 80, 100}};
	
	Electrodomestico(){
		
	};
	
	Electrodomestico(double precio, double peso){
		this.precio_base = precio;
		this.peso = peso;
	}
	
	Electrodomestico(double precio, double peso, String color, char consumo){
		this.precio_base = precio;
		this.peso = peso;
		if(comprobarColor(color)) {
			this.color = color;
		}
		if(comprobarConsumo(consumo)) {
			this.consumo = consumo;
		}
		
	}
	
	public double getPrecio() {
		return this.precio_base;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public char getConssumo() {
		return this.consumo;
	}
	
	private boolean comprobarConsumo(char letra) {
		for(int i = 0; i < consumos.length; i++) {
			if(letra == consumos[i]) {
				return true;
			}
		}
		return false;
	}
	
	private boolean comprobarColor(String color) {
		for(int i = 0; i < colores.length; i++) {
			if(color.equals(colores[i])) {
				return true;
			}
		}
		return false;
	}
	
	public double precioFinal() {
		double p_cons = 0, p_pes = 0;
		for(int i = 0; i < precio_consumo.length; i++) {
			if(precio_consumo[0][i].equals(String.valueOf(this.consumo))) {
				p_cons = Double.parseDouble(precio_consumo[1][i]);
			}
		}
		for(int i = 0; i < precio_peso.length; i++) {
			if(precio_peso[0][i] == this.peso) {
				p_pes = precio_peso[1][i];
			}
		}
		return this.precio_base + p_cons + p_pes;
	}
	
}
