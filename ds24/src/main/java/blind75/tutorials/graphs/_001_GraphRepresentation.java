package blind75.tutorials.graphs;

import java.util.ArrayList;
import java.util.List;

public class _001_GraphRepresentation {
    public static int[][] getAdjacencyMatrix(int n){
        int row = n+1;
        int columns = n+1;
        int[][] adjacencyMatrix = new int[row][columns];
        return adjacencyMatrix;
    }

    private static void printAdjacencyMatrix(int[][] adjacencyMatrix) {
        for(int i = 0; i < adjacencyMatrix.length; i++){
            for (int j = 0; j< adjacencyMatrix[0].length; j++) {
                System.out.print(adjacencyMatrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> getAdjacencyList(int n){
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for(int i = 0; i<=n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        return adjacencyList;
    }

    private static void printAdjacencyList(List<List<Integer>> list) {
        for(int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] adjacencyMatrix = getAdjacencyMatrix(5);
        adjacencyMatrix[1][2] = 1;
        adjacencyMatrix[2][1] = 1;
        printAdjacencyMatrix(adjacencyMatrix);

        List<List<Integer>> adjacencyList = getAdjacencyList(5);
        adjacencyList.get(1).add(2);
        adjacencyList.get(2).add(1);
        printAdjacencyList(adjacencyList);


    }


}
