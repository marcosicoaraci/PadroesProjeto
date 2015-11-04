package br.easoftware.banco;

import java.util.Date;

public abstract class EstadoConta {

	private ContaBancaria contaBancaria;

	abstract void sacar(Double quantia, ContaBancaria contaBancaria);

	abstract void fechar(Date dataFechamento, ContaBancaria contaBancaria);

	abstract void depositar(Double quantia, ContaBancaria contaBancaria);

}
