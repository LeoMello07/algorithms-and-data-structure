package br.pucrs.algo2;

import java.util.Collections;
import java.util.List;

public class Filtro {

	public static List<Lista> compressao( List<Lista> listaFinal ) {
		Collections.sort( listaFinal );
		
		int i = listaFinal.size() - 1;
		
		while( i > 0 ) {
			Lista   last = listaFinal.get( i );
			Lista before = listaFinal.get( i - 1 );
			
			if ( last.getFim() < before.getFim() ) {
				listaFinal.remove( i );
				i = listaFinal.size() - 1;
				continue;
			}
			
			if ( last.getInicio() < before.getFim() ) {
				Lista novalista = new Lista( before.getInicio(), last.getFim() );

				listaFinal.set( i - 1 , novalista );
				listaFinal.remove( i );
				i = listaFinal.size() - 1;
				continue;
			}
			
			i--;
		}
		
		return listaFinal;
	}
}
