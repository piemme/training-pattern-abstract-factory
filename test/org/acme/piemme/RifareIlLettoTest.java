package org.acme.piemme;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RifareIlLettoTest {

	@Test
	public void conBiancheriaStarWars() {
		RifareIlLetto fareIlLetto = new RifareIlLetto("Starwars");
		assertEquals("cielo stellato", fareIlLetto.copriMaterasso());
		assertEquals("Blu tinta unita", fareIlLetto.copriCuscino());
	}

	@Test
	public void conBiancheriaStarWinx() {
		RifareIlLetto fareIlLetto = new RifareIlLetto("Winx");
		assertEquals("Rosa", fareIlLetto.copriMaterasso());
		assertEquals("Stelle gialle su rosa", fareIlLetto.copriCuscino());
	}
}
