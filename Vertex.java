package CycleDetection._01;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean isVisited;
	private boolean isLoop;

	public boolean isLoop() {
		return isLoop;
	}

	public void setLoop(boolean isLoop) {
		this.isLoop = isLoop;
	}

	private List<Vertex> adjacenciesList;

	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacenciesList = new ArrayList<Vertex>();
	}

	public void addNeighbour(Vertex vertex) {
		this.adjacenciesList.add(vertex);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public List<Vertex> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void setAdjacenciesList(List<Vertex> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}

	@Override
	public String toString() {
		return "Vertex [name=" + name + "]";
	}

}
