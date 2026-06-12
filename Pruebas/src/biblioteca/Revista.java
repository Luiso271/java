package biblioteca;

public class Revista {

	Documento d;
	int num_revista;
	
	Revista(String cod, String tit, String anio, int pag, int num){
		this.d = new Documento(cod, tit, anio, pag);
		this.num_revista = num;
	}
	
	public String info() {
		return ("Código - " + this.d.codigo +
				"\nTítulo - " + this.d.titulo +
				"\nAño de publicación - " + this.d.anio_pub +
				"\nNúmero de páginas - " + this.d.paginas +
				"\nNúmero de revista - " + this.num_revista);
	}
	
}
