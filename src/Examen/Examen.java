package Examen;

import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Examen de geografía. IES FLORENCIO PINTADO");
		System.out.println("1. ¿Cuál es la capital de España?");
		String respuesta = leer.nextLine();
		
		if (respuesta.equals("Madrid")) 
		{
			System.out.println("¡¡CORRECTO!!");
		}else {
			System.out.println("ERROR...");
		}
	}

}
