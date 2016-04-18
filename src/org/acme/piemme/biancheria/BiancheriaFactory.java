package org.acme.piemme.biancheria;

import org.acme.piemme.biancheria.starwars.StarwarsBiancheriaFactory;
import org.acme.piemme.biancheria.winx.WinxBiancheriaFactory;
/**
 * Partecipante: nessuno
 * utility per che restituisce la concrete factory 
 * La logica potrebbe essere contenuta nella AbstractBiancheriaFactory
 * quindi AbstractBiancheriaFactory diventerebbe classe astratta e non interfaccia
 */
public class BiancheriaFactory  {
	public static AbstractBiancheriaFactory getFactoryBy(String tipoBiancheria) {
	     switch (tipoBiancheria) {
         case "Starwars":
        	 return new StarwarsBiancheriaFactory();
         case "Winx":
        	 return new WinxBiancheriaFactory();
         default:
             throw new IllegalArgumentException("tipo biancheria non valida: " + tipoBiancheria);
	     }		
	}
}
