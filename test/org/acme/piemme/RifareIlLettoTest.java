package org.acme.piemme;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RifareIlLettoTest {

	private RifareIlLetto fareIlLetto;

	@Test
	public void conBiancheriaStarWars() {
		fareIlLetto = new RifareIlLetto("Starwars");
		verificaIlTema("cielo stellato", fareIlLetto.copriMaterasso());
		verificaIlTema("Blu tinta unita", fareIlLetto.copriCuscino());
	}

	@Test
	public void conBiancheriaStarWinx() {
		fareIlLetto = new RifareIlLetto("Winx");
		verificaIlTema("Rosa", fareIlLetto.copriMaterasso());
		verificaIlTema("Stelle gialle su rosa", fareIlLetto.copriCuscino());
	}

	private void verificaIlTema(String temaAtteso, String temaEffettivo) {
		assertEquals(temaAtteso, temaEffettivo);
	}
}
