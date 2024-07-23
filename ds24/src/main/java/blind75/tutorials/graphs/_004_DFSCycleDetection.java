package blind75.tutorials.graphs;

import org.graalvm.collections.Pair;

import java.util.List;
import java.util.Stack;

public class _004_DFSCycleDetection {
    public boolean isThereACycle(List<List<Integer>> adjList) {
        boolean[]visited = new boolean[adjList.size()];
        for(int i = 0; i< adjList.size(); i++){
            return isCycleBfs(i, visited, adjList);
        }
        return false;
    }

    private boolean isCycleBfs(int source, boolean[] visited, List<List<Integer>> adjList) {

        Stack<Pair<Integer, Integer>> stack = new Stack<>();

        visited[source] = true;
        stack.push(Pair.create(source, -1));

        while(!stack.isEmpty()){
            Pair<Integer, Integer> current = stack.pop();
            Integer item = current.getLeft();
            int parent = current.getRight();

            for(int neighbour: adjList.get(item)){
                if(visited[neighbour] == false) {
                    visited[neighbour] = true;
                    stack.push(Pair.create(neighbour, parent));
                }
                else if(parent != neighbour){
                    return true;
                }
            }

        }
        return false;
    }


}
