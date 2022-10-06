package comunicacion;

public class Alfabeto extends Pictograma{
	
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion ) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}

	public String interpretacion() {
		return getInterpretacion();
	}
	
	public String toString() {
		String alfabeto = "a, b, c, d, e, f, g,"
				+ " h, i, j, k, l, m, n,"
				+ " ñ, o, p, q, r, s, t,"
				+ " u, v, w, x, y, z";
		
		return alfabeto;
	}
	
}
