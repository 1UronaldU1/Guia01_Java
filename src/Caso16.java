import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Horas de Trabajo: ");
		float horas = sc.nextFloat();
		
		System.out.print("Ingrese Tarifa por Hora: ");
		float precio = sc.nextFloat();
		
		float importe1 = horas * precio;
		float importe2 = importe1 * 0.05f;
		float importe3 = importe2 + importe1;
		float importe4 = importe3 / 3.24f;
		
		System.out.println("------------------------");
		System.out.println("Resultados");
		System.out.println("------------------------");
		System.out.println("Sueldo: " + df.format(importe1));
		System.out.println("Bono: " + df.format(importe2));
		System.out.println("Total: " + df.format(importe3));
		System.out.println("Total en dólares: " + df.format(importe4));
	}

}
