package blind75.tutorials.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _003_DFS {

    public static List<Integer> getDFSPath(List<List<Integer>> adjList) {
        List<Integer> dfs = new ArrayList<>();
        boolean []visited = new boolean[adjList.size()];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        visited[0] = true;

        while(!stack.isEmpty()) {
            Integer node = stack.pop();
            dfs.add(node);

            for(int i : adjList.get(node)) {
                if(visited[i] == false) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
        return dfs;
    }

    public static void main(String[] args) {
        List < List < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        /*adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);*/

        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(1);
        adj.get(0).add(3);
        adj.get(1).add(4);

        System.out.println(getDFSPath(adj));

    }
}
