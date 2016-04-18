package org.acme.piemme;

import org.acme.piemme.biancheria.AbstractBiancheriaFactory;
import org.acme.piemme.biancheria.starwars.StarwarsBiancheriaFactory;
import org.acme.piemme.biancheria.winx.WinxBiancheriaFactory;
/**
 * Partecipante: nessuno
 * utility per che restituisce la concrete factory 
 * Deve stare nel package org.acme.piemme.biancheria? 
 */
public class Assistente {
	static AbstractBiancheriaFactory scegliBiancheria(String tipoBiancheria) {
	     switch (tipoBiancheria) {
         case "Starwars":
        	 return new StarwarsBiancheriaFactory();
         case "Winx":
        	 return new WinxBiancheriaFactory();
         default:
             throw new IllegalArgumentException("biancheria non valida: " + tipoBiancheria);
	     }
	}
}
