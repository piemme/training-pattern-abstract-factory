package org.acme.piemme.biancheria;

/**
 * Partecipante: AbstractFactory
 * dichiara le operazioni che creano i prodotti astratti
 * E' un'interfaccia, ma potrebbe essere implementata come classe astratta
 * che aggiunge la logica attualmente presente in org.acme.piemme.biancheria.BiancheriaFactory
 */
public interface AbstractBiancheriaFactory {
	Lenzuolo createLenzuolo();
	Federa createFedera();
}
