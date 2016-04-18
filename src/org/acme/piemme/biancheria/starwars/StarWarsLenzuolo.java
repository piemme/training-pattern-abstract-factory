package org.acme.piemme.biancheria.starwars;

import org.acme.piemme.biancheria.Lenzuolo;

public class StarWarsLenzuolo implements Lenzuolo {

	@Override
	public String fantasia() {
		return "cielo stellato";
	}

	@Override
	public String personaggio() {
		return "Skywalker";
	}

}
