import java.io.*;
import java.util.*;
public class Main2 {
        public static void main(String[] args)throws Exception {
                FastScanner fs = new FastScanner();
                PrintWriter out = new PrintWriter(System.out);
                int T = 1;
                T = fs.nextInt();
                for (int tt = 0; tt < T; tt++) {
                        int n = fs.nextInt();
                        String s = fs.next();
                        int l = -1, r = -1;
                        for (int i = 0; i < n; i++) {
                                int a = 0, b = 0;
                                for (int j = i; j < n; j++) {
                                        if (s.charAt(j) == 'a') a++;
                                        else b++;
                                        if (a == b) {
                                                l = i + 1;
                                                r = j + 1;
                                        }
                                }
                        }
                        out.println(l+" "+r);
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