package org.acme.piemme.biancheria.winx;

import org.acme.piemme.biancheria.AbstractBiancheriaFactory;

/**
 * Partecipante: ConcreteFactory
 * implementa le operazioni per creare i prodotti concreti
 */
public class WinxBiancheriaFactory implements AbstractBiancheriaFactory {

	@Override
	public WinxLenzuolo createLenzuolo() {
		return new WinxLenzuolo();
	}

	@Override
	public WinxFedera createFedera() {
		return new WinxFedera();
	}

}
