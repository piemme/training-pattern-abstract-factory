package org.acme.piemme.biancheria.starwars;

import org.acme.piemme.biancheria.Federa;

/**
 * Partecipante: ConcreteProduct
 * definisce un prodotto concreto, che viene creato dalla corrispondete factory concreta.
 */
public class StarWarsFedera implements Federa {

	@Override
	public String motivo() {
		return "Blu tinta unita";
	}

}
