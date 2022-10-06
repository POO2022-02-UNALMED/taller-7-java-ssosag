package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis (String origen, String titulo, String autor, int paginas,
			String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}

	public int getNumeroArgumentos() {
		return argumentos.length;
	}
	
	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int paginas) {
		int numeroPalabras = getPaginas()*paginas*5; 
		return numeroPalabras;
	}

	public String interpretacion() {
		return getInterpretacion();
	}
	
	public String toString() {
		String informacion = getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" 
	+ getPaginas() + "\n" + getIdea() + "\n" + getNumeroArgumentos() + "\n" + getConclusion()+ "\n"
	+getReferencias();
	
		return informacion;
	}
	
}