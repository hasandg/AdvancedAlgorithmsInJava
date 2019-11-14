package DepthFirstSearch.recursive_buggy;


public class DepthFirstSearchWithRecursionBuggy {



	public void dfsRecursiveBuggy(Vertex vertex){

		System.out.print(vertex+"->");

		for( Vertex v : vertex.getNeighbourList() ){
			if( !v.isVisited() ){
				v.setVisited(true);
				dfsRecursiveBuggy(v);
			}
		}
	}

}
