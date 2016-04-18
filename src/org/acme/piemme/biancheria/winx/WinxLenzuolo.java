package org.acme.piemme.biancheria.winx;

import org.acme.piemme.biancheria.Lenzuolo;

public class WinxLenzuolo implements Lenzuolo {

	@Override
	public String fantasia() {
		return "Rosa";
	}

	@Override
	public String personaggio() {
		return "Fata";
	}

}
