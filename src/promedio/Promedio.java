package promedio;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese el valor 1:");
		int valor1 = ingreso.nextInt();
		System.out.println("Ingrese el valor 2:");
		int valor2 = ingreso.nextInt();
		System.out.println("Ingrese el valor 3:");
		int valor3 = ingreso.nextInt();
		int total = valor1 + valor2 + valor3;
		float promedio = total / 3;
		System.out.println("El promedio es: " + promedio);
		ingreso.close();

	}

}
