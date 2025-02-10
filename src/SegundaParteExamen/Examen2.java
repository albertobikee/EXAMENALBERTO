package SegundaParteExamen;

import java.util.Scanner;

public class Examen2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Examen de geografía. IES FLORENCIO PINTADO");
		System.out.println("1. ¿Cuál es el país más grande del mundo por superficie?");
		String respuesta = leer.nextLine();
		
		if (respuesta.equalsIgnoreCase("Rusia")) 
		{
			System.out.println("¡¡CORRECTO!!");
		}else {
			System.out.println("ERROR...");
		}
		
		System.out.println("2. ¿En qué continente se encuentra Egipto?");
		String respuesta2 = leer.nextLine();
		
		if (respuesta2.equalsIgnoreCase("África")) 
		{
			System.out.println("¡¡CORRECTO!!");
		}else {
			System.out.println("ERROR...");
		}
		
		System.out.println("3. ¿Cuál es el río más largo del mundo?");
		String respuesta3 = leer.nextLine();
		
		if (respuesta3.equalsIgnoreCase("Amazonas")) 
		{
			System.out.println("¡¡CORRECTO!!");
		}else {
			System.out.println("ERROR...");
		}
	}
}
