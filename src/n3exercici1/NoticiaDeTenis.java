package n3exercici1;

public class NoticiaDeTenis extends Noticia{
	
	private String competicio;
	private String tenista;
	
	public NoticiaDeTenis(String titular, String[] campsNoticia) {
		super(titular);
		this.competicio = campsNoticia[0];
		this.tenista = campsNoticia[1];
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int calcularPreuNoticia() {
		int preu = 150;
		preu += this.tenista.contentEquals("Federer") || this.tenista.contentEquals("Nadal") || this.tenista.contentEquals("Djokovic") ? 100 : 0;
		return preu;
	}

	@Override
	public int calcularPuntuaciaNoticia() {
		int puntuacio = 4;
		puntuacio += this.tenista.contentEquals("Federer") || this.tenista.contentEquals("Nadal") || this.tenista.contentEquals("Djokovic") ? 3 : 0;
		return puntuacio;
	}

}
