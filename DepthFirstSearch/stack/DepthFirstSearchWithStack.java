package DepthFirstSearch.stack;
import java.util.List;
import java.util.Stack;


public class DepthFirstSearchWithStack {


	private Stack<Vertex> stack;

	public DepthFirstSearchWithStack(){
		this.stack=new Stack<>();
	}

	public void dfsWithStack(Vertex root){

		stack.add(root);
		root.setVisited(true);

		while( !stack.isEmpty() ){

			Vertex actualVertex = stack.pop();
			System.out.println(actualVertex+"->");

			for( Vertex v : actualVertex.getNeighbourList() ){
				if( !v.isVisited() ){
					v.setVisited(true);
					stack.push(v);
				}
			}
		}
	}
}
