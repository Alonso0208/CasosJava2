import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int n = sc.nextInt();
		
		String mensaje = "";
		
		if (n%2 == 0)
			mensaje = "El N�mero es par";
		else
			mensaje = "El N�mero es impar";
		
		System.out.println("Respuesta: " + mensaje);


	}

}
