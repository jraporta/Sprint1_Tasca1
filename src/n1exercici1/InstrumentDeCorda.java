package n1exercici1;

public class InstrumentDeCorda extends Instrument{
	
	static {
		System.out.println("La classe InstrumentDeCorda s'ha carregat");
	}

	public InstrumentDeCorda(String nom, int preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Està sonant un instrumet de corda");
	}

}
