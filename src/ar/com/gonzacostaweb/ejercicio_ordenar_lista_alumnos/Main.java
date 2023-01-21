package ar.com.gonzacostaweb.ejercicio_ordenar_lista_alumnos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("----- Listado de Alumnos -----\n");
		
		System.out.println("Ingrese la cantidad de alumnos (Máximo 20):");
		
		int cantidadAlumnos = entrada.nextInt();
		
		while(cantidadAlumnos < 0 || cantidadAlumnos > 20) {
			
			System.out.println("\nCantidad inválida. Ingrese la cantidad de alumnos nuevamente:");
			
			cantidadAlumnos = entrada.nextInt();

		}
		
		entrada.nextLine(); // Consume el salto de línea de entrada.nextInt()
				
		String[] listadoAlumnos = new String[cantidadAlumnos];
						
		for(int i = 0; i < listadoAlumnos.length; i++) {
			
			System.out.println("\nIngrese el alumno " + (i+1) + ":");
			
			listadoAlumnos[i] = entrada.nextLine();
			
		}
		
		Arrays.sort(listadoAlumnos);
		
		System.out.println("\n-----\n");
		
		System.out.println("Listado de alumnos ordenado: \n");
		
		for(String alumno: listadoAlumnos) {
			
			System.out.println("- " + alumno);
			
		}
		
		entrada.close();
		
	}

}
