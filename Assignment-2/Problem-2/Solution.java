import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }

        int[] distance = new int[n + 1];
        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        distance[1] = 0;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            for (int next : graph[current]) {

                if (distance[next] == -1) {

                    distance[next] = distance[current] + 1;
                    queue.add(next);
                }
            }
        }

        int answer = 0;

        for (int i = 1; i <= n; i++) {

            if (distance[i] != -1 && distance[i] <= d) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
