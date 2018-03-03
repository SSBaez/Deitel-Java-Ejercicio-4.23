package com.ssbaez.ejercicio423;

import java.util.Scanner;

public class NumerosMayores {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = 0;
		int mayor1 = 0;
		int mayor2 = 0;
		int i = 0;
		int j = 1;
		
		while(i < 10) {
			
			System.out.printf("%d.- Introduzca el numero: ", j++);
			numero = input.nextInt();
			
			if(numero > mayor1) {
				
				if(mayor1 > mayor2) {
					mayor2 = mayor1;
					mayor1 = numero;
				}
				else {
					mayor1 = numero;
				}
				
			}
			else if(numero > mayor2) {
				
				mayor2 = numero;
				
			}
			i++;
			
		}//Fin de while
		
		System.out.printf("Los numeros mas grandes son: %d y %d", mayor1, mayor2);
		
	}

}
