package Fundamentos;

import java.util.Scanner;

public class Console {
	
public static void main(String[] args) {
	
	System.out.print("Bom ");
	System.out.print("Dia!\n\n ");
	
	System.out.println("Bom ");
	System.out.println("dia ");
	
	System.out.printf("MEGA SENHA: %d %d %d %d %d %d %n" , 15, 26, 29, 33, 55, 60);
	
	System.out.printf("Salario: %.1f%n",1234578);  
	System.out.printf("NOME: %s%n , João");
	
	Scanner entrada = new Scanner(System.in);
	
System.out.print("DIGITE o seu nome:");
String nome = entrada.nextLine();

System.out.print("DIGITE o seu Sobrenome:");
String sobrenome = entrada.nextLine();


System.out.println("\n\nNOME =" + nome + "" + sobrenome);
entrada.close();

}
}
