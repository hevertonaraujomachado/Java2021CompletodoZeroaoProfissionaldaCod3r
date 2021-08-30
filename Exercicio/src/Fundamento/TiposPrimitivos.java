package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// informações de funcionarios 
		
		// Tipos Numericos Inteiros
		
		byte anosDeDmpresa = 23;
		short NumerosdeVoos =577;
		int id = 56645;
		long PontosAcumulados = 2_991_771_222L;
		
		//Tipos Numericos Reais
		float Salario = 4456.66F;
		double vendasAcumuladas =2_991_771_22.2;
		
		//Tipos boolean
		boolean verdaoCampeao = true;
		boolean verdaoVice = false;
		
		//Tipos caractere
		char status = 'A' ;//ativo com uma letra
		
		System.out.println(anosDeDmpresa * NumerosdeVoos);
		
		System.out.println(PontosAcumulados / id);
		
		System.out.println("O Valor do Salario" + Salario);
		
		System.out.println("A Maquina de Vendas" + vendasAcumuladas);
		
		System.out.println(verdaoCampeao );
		
		System.out.println(verdaoVice );
		System.out.println(status);
	}

}
