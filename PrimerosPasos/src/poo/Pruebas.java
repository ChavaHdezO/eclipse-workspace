package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("María");
		trabajador1.cambiaSeccion("RRHH");
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		System.out.println(Empleados.dameIdSiguiente());
		//Empleados.Id++;
		//System.out.println(trabajador2.devuelveDatos());
		//Empleados.Id++;
		//System.out.println(trabajador3.devuelveDatos());
		//System.out.println(trabajador4.devuelveDatos());
		
	}

}

class Empleados {
	
	public Empleados(String nom) {
		//this.Id = Id;
		nombre = nom;
		seccion = "Administración";
		Id = IdSiguiente;
		IdSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String devuelveDatos() {
		return "El nombre es "  + nombre + " y la sección es " + seccion + " y el Id = " + Id;
	}
	
	public static String dameIdSiguiente() {
		return "El Id siguiente es: " + IdSiguiente;
	}
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;
}