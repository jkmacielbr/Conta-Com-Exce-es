package model.entidades;

import model.exceptions.DomainException;

public class Account {
	private int numero; // numero conta
	private String nome; //nome
	private double saldo; //saldo
	private double limiteSaque; //limite saque
	
	public Account() {
	}
	
	public Account(int numero, String nome, double saldo, double limiteSaque) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	public void saque(double valor) throws DomainException {
		if (valor > this.limiteSaque) {
			throw new DomainException("Valor Excedeu limite diário");
		}
		if (valor > this.saldo) {
			throw new DomainException("Saldo Insuficiente");
		}
		this.saldo -=valor;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}


	public double getLimiteSaque() {
		return limiteSaque;
	}

	@Override
	public String toString() {
		return "" +this.getSaldo();
	}

	
	
	
	
	

}
