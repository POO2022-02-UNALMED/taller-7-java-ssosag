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
		String alfabeto = "";
		int e = 0;
		for(String i:letras) {
			e += 1;
			if(e != letras.length) {
				alfabeto += i + ", ";
			}
			else {
				alfabeto += i;
			}
		}
		return alfabeto;
	}
	
}
