import java.io.*;
import java.util.*;
public class Main4 {
        public static void main(String[] args)throws Exception {
                FastScanner fs = new FastScanner();
                PrintWriter out = new PrintWriter(System.out);
                int T = 1;
                T = fs.nextInt();
                for (int tt = 0; tt < T; tt++) {
                        int n = fs.nextInt();
                        String s = fs.next();
                        char[][] a = new char[n][n];
                        for(int i = 0; i < n; i++){
                                for(int j = 0; j < n; j++)
                                        a[i][j] = '.';
                        }
                        HashSet<Integer> set = new HashSet<>();
                        for(int i = 0; i < n; i++){
                                if(s.charAt(i) == '1')
                                        set.add(i);
                        }
                        int[] hash = new int[n];
                        Arrays.fill(hash, 0);

                        for(int i = 0; i < n; i++){
                                for(int j = 0; j < n; j++){
                                        if(set.contains(i) == true || set.contains(j))
                                                a[i][j] = a[j][i] = '=';
                                        else a[i][j] = '+';

                                        if(i == j) a[i][j] = 'X';
                                        if(a[i][j] == '+')
                                                hash[i]++;
                                }
                        }
                        boolean ok = true;
                        for(int i = 0; i < n; i++){
                                if(s.charAt(i) == '2' && hash[i] == 0)
                                        ok = false;

                        }
                        if(!ok){
                                out.println("NO");
                                continue;
                        }
                        out.println("YES");
                        for(int i = 0; i < n; i++){
                                for(int j = 0; j < n; j++){
                                        out.print(a[i][j]);
                                }
                                out.println();
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
