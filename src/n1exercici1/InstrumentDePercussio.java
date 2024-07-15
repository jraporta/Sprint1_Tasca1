package n1exercici1;

public class InstrumentDePercussio extends Instrument {
	
	static {
		System.out.println("La classe InstrumentDePercussio s'ha carregat");
	}
	
	public InstrumentDePercussio(String nom, int preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Està sonant un instrumet de percussió");
	}

}
