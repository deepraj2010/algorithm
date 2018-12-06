package algorithm.graph.common;

import java.util.List;

public class Vertex {
	
	private String name;
	private List<Vertex> neighbours;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vertex> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(List<Vertex> neighbours) {
		this.neighbours = neighbours;
	}
	
	public Vertex(String name, List<Vertex> neighbours) {
		this.name = name;
		this.neighbours = neighbours;
	}
	
	

}
