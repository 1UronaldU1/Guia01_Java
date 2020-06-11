import java.util.Scanner;

public class Caso14 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		int suma = (n * (n + 1)) / 2;
		
		System.out.println("La sumatoria es: " + suma);

	}

}
