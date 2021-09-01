package Fundamentos;

public class TipoStrings {

	public static void main(String[] args) {
		System.out.println("Óla pessoal".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.err.println(s + "!!");
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.toLowerCase().startsWith("BOA"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("Boa Tarde"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("NOME:" + nome + "\nSobrenome:" + sobrenome + 
		"\nIdade" + idade + "\nSalario:" + salario + "\n\n"  );
	
		// %s para String 
		// %d para Numeros inteiro
		// R$.2f. para numero flutuante
	System.out.printf(" O Senhor %s do %S %d anos R$.2F.", nome ,sobrenome ,idade , salario);
	
	//String frase = String.format(" O Senhor %s do %S %d anos R$.2f.", nome ,sobrenome ,idade , salario);
	// System.out.println(frase);
	 
	 System.out.println("Frase Qualquer".concat("Qual"));
	 System.out.println("Frase Qualquer".indexOf("QUAL"));
	 System.out.println("Frase Qualquer".substring(6));
	 System.out.println("Frase Qualquer".substring(6 ,10));
	
	
	}


}
