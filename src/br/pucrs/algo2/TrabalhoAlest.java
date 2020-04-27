package br.pucrs.algo2;

import java.util.List;

public class TrabalhoAlest {
	
	public static void main(String[] args) {
		
		// Leitura de arquivos
		List<Lista> listaFinal = Arquivo.readTestFile( "cohen01.txt" );

		// Filtragem de IPs
		List<Lista> output = Filtro.compressao( listaFinal );
        
		// Printar a lista final
        System.out.println( output );
        
        // Salvar a solução
        Arquivo.salvarSolucao( "cohen01.txt" , output );
	}
	
}
