package org.ds.graph.core;

public interface Graph<V extends Vertex,E extends Edge>{
	/**
	 * return graph type e.g cyclic graph etc.
	 * @return
	 */
	public int graphType();
	
	public boolean isDirectedGraph();
}
