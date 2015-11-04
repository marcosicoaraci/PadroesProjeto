package br.easoftware.banco;

import java.util.Date;

public interface ITimeObservable {

	/**
	 *  
	 */
	public void add(Devedora.ITimeObserver observer);

	/**
	 *  
	 */
	public void remove(Devedora.ITimeObserver observer);

	/**
	 *  
	 */
	public void notify();

	/**
	 *  
	 */
	public abstract Date getData();

}
