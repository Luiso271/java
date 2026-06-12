package mascota;

public class Loro {
	
	String origen;
	boolean habla;
	Mascota l;
	
	Loro(String nombre, String fecha, String origen, boolean habla){
		l = new Mascota(nombre, fecha);
		this.origen = origen;
		this.habla = habla;
	}
	
	public String emiteSonido() {
		return "Craaa";
	}
	
	public void volar() {
		System.out.println("El loro vuela");
	}
	
	public void saluda() {
		System.out.println(habla ? "¡Hola!" : "...");
	}
	
	public void caracterisiticas() {
		System.out.println("Nombre - " + l.nombre);
		System.out.println("Fecha de nacimiento - " + l.fechaNacimiento);
		System.out.println("Origen - " + this.origen);
		System.out.println("Habla - " + (this.habla ? "Si" : "No"));
	}

}
