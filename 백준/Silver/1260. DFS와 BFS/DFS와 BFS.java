import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        boolean[][] graph = new boolean[N+1][N+1];
        boolean[] dfsVisited = new boolean[N+1];
        boolean[] bfsVisited = new boolean[N+1];

        for(int k=0; k<N+1; k++){
            graph[k][k] = true;
        }

        for(int i=1; i<=M; i++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            graph[row][col] = true;
            graph[col][row] = true;
        }

        dfs(N,graph, V, dfsVisited);

        bfs(N,graph, V, bfsVisited);

    }


    public static void dfs(int N, boolean[][] graph, int v, boolean[] visited) {
        visited[v] = true;
        System.out.println(v);

        for (int i =1; i<=N; i++){
            if(graph[v][i]) {
                if (!visited[i]) {
                    dfs(N, graph, i, visited);
                }
            }
        }
    }


    public static void bfs(int N, boolean[][] graph, int startNode, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        visited[startNode] = true;

        while (!(queue.isEmpty())) {
            int v = queue.remove();
            System.out.println(v);

            for (int i=1; i<=N; i++) {
                if(graph[v][i]) {
                    if(!visited[i]) {
                        queue.add(i);
                        visited[i] = true;

                    }
                }
            }
        }


    }
}