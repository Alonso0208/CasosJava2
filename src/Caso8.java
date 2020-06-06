import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el lado del cuadrado ");
		int lado = sc.nextInt();
		
		int area = (int) Math.pow(lado, 2);
		int perimetro = lado*4;
		
		System.out.println("Área.........." + area);
		System.out.println("Perímetro....." + perimetro);
	}

}
