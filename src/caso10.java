import java.text.DecimalFormat;
import java.util.Scanner;
public class caso10 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00000");
		
		System.out.print("Ingrese nombre del empleado: ");
		String nom=sc.nextLine();
		System.out.print("Ingrese horas trabajadas: ");
		int ht=sc.nextInt();
		System.out.print("Tarifa por horas: ");
		float tp=sc.nextFloat();
		System.out.print("Minutos de tardanza: ");
		int min=sc.nextInt();
		
		float importe=ht*tp;
		float bono=0;
		float descuento=0;
		int PorcAl=70;
		float Ma=(float)(ht*100)/PorcAl;
				
		
		if(ht>60)
			
			bono=importe*0.13f;
		else
			bono=importe*0.04f;
		
		if(min>15)
			descuento=importe*0.03f;
		
		else if(min<15)
			
			descuento=0;
		
		System.out.println("Resultado");
		System.out.println("===========");
		System.out.println("Trabajador: "+nom);
		System.out.println("Horas trabajadas: "+ht);
		System.out.println("Tarifa por horas: "+tp);
		System.out.println("Importe: "+importe);
		System.out.println("Bono: "+bono);
		System.out.println("Descuento: "+descuento);
		System.out.println("Meta alcanzar: "+df.format(Ma)+"%");
		
		
		
		
		
		
		
		

	}

}
