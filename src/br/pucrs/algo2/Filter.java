package br.pucrs.algo2;

import java.util.Collections;
import java.util.List;

public class Filter {

	public static List<Range> filter( List<Range> ranges ) {
		Collections.sort( ranges );
		
		int i = ranges.size() - 1;
		
		while( i > 0 ) {
			Range   last = ranges.get( i );
			Range before = ranges.get( i - 1 );
			
			if ( last.getEnd() < before.getEnd() ) {
				ranges.remove( i );
				i = ranges.size() - 1;
				continue;
			}
			
			if ( last.getStart() < before.getEnd() ) {
				Range newRange = new Range( before.getStart(), last.getEnd() );

				ranges.set( i - 1 , newRange );
				ranges.remove( i );
				i = ranges.size() - 1;
				continue;
			}
			
			i--;
		}
		
		return ranges;
	}
}
