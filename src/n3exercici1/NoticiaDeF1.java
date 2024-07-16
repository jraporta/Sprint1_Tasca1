package n3exercici1;

public class NoticiaDeF1 extends Noticia{

	private String escuderia;
	
	public NoticiaDeF1(String titular, String[] campsNoticia) {
		super(titular);
		this.escuderia = campsNoticia[0];
		// TODO Auto-generated constructor stub
	}


	@Override
	public int calcularPreuNoticia() {
		int preu = 100;
		preu += this.escuderia.contentEquals("Ferrari") || this.escuderia.contentEquals("Mercedes") ? 50 : 0;
		return preu;
	}


	@Override
	public int calcularPuntuaciaNoticia() {
		int puntuacio = 4;
		puntuacio += this.escuderia.contentEquals("Ferrari") || this.escuderia.contentEquals("Mercedes") ? 2 : 0;
		return puntuacio;
	}
}
