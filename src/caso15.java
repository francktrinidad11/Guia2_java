import java.util.Scanner;
import java.text.DecimalFormat;
public class caso15 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre cliente: ");
		String cli=sc.nextLine();
		System.out.print("Ingrese producto (TB,LT,MN,IM): ");
		String prod=sc.nextLine();
		System.out.print("Ingrese cantidad: ");
		int cant=sc.nextInt();
		System.out.print("Ingrese forma de pago (C1,C2): ");
		String form=sc.nextLine();
		
		float precio=0;
		String nomp="";
		
		switch(prod){
		
					case "TB":
						precio=350;
						nomp="Tablet";
						break;
					case "LT":
						precio=2300;
						nomp="Laptop";
						break;
					case "MN":
						precio=850;
						nomp="Monitor";
						break;
					case "IM":
						precio=680;
						nomp="Impresora";
						break;
					default:
						precio=0;
						nomp="";
						
			}
			
		float importe=precio*cant;
		String formp="";
		float des_inc=0;
		
		  
		switch(form) {
		
				case "C1":
					des_inc=importe*0.05f;
					formp="Contado";
					break;
				case "C2":
					des_inc=importe*0.12f;
					formp="Credito";
					break;
				default:
					des_inc=0;
					

				
			}
		
	
		System.out.println("Respuesta");
		System.out.println("==========");
		System.out.println("Cliente: "+cli);
		System.out.println("Producto: "+nomp);
		System.out.println("Precio: "+precio);
		System.out.println("Cantidad: "+cant);
		System.out.println("Importe: "+importe);
		System.out.println("Forma de pago: "+formp);
		System.out.println("Descuento: "+des_inc);	
	}
				
				
}
	
		
		
		
