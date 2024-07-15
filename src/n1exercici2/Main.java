package n1exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cotxe cotxe1 = new Cotxe(2000);
		
		//Invocació de mètode static
		Cotxe.frenar();
		
		//Invocació de mètode no static
		cotxe1.accelerar();
		
		//Comprovar funcionament de la resta de mètodes
		System.out.println(cotxe1);
		cotxe1.setModel("Superstar");
		System.out.println(cotxe1);
	

	}

}
