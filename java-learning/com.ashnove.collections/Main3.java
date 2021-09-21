import java.io.*;
import java.util.*;
public class Main3 {
        public static void main(String[] args)throws Exception {
                FastScanner fs = new FastScanner();
                PrintWriter out = new PrintWriter(System.out);
                int T = 1;
                // T = fs.nextInt();
                for (int tt = 0; tt < T; tt++) {

                        int n = fs.nextInt();
                        int x = fs.nextInt();
                        ArrayList<Integer>[] adj = new ArrayList[n + 1];
                        for (int i = 0; i <= n; i++)
                                adj[i] = new ArrayList<>();
                        for (int i = 0; i < n - 1; i++) {
                                int u = fs.nextInt();
                                int v = fs.nextInt();
                                adj[u].add(v);
                                adj[v].add(u);
                        }
                        Queue<Integer> q = new LinkedList<>();  
                        q.add(1);
                        int[] vis = new int[n + 1];
                        int[] par = new int[n + 1];
                        int[] dis = new int[n + 1];
                        Arrays.fill(par, -1);

                        while (!q.isEmpty()) {
                                int from = q.poll();
                                for (int to : adj[from]) {
                                        if (vis[to] == 0) {
                                                vis[to] = 1;
                                                par[to] = from;
                                                dis[to] = dis[from] + 1;
                                                q.add(to);
                                        }
                                }
                        }
                        int times = (dis[x] - 1) / 2;
                        int node = x;
                        while (times-- > 0) {
                                node = par[node];
                        }
                        Arrays.fill(vis, 0);
                        vis[par[node]] = 1;
                        q.add(node);
                        int disMax = dis[node];
                        while (!q.isEmpty()) {
                                int from = q.poll();
                                for (int to : adj[from]) {
                                        if (vis[to] == 0) {
                                                vis[to] = 1;
                                                disMax = Math.max(disMax, dis[to]);
                                                q.add(to);
                                        }
                                }
                        }
                        out.println(disMax*2);

                }
                out.close();
        }



        static class FastScanner         {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer("");
                String next() {
                        while (!st.hasMoreTokens())
                                try {
                                        st = new StringTokenizer(br.readLine());
                                } catch (IOException e) {
                                        e.printStackTrace();
                                }
                        return st.nextToken();
                }


                int nextInt() {
                        return Integer.parseInt(next());
                }
                int[] readArray(int n) {
                        int[] a = new int[n];
                        for (int i = 0; i < n; i++) a[i] = nextInt();
                        return a;
                }
                long nextLong() {
                        return Long.parseLong(next());
                }
                double nextDouble() {
                        return Double.parseDouble(next());
                }
        }


}
