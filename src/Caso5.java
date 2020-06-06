import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el precio: ");
		float precio = sc.nextFloat();
		
		System.out.print("Ingrese la cantidad: ");
		int cantidad = sc.nextInt();
		
		float parcial = precio * cantidad;
		
		float descuento=0;
		
		if (cantidad>8)
			descuento = (float) (parcial*10)/100;  //Aplicar cast
		else
			descuento = 0;
		
		System.out.println("Resultados");
		System.out.println("==========");
		System.out.println("Parcial........: " + parcial);
		System.out.println("Descuento......: " + descuento);
		System.out.println("Total a pagar..: " + (parcial - descuento));
		
		

	}

}
