package proyecto;

import linealdata.Node;

public class edge implements Node{
	private nodo origen;
	private nodo destino;
	public edge next = null;


	public edge(nodo origen, nodo destino) {
		this.origen = origen;
		this.destino = destino;
		
	}


	public nodo getOrigen() {
		return origen;
	}


	public void setOrigen(nodo origen) {
		this.origen = origen;
	}


	public nodo getDestino() {
		return destino;
	}


	public void setDestino(nodo destino) {
		this.destino = destino;
	}

	public void setNext(Node node) {
		this.next = (edge)node;
		
	}

	@Override
	public Node getNext() {
		return this.next;
	}
	public String toString() {
        return  " desde "+origen.getEtiqueta()+ " hacia " +destino.getEtiqueta();
    }


	@Override
	public Node clone() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isEqual(Node node) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}
}
