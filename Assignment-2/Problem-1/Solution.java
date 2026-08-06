import java.util.*;

public class Solution {

    static ArrayList<Integer>[] tree;
    static int[] key;
    static int K;
    static int count = 0;

    static void dfs(int node, int parent, int xor) {

        xor = xor ^ key[node];

        if (xor >= K) {
            count++;
        }

        for (int child : tree[node]) {

            if (child != parent) {

                dfs(child, node, xor);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        K = sc.nextInt();

        key = new int[n + 1];
        tree = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 1; i <= n; i++) {
            key[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            tree[u].add(v);
            tree[v].add(u);
        }

        dfs(1, 0, 0);

        System.out.println(count);
    }
}
