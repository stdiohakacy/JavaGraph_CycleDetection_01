package CycleDetection._01;

import java.util.List;

public class CycleDetection {
	
	private void dfs(Vertex vertex) {
		System.out.println("DFS on vertex " + vertex);
		vertex.setLoop(true);
		for (Vertex v : vertex.getAdjacenciesList()) {
			System.out.println("Visiting the neighbour of vertex : " + vertex);
			if(v.isLoop()) { 
				System.out.println("There is a backward edge : so there is a cycle!");
				return;
			}
			if(!v.isVisited()) {
				System.out.println("Visiting vertex " + v + " recursively ... ");
				v.setVisited(true);
				dfs(v);
			}
		}
		vertex.setLoop(false);;
		vertex.setVisited(true);
		System.out.println("Set vertex " + vertex + " setBeingVisited");
		System.out.println();
	}
	
	public void detectCycle(List<Vertex> vertexList) {
		for (Vertex vertex : vertexList) {
			if(!vertex.isVisited()) {
				dfs(vertex);
			}
		}
	}
}
