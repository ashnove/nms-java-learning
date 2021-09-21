import java.io.*;
import java.util.*;
public class Main {
        public static void main(String[] args)throws Exception {
                FastScanner fs = new FastScanner();
                PrintWriter out = new PrintWriter(System.out);
                int T = 1;
//                T = fs.nextInt();
                for (int tt = 0; tt < T; tt++) {
                        int n = fs.nextInt();
                        int a = fs.nextInt();
                        int b = fs.nextInt();
                        
                        int[] x = new int[n];
                        int[] y = new int[n];
                        
                        for(int i = 0; i < n; i++) {
                        	x[i] = fs.nextInt();
                        	y[i] = fs.nextInt();
                        }
                        
                        boolean[] head = new boolean[n];
                        Arrays.fill(head, true);
                        outer:for(int i = 0; i < n; i++) {
                        	for(int j = i + 1; j < n; j++) {
                        		if( (y[i] - b) * (x[j] - a) == (y[j] - b) * (x[i] - a) ) {
                        			head[i] = false;
                        			continue outer;
                        		}
                        	}
                        }
                        int ans = 0;
                        for(int i = 0; i < n; i++)
                        	if(head[i])
                        		ans++;
                        out.println(ans);
                        
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
