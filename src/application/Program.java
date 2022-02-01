package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entidades.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		try {
		System.out.println("Dados da Conta");
		System.out.print("Numero:");
		int numero = teclado.nextInt();
		System.out.print("Nome:");
		teclado.nextLine();
		String nome = teclado.nextLine();
		System.out.print("Valor Inicial: ");
		double valorInicial = teclado.nextDouble();
		System.out.print("Limite de Saque: ");
		double valorSaque = teclado.nextDouble();
		Account conta = new Account(numero, nome, valorInicial, valorSaque);
		
		System.out.print("Valor para sacar: ");
		valorSaque = teclado.nextDouble();
		conta.saque(valorSaque);
		System.out.print("Novo Saldo: ");
		System.out.println(conta);
		} catch(DomainException e) {
			System.out.println("Falha no saque: " + e.getMessage());
			
		} catch (InputMismatchException e) {
			System.out.println("Numero de conta invalida");
		}
		
		
		teclado.close();
		
	}

}
