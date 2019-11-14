package DepthFirstSearch.recursive;

import java.util.List;


public class DepthFirstSearchWithRecursion {

	private List<Vertex> vertexList;
	private int time = 0;

	public DepthFirstSearchWithRecursion(List<Vertex> vertexList){
		this.vertexList = vertexList;
	}

	public void runDfsWithRecursion(){
		for( Vertex vertex : vertexList ){
			if( !vertex.isVisited() ){
				dfs(vertex);
			}
		}
	}

	public void dfs(Vertex vertex){

		System.out.print(vertex.getName()+"-");

		time++;
		vertex.setStartingRank(time);

		for( Vertex v : vertex.getNeighbourList() ){
			if( !v.isVisited() ){
				v.setVisited(true);
				v.setPredecessor(vertex);
				dfs(v);
			}
		}

		time++;
		vertex.setFinishingRank(time);
	}
	
	public void printVertices(){
		for(Vertex vertex : vertexList){
			System.out.println(vertex+"");
		}
	}
}
