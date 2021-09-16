import java.io.*;
import java.util.*;
public class general {
        public static void main(String[] args)throws Exception {
                FastScanner fs = new FastScanner();
                PrintWriter out = new PrintWriter(System.out);
                
                Transporter t1 = new Transporter();
                t1.setnumber("987654321");
                t1.getnumber();
                t1.name = "Ashutosh";
                t1.showName();
                
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
                long nextLong() {
                        return Long.parseLong(next());
                }
                double nextDouble() {
                        return Double.parseDouble(next());
                }
        }


}
