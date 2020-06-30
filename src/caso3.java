import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		System.out.print("Ingrese primero numero: ");
		int num1=sc.nextInt();
		
		System.out.print("Ingrese Segundo numero: ");
		int num2=sc.nextInt();
		
		String mensaje ="";
		
		if(num1 == num2)
			mensaje="Los numeros son iguales";
		else if(num1 > num2)
			
			mensaje="El primer numero es mayor";
		else 
		
			mensaje="El segundo numero es mayor";
		
		System.out.println("Respuesta: "+mensaje);
	}

}
