import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso22 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		

		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese Apellido: ");
		String apell = sc.nextLine();
		
		float nota1 = 0, nota2 = 0 , nota3 = 0;
		
		System.out.print("Ingrese Nota1: ");
		nota1 = sc.nextFloat();
		
		System.out.print("Ingrese Nota2: ");
		nota2 = sc.nextFloat();
		
		System.out.print("Ingrese Nota3: ");
		nota3 = sc.nextFloat();
		
		float importe1 = nota1 * 0.2f;
		float importe2 = nota2 * 0.3f;
		float importe3 = nota3 * 0.5f;
		float importe4 = importe1 + importe2 + importe3;
		
		System.out.println("-------------------");
		System.out.println("Resultados");
		System.out.println("-------------------");
		System.out.println("Nombre y Apellido: " + nombre.concat(" ").concat(apell));
		System.out.println("Promedio: " + df.format(importe4));
	}
	}


