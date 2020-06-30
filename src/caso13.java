import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese primero numero: ");
		int num1=sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
		int num2=sc.nextInt();
		System.out.print("Ingrese la operacion [0-6]: ");
		int op=sc.nextInt();
		
		float respuesta=0;
		
		if(op==1)
			respuesta=num1+num2;
		else if(op==2)
			respuesta=num1-num2;
		else if(op==3)
			respuesta=num1*num2;
		else if(op==4 && num2!=0)
			respuesta=num1/num2;
		else if(op==5 && num2!=0)
			respuesta=num1%num2;
		else if(op==6)
			respuesta=(num1+num2)/2;
		else
			respuesta=0;
			
		
		String operacion="";
		
			switch(op) {
			
			case 1:
				operacion="Suma";
				break;
			case 2:
				operacion="Resta";
				break;
			case 3:
				operacion="Multiplicacion";
				break;
			case 4:
				operacion="Division";
				break;
			case 5:
				operacion="Resto Entero";
				break;
			case 6:
				operacion="Promedio";
				break;
					
			default:
					operacion="No es posible hallar la operacion";
					
					
				
			}
			
		
			System.out.println("Resultado");
			System.out.println("=========");
			System.out.println("Numero 1: "+num1);
			System.out.println("Numero 2: "+num2);
			System.out.println("Operacion: "+operacion);
			System.out.println("Resultado: "+respuesta);

	}

}
