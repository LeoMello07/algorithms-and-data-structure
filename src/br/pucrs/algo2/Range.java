package br.pucrs.algo2;

public class Range implements Comparable<Range>{
	
	private long start;
	private long end;
	
	public Range( long start, long end ) {
		super();
		this.start = start;
		this.end = end;
	}

	public long getStart() {
		return start;
	}
	
	public void setStart(long start) {
		this.start = start;
	}
	
	public long getEnd() {
		return end;
	}
	
	public void setEnd(long end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "[" + start + ", " + end + "]";
	}

	@Override
	public int compareTo( Range range ) {
		return ( int )( this.start - range.getStart() );
	}
	
}
