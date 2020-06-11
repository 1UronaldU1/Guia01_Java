import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Números de aprobados: ");
		float apro = sc.nextFloat();
		
		System.out.print("Número de desaprobados: ");
		float desa = sc.nextFloat();
		
		System.out.print("Número de retirados: ");
		float reti = sc.nextFloat();
		
		float importe1 =  apro + desa + reti;
		float importe2 = apro *100 / importe1  ;
		float importe3 =  desa *100 / importe1;
		float importe4 =  reti *100 / importe1;
		
		System.out.println("------------------------");
		System.out.println("Resultados");
		System.out.println("------------------------");
		System.out.println("Sueldo: " + df.format(importe2)+"%");
		System.out.println("Bono: " + df.format(importe3)+"%");
		System.out.println("Total: " + df.format(importe4)+"%");
		
	}
	
}	