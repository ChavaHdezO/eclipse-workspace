
public class Ejemplo_Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int saldo = 10000;
		float porcentaje = .10f;
		double [][] tabla = new double[6][5]; 
		for(int i = 0; i < 6; i++) {
			tabla[i][0] = saldo;
			for(int j = 1; j < 5; j++) {
				tabla[i][j] = (tabla[i][j-1]+(tabla[i][j-1]*porcentaje));
			}
			porcentaje = porcentaje + .01f;
		}
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%1.2f ", tabla[i][j]);
			}
			System.out.println(" ");
		}

	}

}
