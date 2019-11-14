package DepthFirstSearch.recursive;

import java.util.ArrayList;
import java.util.List;

public class MainDepthFirstSearchWithRecursion {

    public static void main(String[] args) {

         List<Vertex> vertexList = new ArrayList<>();

		Vertex vertex1 = new Vertex("1");
		Vertex vertex2 = new Vertex("2");
		Vertex vertex3 = new Vertex("3");
		Vertex vertex4 = new Vertex("4");
		Vertex vertex5 = new Vertex("5");



        vertex1.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex4);
        vertex4.addNeighbour(vertex5);
        vertex2.addNeighbour(vertex3);

        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);
        vertexList.add(vertex4);
        vertexList.add(vertex5);

        DepthFirstSearchWithRecursion depthFirstSearch = new DepthFirstSearchWithRecursion(vertexList);



     //    depthFirstSearch.dfs(vertex1);

        depthFirstSearch.runDfsWithRecursion();

    }
}
