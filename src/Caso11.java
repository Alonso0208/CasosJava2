import java.util.Scanner;
public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingreses el n�mero del d�a [1-7]: ");
		int num_dia= sc.nextInt();
		
		String nombre_dia = "";
		
		switch (num_dia) {
			case 1:
				nombre_dia= "Domingo";
			case 2:
				nombre_dia= "Lunes";
			case 3:
				nombre_dia= "Martes";
			case 4:
				nombre_dia= "Mi�rcoles";
			case 5:
				nombre_dia= "Jueves";
			case 6:
				nombre_dia= "Viernes";
			case 7:
				nombre_dia= "S�bado";
				
		}
		
		System.out.println("Nombre del d�a: " + nombre_dia);
			
		
	}
}
