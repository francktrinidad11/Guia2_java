import java.util.Scanner;
public class caso2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int n=sc.nextInt();
		
		if(n%2!=0)
			System.out.println("El numero es Impar");
		else
			System.out.println("El numero es PAR");
		

	}

}
