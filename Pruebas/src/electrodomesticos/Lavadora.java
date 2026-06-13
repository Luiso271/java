package electrodomesticos;

public class Lavadora extends Electrodomestico{
	
	double carga = 5;
	
	Lavadora(){
		super();
	}
	
	Lavadora(double precio, double peso){
		this.precio_base = precio;
		this.peso = peso;
	}
	
	Lavadora(double precio, double peso, String color, char consumo, double carga){
		super(precio, peso, color, consumo);
		this.carga = carga;
	}
	
	public double getCarga() {
		return this.carga;
	}
	
	public double precioFinal() {
		if (carga > 30) {
			return super.precioFinal() + 50;
		}else {
			return super.precioFinal();
		}
		
	}

}
