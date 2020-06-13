import java.util.Scanner;
public class caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombre del alumno: ");
		String alumno = sc.nextLine();
		
		System.out.print("Ingrese carrera[DS/RC/DG/otro]: ");
		String carrera = sc.nextLine();
	
	
		System.out.print("Ingrese turno[M/T/N/otro]: ");
		String turno = sc.next();
		
		String nturno = "";
		
		float descuento =0;
		
		int monto=0;
		
		switch (carrera.toLowerCase()) {
			case "ds":
				monto=1500; 
				break;
			case "rc":
				monto=1400; 
				break;
			case "dg":
				monto=1300; 
				break;
			case "otro":
				monto=0; 
				break;
			
		
		}
		
		switch (turno.toLowerCase()) {
			case "m":
				descuento=monto*0.1f;
				nturno="Mañana"; 
				break;
			case "t":
				descuento=monto*0.2f;
				nturno="Tarde"; 
				break;
			case "n":
				descuento=monto*0.15f;
				nturno="Noche"; 
				break;
			case "otro":
				descuento=0; 
				break;
		
		}
		
		float total=monto-descuento;
		float totaldolares= total/3.33f;
		
		System.out.println("El monto es: " + monto);
		System.out.println("El turno es " + nturno);
		System.out.println("El descuento es de: " + descuento);
		System.out.println("El total a pagar es de: " + total);
		System.out.println("El total a pagar el dólares es: " + totaldolares + "$");
		
			
	}

}
