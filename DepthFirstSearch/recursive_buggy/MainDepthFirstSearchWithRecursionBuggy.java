package DepthFirstSearch.recursive_buggy;

public class MainDepthFirstSearchWithRecursionBuggy {

    public static void main(String[] args) {

        Vertex vertex1 = new Vertex("1");
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");
        Vertex vertex4 = new Vertex("4");
        Vertex vertex5 = new Vertex("5");


        vertex1.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex4);
        vertex4.addNeighbour(vertex5);
        vertex2.addNeighbour(vertex3);


        DepthFirstSearchWithRecursionBuggy depthFirstSearch = new DepthFirstSearchWithRecursionBuggy();

        // Problematic if graph have clusters(separate vertices)
        depthFirstSearch.dfsRecursiveBuggy(vertex1);

    }
}
