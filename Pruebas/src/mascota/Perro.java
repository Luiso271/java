package mascota;

public class Perro {
	
	String raza;
	boolean pulgas;
	Mascota p;
	
	Perro(String nombre, String fecha, String raza, boolean pulgas){
		p = new Mascota(nombre, fecha);
		this.raza = raza;
		this.pulgas = pulgas;
	}
	
	public String emiteSonido() {
		return "Guau";
	}
	
	public void caracterisiticas() {
		System.out.println("Nombre - " + p.nombre);
		System.out.println("Fecha de nacimiento - " + p.fechaNacimiento);
		System.out.println("Raza - " + this.raza);
		System.out.println("Pulgas - " + (this.pulgas ? "Si" : "No"));
	}

}
