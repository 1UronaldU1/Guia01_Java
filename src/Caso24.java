import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
			
		float monto1 = 0, monto2 = 0, monto3 = 0 ;
		
		System.out.print("Ingrese monto1: ");
		monto1 = sc.nextFloat();
		
		System.out.print("Ingrese monto2: ");
		monto2 = sc.nextFloat();
		
		System.out.print("Ingrese monto3: ");
		monto3 = sc.nextFloat();
		
		float importe1 = monto1 / 5;
		float importe2 = monto2 * 0.2f;
		float importe3 = importe1 + importe2;
		float importe4 = monto3 / 0.6f;
		float importe5 = importe3 / 2;
		float importe6 = importe5 + importe4;
		float importe7 = monto1 + monto2 + monto3;
		float importe8 = importe7 * 0.8f;
		float importe9 = importe8 - importe7;
		
		System.out.println("-------------------");
		System.out.println("Resultados");
		System.out.println("-------------------");

		System.out.println("Importe1: " + df.format(importe3));
		System.out.println("Importe2: " + df.format(importe6));
		System.out.println("Importe3: " + df.format(importe9));
	}
	}
	