import java.util.Scanner;
import java.text.DecimalFormat;
public class caso12 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.0");
		
		System.out.print("Ingrese nombre de empleado: ");
		String nom=sc.nextLine();
		
		System.out.print("Ingrese nivel [1-4]: ");
		int nivel=sc.nextInt();
		
		System.out.print("Ingrese Sueldo: ");
		float sueldo=sc.nextFloat();
		
		float incremento=0;
		
		switch (nivel) {
		
			case 1:
				incremento=0.045f;
				break;
			case 2:
				incremento=0.06f;
				break;
			case 3:
				incremento=0.085f;
				break;
			case 4:
				incremento=0.11f;
				break;
			default:
				incremento=0;
		}
		float nuevo_sueldo=(float)sueldo+(sueldo*incremento);
		
		System.out.println("Resultado");
		System.out.println("==========");
		System.out.println("Empleado: "+nom);
		System.out.println("Nivel: "+nivel);
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Incremento: "+incremento+"%");
		System.out.println("Nuevo Sueldo: "+df.format(nuevo_sueldo));
	}

}
