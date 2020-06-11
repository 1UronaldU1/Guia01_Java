import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso23
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		

		
		System.out.print("Ingrese Producto: ");
		String producto = sc.nextLine();
		
		
		float precio = 0, cantidad = 0 ;
		
		System.out.print("Ingrese Precio: ");
		precio = sc.nextFloat();
		
		System.out.print("Ingrese cantidad: ");
		cantidad = sc.nextFloat();
		
		float importe1 = precio * cantidad;
		float importe2 = importe1 * 0.18f;
		float importe3 = importe1 * 0.3f;
		float importe4 = importe1 + importe2 + importe3;
		
		System.out.println("-------------------");
		System.out.println("Resultados");
		System.out.println("-------------------");
		System.out.println("Producto: " + producto.concat(" "));
		System.out.println("IGV: " + df.format(importe2));
		System.out.println("Descuento: " + df.format(importe3));
		System.out.println("Total: " + df.format(importe4));
	}
	}
	
		