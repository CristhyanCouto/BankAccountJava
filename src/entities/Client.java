package entities;

import java.util.Random;
import java.util.Scanner;

public class Client {

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	private final int bankAccount = rd.nextInt(99999);
	private String clientName;
	private double accountBalance;
	
	@Override
	public String toString() {
		return "Client Account: "
				+ getBankAccount()
				+ "\n"
				+ "Client Name: "
				+ getClientName()
				+ "\n"
				+ "Account Balance: $"
				+ getAccountBalance();
	}
	
	//Getters and Setter
	
	
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}

	public int getBankAccount() {
		return bankAccount;
	}
	
	//Functions
	
	public void withdraw(double withdraw) {
		this.accountBalance -= withdraw - 5.0;
	}
	
	public void deposit(double deposit) {
		this.accountBalance += deposit;
	}
	
	public void register() {
		char aux;
		
		System.out.println("Welcome to the Imaginary Bank.");
		System.out.println("Let's register the account.");
		System.out.println("Client name: ");		
		setClientName(sc.nextLine());
		
		System.out.println("Will be a first deposit? Y/N");
		aux = sc.next().charAt(0);
		
		if(aux == 'y' || aux == 'Y') {
			System.out.println("Type the value of the deposit: ");
			deposit(sc.nextDouble());
			System.out.println("");
			System.out.println(toString());
		}else {
			System.out.println("");
			System.out.println("Welcome " + getClientName());
			System.out.println(toString());
		}
	}
}
