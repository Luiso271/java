package mascota;

public class Gato {
	
	boolean peloLargo;
	String color;
	Mascota g;
	
	Gato(String nombre, String fecha, boolean pelo, String color){
		g = new Mascota(nombre, fecha);
		this.peloLargo = pelo;
		this.color = color;
	}
	
	public String emiteSonido() {
		return "Miau";
	}
	
	public void caracterisiticas() {
		System.out.println("Nombre - " + g.nombre);
		System.out.println("Fecha de nacimiento - " + g.fechaNacimiento);
		System.out.println("Color - " + this.color);
		System.out.println("Pelo largo - " + (this.peloLargo ? "Si" : "No"));
	}

}
