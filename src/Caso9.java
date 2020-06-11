import java.util.Scanner;

public class Caso9 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int base = 0, altura = 0;
		
		System.out.print("Ingrese la Base: ");
		base = sc.nextInt();
		
		System.out.print("Ingrese la Altura: ");
		altura = sc.nextInt();
		int peri = (int) base * 2 + altura * 2;
		
		System.out.println("-----------------");
		System.out.println("Resultados");
		System.out.println("Área del rectángulo: " + base * altura);
		System.out.println("Perímetro: " + peri);
		System.out.println("-----------------");
	}

}
		