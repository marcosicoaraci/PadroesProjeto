package br.easoftware.banco;

import java.util.Date;

public class Devedora extends EstadoConta implements ITimeObserver {

	private Date data;

	/**
	 *  
	 */
	public void Devedora() {
		this.data = new Date();
	}

	@Override
	public void sacar(Double quantia, ContaBancaria contaBancaria) {
	}

	@Override
	public void fechar(Date dataFechamento, ContaBancaria contaBancaria) {
	}

	@Override
	public void depositar(Double quantia, ContaBancaria contaBancaria) {
	}

	public void checarData(ITimeObservable observable) {

	}
}
