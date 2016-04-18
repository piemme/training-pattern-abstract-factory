package org.acme.piemme;

import org.acme.piemme.biancheria.AbstractBiancheriaFactory;
import org.acme.piemme.biancheria.Federa;
import org.acme.piemme.biancheria.Lenzuolo;
/**
 * Partecipante: Client
 * accede solo alle interfacce: AbstractBiancheriaFactory, Federa, Lenzuolo
 */
public class RifareIlLetto {
	private AbstractBiancheriaFactory factory; 
	public RifareIlLetto(String tipoBiancheria) {
		this.factory = Assistente.scegliBiancheria(tipoBiancheria);
	}

	public String copriMaterasso() {
		Lenzuolo lenzuolo = this.factory.createLenzuolo();
		return lenzuolo.fantasia();
	}

	public String copriCuscino() {
		Federa federa = this.factory.createFedera();
		return federa.motivo();
	}
}
