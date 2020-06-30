import java.util.Scanner;
import java.text.DecimalFormat;
public class caso14 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre del alumno: ");
		String alu=sc.nextLine();
		System.out.print("Ingrese carrera (DS,RC,DG): ");
		String carr=sc.nextLine();
		System.out.print("Ingrese turno (M,T,N): ");
		String turno=sc.nextLine();
		
		float monto=0,descuento=0;
		String nomc="";
		String nomt="";
		
		switch(carr){
		
					case "DS":
						monto=1500;
						nomc="Desarrollo de Software";
						break;
					case "RC":
						monto=1400;
						nomc="Redes y Conectividad";
						break;
					case "DG":
						monto=1300;
						nomc="Diseño Grafico";
						break;
					default:
						monto=0;
						nomc="";
						
			}
		
		switch(turno) {
		
					case "M":
						descuento=(float) (monto*0.10);
						nomt="Mañana";
						break;
					case "T":
						descuento=(float) (monto*0.20);
						nomt="Tarde";
						break;
					case "N":
						descuento=(float) (monto*0.15);
						nomt="Noche";
						break;
					default:
						descuento=0;
		}
		
		float totalpagar=monto-descuento;
		float dolares=totalpagar/3.33f;
		
		System.out.println("Respuesta");
		System.out.println("==========");
		System.out.println("Monto: "+monto);
		System.out.println("Nombre Turno: "+nomt);
		System.out.println("Descuento: "+descuento);
		System.out.println("Total a pagar: "+totalpagar);
		System.out.println("Total en dolares: "+df.format(dolares));
		
	}

}

	