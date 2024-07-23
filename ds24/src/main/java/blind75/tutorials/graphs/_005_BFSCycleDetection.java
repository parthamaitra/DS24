package blind75.tutorials.graphs;

import org.graalvm.collections.Pair;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _005_BFSCycleDetection {
    //https://youtu.be/BPlrALf1LDU?feature=shared
    public boolean isThereACycle(List<List<Integer>> adjList, int source, boolean [] visited){
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(Pair.create(source, -1));

        while(!queue.isEmpty()) {
            int data = queue.peek().getLeft();
            int parent = queue.peek().getRight();
            queue.poll();
            for(int neighbour: adjList.get(data)){
                if(visited[neighbour] == false) {
                    visited[neighbour] = true;
                    queue.add(Pair.create(neighbour, data));
                }
                else if(parent != neighbour) {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean detectCycleInConnectedComponentGraph(List<List<Integer>> adjList){
        boolean []visited = new boolean[adjList.size()];
        for(int i =0; i < adjList.size(); i++) {
            if(visited[i] == false) {
                if(isThereACycle(adjList, i, visited) == true){
                    return true;
                }
            }
        }
        return false;
    }
}
