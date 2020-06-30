import java.util.Scanner;
public class caso8 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
			System.out.print("Ingrese nota: ");
			int nota=sc.nextInt();
			
			if(nota<=7)
				System.out.println("Sin palabras");
			else if(nota<=10)
				System.out.println("Malo");
			else if(nota<=14)
				System.out.println("Regular");
			else if(nota<=17)
				System.out.println("Notable");
			else if(nota<=20)
				System.out.println("Excelente");
			else 
				System.out.println("Error");

	}

}
