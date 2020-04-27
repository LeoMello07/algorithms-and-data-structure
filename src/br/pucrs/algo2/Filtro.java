package br.pucrs.algo2;

import java.util.Collections;
import java.util.List;

public class Filtro {

	public static List<Lista> compressao( List<Lista> listaFinal ) {
		Collections.sort( listaFinal );
		
		int i = listaFinal.size() - 1;
		
		while( i > 0 ) {
			Lista   ultima = listaFinal.get( i );
			Lista antes = listaFinal.get( i - 1 );
			
			if ( ultima.getFim() < antes.getFim() ) {
				listaFinal.remove( i );
				i = listaFinal.size() - 1;
				continue;
			}
			
			if ( ultima.getInicio() < antes.getFim() ) {
				Lista novalista = new Lista( antes.getInicio(), ultima.getFim() );

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
