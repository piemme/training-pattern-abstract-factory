package org.acme.piemme.biancheria.starwars;

import org.acme.piemme.biancheria.AbstractBiancheriaFactory;

/**
 * Partecipante: ConcreteFactory
 * implementa le operazioni per creare i prodotti concreti
 */
public class StarwarsBiancheriaFactory implements AbstractBiancheriaFactory{

	@Override
	public StarWarsLenzuolo createLenzuolo() {
		return new StarWarsLenzuolo();
	}

	@Override
	public StarWarsFedera createFedera() {
		return new StarWarsFedera();
	}

}
