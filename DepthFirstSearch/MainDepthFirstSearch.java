package DepthFirstSearch;

import DepthFirstSearch.recursive.MainDepthFirstSearchWithRecursion;
import DepthFirstSearch.recursive_buggy.MainDepthFirstSearchWithRecursionBuggy;
import DepthFirstSearch.stack.MainDepthFirstSearchWithStack;

public class MainDepthFirstSearch {
    public static void main(String[] args) {
        System.out.println("MainDepthFirstSearchWithRecursionBuggy");
        MainDepthFirstSearchWithRecursionBuggy.main(null);

        System.out.println("\n\nMainDepthFirstSearchWithRecursion");
        MainDepthFirstSearchWithRecursion.main(null);

        System.out.println("\n\nMainDepthFirstSearchWithStack");
        MainDepthFirstSearchWithStack.main(null);
    }
}
