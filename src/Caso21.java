import java.util.Scanner;

public class Caso21 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		float gasto = 0;
		
		System.out.print("Ingrese el Gasto: ");
		gasto = sc.nextFloat();
		

		float importe1 = gasto * 0.12f;
		float importe2 = gasto + importe1;
		
		System.out.println("-----------------");
		System.out.println("Resultados");
		System.out.println("Resultado: " + importe2);
	}

}
