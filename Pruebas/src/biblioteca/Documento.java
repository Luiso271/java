package biblioteca;

public class Documento {

	String codigo, titulo, anio_pub;
	int paginas;
	
	Documento(String cod, String tit, String anio, int pag){
		this.codigo = cod;
		this.titulo = tit;
		this.anio_pub = anio;
		this.paginas = pag;
	}
	
	public String getAnioPub() {
		return this.anio_pub;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public int getNumPag() {
		return this.paginas;
	}
	
}
