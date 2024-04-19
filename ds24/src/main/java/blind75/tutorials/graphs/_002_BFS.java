package blind75.tutorials.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _002_BFS {


    public static void main(String[] args) {
        List < List < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        System.out.println(getBFSPath(adj));

    }

    private static List<Integer> getBFSPath(List<List<Integer>> adj) {
        List<Integer> bfs = new ArrayList<>();
        boolean []visited = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[0] = true;
        queue.add(0);

        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            bfs.add(node);

            for(int i : adj.get(node)) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return bfs;


    }
}
