package application;

import java.awt.Container;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		sc.nextLine();
		Person[] vectPerson = new Person[n];
		
		for (int i=0; i<vectPerson.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.println("Nome: ");
			String name = sc.nextLine();
			System.out.println("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine();
			vectPerson[i] = new Person(name, age, height);
		}
		
		double sum = 0.0;
		for (int i=0; i<vectPerson.length; i++) {
			sum = sum + vectPerson[i].getHeight();

		}
		
		double average = sum / vectPerson.length;
		System.out.printf("A média de altura é: %.2f%n", average);
		
		int count = 0;
		for (int i=0; i<vectPerson.length; i++) {
			if(vectPerson[i].getAge() < 16) {
				count ++;
			}
		}
		double percent = count * 100.0 / n;
		System.out.printf("A porcentagem de pessoas com menos de 16 anos é: %.1f%%%n", percent);
		
		for (int i=0; i<vectPerson.length; i++) {
			if(vectPerson[i].getAge() < 16) {
				System.out.println(vectPerson[i].getName());;
			}
		}
		
		sc.close();
	}

}
