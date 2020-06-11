import java.text.DecimalFormat;

public class Caso7 
{

	public static void main(String[] args) 
	{
		DecimalFormat formato1 = new DecimalFormat("#.##");
		float rpta1 = (float) Math.pow(3, 2);
		float rpta2 = (float) 17*2;
		float rpta3 = (float) rpta2 + rpta1;
		float rpta4 = (float) rpta3 - 6;
		float rpta5 = (float) 1.2*2;
		float rpta6 = (float) 4.7 - rpta5;
		float rpta7 = (float) rpta6*2;
		float rpta8 = (float) rpta4 / 5;
		float rpta9 = (float) rpta8-rpta7;
		
		System.out.println("----------------");
		System.out.println("Resultados");
		System.out.println("----------------");
		System.out.println(formato1.format(rpta9)); 


		
	}

}
