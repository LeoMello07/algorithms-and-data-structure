package br.pucrs.algo2;

public class Lista implements Comparable<Lista>{
	
	private long inicio;
	private long fim;
	
	public Lista( long inicio, long fim ) {
		super();
		this.inicio = inicio;
		this.fim = fim;
	}

	public long getInicio() {
		return inicio;
	}
	
	public void setInicio(long inicio) {
		this.inicio = inicio;
	}
	
	public long getFim() {
		return fim;
	}
	
	public void setFim(long fim) {
		this.fim = fim;
	}

	@Override
	public String toString() {
		return "[" + inicio + ", " + fim + "]";
	}

	@Override
	public int compareTo( Lista listaFinal ) {
		return ( int )( this.inicio - listaFinal.getInicio() );
	}
	
}
