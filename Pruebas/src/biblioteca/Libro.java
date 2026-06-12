package biblioteca;

public class Libro {
	
	Documento d;
	String autor;
	
	Libro(String cod, String tit, String anio, int pag, String autor){
		this.d = new Documento(cod, tit, anio, pag);
		this.autor = autor;
	}
	
	public String info() {
		return ("Código - " + this.d.codigo +
				"\nTítulo - " + this.d.titulo +
				"\nAño de publicación - " + this.d.anio_pub +
				"\nNúmero de páginas - " + this.d.paginas +
				"\nAutor - " + this.autor);
	}
	
	

}
