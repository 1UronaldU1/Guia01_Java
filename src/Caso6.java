import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) 
	{
		int rpta1 = (int) Math.pow(5, 3);
		
		float rpta2 = (float) Math.pow(81.0, 1/2.0);
		float rpta3 = (float) Math.pow(125.0, 1/3.0);
		float rpta5 = (float) Math.pow(256.0, 1/4.0);
		float rpta6 = (float) Math.pow(25.0, 1/2.0);
		float rpta4 = (float) rpta5 + rpta6;
		
		System.out.println("----------------");
		System.out.println("Resultados");
		System.out.println("----------------");
		System.out.println("Resultado 1: " + rpta1);
		System.out.println("Resultado 2: " + rpta2);
		System.out.println("Resultado 3: " + rpta3);
		System.out.println("Resultado 4: " + rpta4);
	}

}
