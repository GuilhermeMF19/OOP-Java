package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		sc.nextLine();
		Room[] rooms = new Room[10];
		
		for (int i=1; i<n ; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int number = sc.nextInt();

			rooms[number] = new Room(number, name, email);
			
		}
		
		System.out.println("Busy rooms:");
		for (int i=0; i<rooms.length ; i++) {
			if(rooms[i] != null) {
				System.out.println(rooms[i]);
			}
		}
		
		sc.close();
	}

}
