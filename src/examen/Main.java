package examen;

import java.util.Scanner;

/**
 * @author Sergio
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String nombre;
		
		System.out.println("Dime tu nombre:");
		nombre=entrada.nextLine();
		
		System.out.println("Hola "+ nombre+", perteneces a la generación del futuro");
		
		entrada.close();
		

	}

}
