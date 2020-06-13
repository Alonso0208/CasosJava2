import java.text.DecimalFormat;
import java.util.Scanner;
public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero 1: ");
		int numero1= sc.nextInt();
		
		System.out.print("Ingrese n�mero 2: ");
		float numero2 = sc.nextFloat();
		
		System.out.print("Ingrese operaci�n [1-6]: ");
		int op= sc.nextInt();
		
		String nombre= sc.nextLine();
		float operacion= 0;
		
		switch (op) {
			case 1:
				operacion=numero1+numero2;
				nombre= "Suma"; 
			case 2:
				operacion=numero1-numero2;
				nombre= "Resta"; 
			case 3:
				operacion=numero1*numero2;
				nombre= "Producto"; 
			case 4:
				if (numero2>0)
					operacion= numero1/numero2; nombre= "Divisi�n";
				if (numero2==0)
					nombre= "No es posible hallar la divisi�n"; break;
			case 5:
				if (numero2>0)
					operacion=numero1%numero2;
					nombre= "Resto entero";
				if (numero2==0)
					nombre= "No es posible hallar el resto entero"; break;
			case 6:
				operacion=(numero1+numero2)/2;
				nombre= "Promedio"; 
		
			}
		
		System.out.println("==========");
		System.out.println("Resultados");
		System.out.println("==========");
		System.out.println("Primer N�mero: " + (numero1));
		System.out.println("Segundo N�mero: " + (numero2));
		System.out.println("Operaci�n: " + nombre);
		System.out.println("Resultado: " + operacion);
		
		

	}

}
