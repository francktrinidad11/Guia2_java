import java.util.Scanner;
public class caso9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese nombre de alumno: ");
		String alumno=sc.nextLine();
		
		System.out.print("Ingrese primera nota: ");
		int nota1=sc.nextInt();
		
		System.out.print("Ingrese segunda nota: ");
		int nota2=sc.nextInt();
		
		System.out.print("Ingrese el numero de asistencia: ");
		int asistencia = sc.nextInt();
		
		float promedio=nota1*0.3f+nota2*0.7f;
		float porcentaje=asistencia*100/12;
		String estado="";
		
		if(promedio>13 && porcentaje>=70) 
			estado="Aprobado";
		else 
			estado="Desaprobado";
		
		System.out.println("Promedio: "+promedio);
		System.out.println("Porcentaje de asistencia: "+porcentaje+"%");
		System.out.println("Estado: "+estado);
			
		
		
		
		
		
	}

}
