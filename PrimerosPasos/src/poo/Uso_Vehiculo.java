package poo;

//import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Coche Renault = new Coche(); // Instanciar una clase (Renault es un Ejemplar de clase).
		//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
		//System.out.println(Renault.getLargo());
		//Coche micoche = new Coche();
		//micoche.setColor(JOptionPane.showInputDialog("Introduce color"));
		//System.out.println(micoche.getDatosGenerales());
		//System.out.println(micoche.getColor());
		//micoche.setAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		//System.out.println(micoche.getAsientos());
		//micoche.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		//System.out.println(micoche.getClimatizador());
		//System.out.println(micoche.getSetPesoCoche());
		//System.out.println("El precio del coche es " + micoche.getPrecioCoche());
		Coche micoche1 = new Coche();
		micoche1.setColor("Rojo");
		Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
		mifurgoneta1.setColor("Blanco");
		mifurgoneta1.setAsientos("Si");
		mifurgoneta1.setClimatizador("Si");
		System.out.println(micoche1.getDatosGenerales() + " " + micoche1.getColor());
		System.out.println(mifurgoneta1.getDatosGenerales() + " " + mifurgoneta1.dimeDatosFurgoneta());
	}
}
