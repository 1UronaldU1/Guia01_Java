import java.util.Scanner;

public class Caso19 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int lado1 = 0, lado2 = 0, lado3 = 0;
		
		System.out.print("Ingrese lado: ");
		lado1 = sc.nextInt();
		
		System.out.print("Ingrese lado: ");
		lado2 = sc.nextInt();
		
		System.out.print("Ingrese lado: ");
		lado3 = sc.nextInt();
		
		int importe1 = lado1 + lado2 + lado3;
		
		System.out.println("-----------------");
		System.out.println("Resultados");
		System.out.println("Perímetro del triángulo: " + importe1);
	}

}
