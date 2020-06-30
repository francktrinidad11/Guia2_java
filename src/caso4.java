import java.util.Scanner;
public class caso4 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese primer numero: ");
		int n1=sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
		int n2=sc.nextInt();
		
		if (n1==n2)
			System.out.println("Los numeros son Iguales");
		
		else if(n1<n2)
			System.out.println("El primer numero es Menor");
		else
			System.out.println("El segundo numero es Menor");
		
	}

}
