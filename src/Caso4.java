import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("N�mero 2: ");
		int n2 = sc.nextInt();
		
		String mensaje= "";
		
		if (n1 == n2)
			mensaje = "Los dos n�meros son iguales";
		else if (n1 < n2)
			mensaje = "El primer n�mero es menor";
		else
		    mensaje = "El segundo n�mero es menor";
		
		System.out.println("Respuesta: " + mensaje);
	}

}
