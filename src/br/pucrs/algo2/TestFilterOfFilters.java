package br.pucrs.algo2;

import java.util.List;

public class TestFilterOfFilters {
	
	public static void main(String[] args) {
		
		// Read file
		List<Range> ranges = FileUtil.readTestFile( "cohen01.txt" );

		// Apply ip filter
		List<Range> output = Filter.filter( ranges );
        
		// Print solution
        System.out.println( output );
        
        // Save the solution 
        FileUtil.writeSolutionFile( "cohen01.txt" , output );
	}
	
}
