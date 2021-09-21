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
                	int[] a = new int[n + 1];
                	for(int i = 1; i <= n; i++)
                		a[i] = fs.nextInt();
                	
                	Map<Integer, Integer> left = new HashMap<Integer, Integer>();
                	Map<Integer, Integer> right = new HashMap<Integer, Integer>();
                	int sum = 0;
                	for(int i = n; i >= 1; i--) {
                		sum += a[i];
                		right.getKey();
       
                	}
                	
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
