import java.util.Scanner;

public class Caso18 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int base = 0, altura = 0;
		
		System.out.print("Ingrese Base: ");
		base = sc.nextInt();
		
		System.out.print("Ingrese Altura: ");
		altura = sc.nextInt();
		
		int importe1 = base * altura;
		int importe2 = importe1 / 2;
		
		System.out.println("-----------------");
		System.out.println("Resultados");
		System.out.println("Área del triángulo: " + importe2);

	}

}
