package Fundamento;

public class Temperatura {
	
	public static void main(String[] args) {
		// ( ºF -32) * 5.0/9.0 = ºC
		
		final double FATOR = 5.0/9.0;
		final double  AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("A Temperatura é" + celsius + "ºC");
	
		 fahrenheit = 0;
		 celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("A Temperatura é" + celsius + "ºC");
	
		
	
}
	

}
