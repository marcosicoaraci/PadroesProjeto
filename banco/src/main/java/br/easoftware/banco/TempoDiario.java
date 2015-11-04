package br.easoftware.banco;

import java.util.Date;

public class TempoDiario implements ITimeObservable {


	/**
	 * @see br.easoftware.banco.ITimeObservable#add(br.easoftware.banco.ITimeObserver)
	 * 
	 *  
	 */
	public void add(Devedora.ITimeObserver observer) {

	}


	/**
	 * @see br.easoftware.banco.ITimeObservable#remove(br.easoftware.banco.ITimeObserver)
	 * 
	 *  
	 */
	public void remove(Devedora.ITimeObserver observer) {

	}


	/**
	 * @see br.easoftware.banco.ITimeObservable#notify()
	 * 
	 *  
	 */
	public void notify() {

	}


	/**
	 * @see br.easoftware.banco.ITimeObservable#getData()
	 * 
	 *  
	 */
	public Date getData() {
		return null;
	}

}
