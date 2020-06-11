import java.util.Scanner;

public class Caso13 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese Apellido: ");
		String apell = sc.nextLine();
		
		System.out.println("-------------------");
		System.out.println("Resultados");
		System.out.println("-------------------");
		System.out.println("Nombre y Apellido: " + nombre.concat(" ").concat(apell));
	}

}
