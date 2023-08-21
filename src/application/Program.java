package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		int aux = 1;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Client client = new Client();
		

		client.register();
		System.out.println("");

		while (aux == 1 || aux == 2) {
			System.out.println("What would you like to do?");
			System.out.println("Type 1 for deposit.");
			System.out.println("Type 2 for withdraw.");
			System.out.println("Any other option will close the operation.");
			
			aux = sc.nextInt();

			switch (aux) {
			case 1:
				System.out.println("Type de value: ");
				client.deposit(sc.nextDouble());
				System.out.println("");
				System.out.println(client.toString());
				System.out.println("");
				break;
			case 2:
				System.out.println("Type de value: ");
				client.withdraw(sc.nextDouble());
				System.out.println("");
				System.out.println(client.toString());
				System.out.println("");
				break;
			default:
				System.out.println("");
				System.out.println("Closing the application.");
			}
		}
		sc.close();
	}
}
