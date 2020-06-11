import java.util.Scanner;

public class Caso10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		float radio = 0, pi = 0;
		
		System.out.print("Ingrese la Radio: ");
		radio = sc.nextFloat();
		
		System.out.print("Ingrese la Pi: ");
		pi = sc.nextFloat();

		float area = (float) pi * radio * radio;
		float peri = (float) 2 * pi * radio;
		
		System.out.println("-----------------");
		System.out.println("Resultados");
		System.out.println("Área del círculo: " + area);
		System.out.println("Perímetro: " + peri);
		System.out.println("-----------------");
	}

}
		