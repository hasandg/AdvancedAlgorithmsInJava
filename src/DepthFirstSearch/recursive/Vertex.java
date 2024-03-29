package DepthFirstSearch.recursive;

import java.util.ArrayList;
import java.util.List;


public class Vertex {


	private String name;
	private List<Vertex> neighbourList;
	private boolean visited;
	private Vertex predecessor;
	private int startingRank;
	private int finishingRank;

	public Vertex(String name) {
		this.name = name;
		this.neighbourList = new ArrayList<>();
	}

	public void addNeighbour(Vertex vertex) {
		this.neighbourList.add(vertex);
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public int getStartingRank() {
		return startingRank;
	}

	public void setStartingRank(int startingRank) {
		this.startingRank = startingRank;
	}

	public String getName() {
		return name;
	}

	public int getFinishingRank() {
		return finishingRank;
	}

	public void setFinishingRank(int finishingRank) {
		this.finishingRank = finishingRank;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	@Override
	public String toString() {
		return this.name+"- StartTime: "+startingRank+"- EndTime: "+finishingRank;
	}
}
