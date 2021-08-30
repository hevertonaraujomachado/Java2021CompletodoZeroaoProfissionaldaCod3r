package Fundamentos;

public class Notacaoponto {

	public static void main(String[] args) {
		String s = "Bom dia X";s = s.replace("Senhora", s);
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s= s.concat("!!!");
		
		System.err.println(s);
		
		String x = "Heverton".toUpperCase();
		System.out.println(x);
		
		String y = "BOA TARDE X"
				.replace("X","Gui").toUpperCase().concat("!!!");
		System.out.println(y);
		
		// tipos primitivo não tem operador "."
		int a = 3;
		System.out.println(a);
	}

}
