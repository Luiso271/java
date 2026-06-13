package electrodomesticos;

public class Television extends Electrodomestico{
	
	double pulgadas = 20;
	boolean TDT = false;
	
	Television(){
		super();
	}
	
	Television(double precio, double peso){
		this.precio_base = precio;
		this.peso = peso;
	}
	
	Television(double precio, double peso, String color, char consumo, double pulgadas, boolean TDT){
		super(precio, peso, color, consumo);
		this.pulgadas = pulgadas;
		this.TDT = TDT;
	}
	
	public double getPulgadas() {
		return this.pulgadas;
	}
	
	public boolean getTDT() {
		return this.TDT;
	}
	
	public double precioFinal() {
		double precio = super.precioFinal();
		if(pulgadas > 40) {
			precio = precio + (super.precioFinal() / 100 * 30);
		}
		if(TDT) {
			precio = precio + 50;
		}
		return precio;
	}

}
