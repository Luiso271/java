package electrodomesticos;

public class Electrodomestico {

	protected double precio_base = 100, peso = 5;
	protected String color = "Blanco";
	protected char consumo = 'F';
	String colores[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
	char consumos[] = {'A', 'B', 'C', 'D', 'E', 'F'};
	boolean check;
	
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
	
}
