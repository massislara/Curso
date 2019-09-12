package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		;

		// entrada de dados por parte do usu�rio
		Scanner sc = new Scanner(System.in);

		// cria��o de variaveis e instanciando classe
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		// Solicita��o dos dados para o usu�rio

		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		// CALCULO DA AREA DOS TRIANGULOS

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		// TESTE PARA IDENTIFICAR QUAL AREA � MAIOR

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();

	}

}
