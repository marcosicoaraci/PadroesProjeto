package br.easoftware.banco;

import java.util.Date;
import java.util.Collection;

public class ContaBancaria {

	private String numero;

	private Double saldo;

	private Double limite;

	private Date dataAbertura;

	private Date dataEncerramento;

	private Agencia agencia;

	private Collection<Correntista> correntista;

	private EstadoConta estadoConta;

	/**
	 *  
	 */
	public void ContaBancaria(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
		estadoConta = new Disponivel();
	}

	public void fechar(Date data) {
		this.estadoConta.fechar(data, this);
	}

	public void sacar(Double quantia) {
		this.estadoConta.sacar(quantia, this);
	}

	/**
	 *  
	 */
	public void depositar(Double quantia) {
		this.estadoConta.depositar(quantia, this);
	}

	/**
	 *  
	 */
	public void alterarEstado(EstadoConta estado) {
		this.estadoConta = estadoConta;
	}
}
