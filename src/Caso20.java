import java.util.Scanner;

public class Caso20 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		float venta = 0;
		
		System.out.print("Ingrese la venta: ");
		venta = sc.nextFloat();
		

		float importe1 = venta * 0.42f;
		float importe2 = venta + importe1;
		
		System.out.println("-----------------");
		System.out.println("Resultados");
		System.out.println("Resultado: " + importe2);
	}

}
