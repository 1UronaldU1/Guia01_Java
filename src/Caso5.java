import java.util.Scanner;

public class Caso5 
	{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Ingresa primer número:");
		n1 = sc.nextFloat();
		
		System.out.print("Ingresa segundo número:");
		n2 = sc.nextFloat();
		
		float prom = (n1 + n2) /2;
		float resp1= n1 + n1 * 0.2f;
		float resp2= n2 - n2 * 0.3f;
		
		System.out.println("-------------------");
		System.out.println("Resultados");
		System.out.println("-------------------");
		System.out.println("Promedio: " + prom);
		System.out.println("Respuesta 2: "+ resp1);
		System.out.println("Respuesta 3:" + resp2);

	}

}		
 
		


