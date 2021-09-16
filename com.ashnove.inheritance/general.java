import java.io.*;
import java.util.*;
public class general {
        public static void main(String[] args)throws Exception {
                FastScanner fs = new FastScanner();
                PrintWriter out = new PrintWriter(System.out);
                
                System.out.println("Supplier's Data");
                Supplier s1 = new Supplier();
                s1.name = "Natrajan";
                s1.showName();
                System.out.println(s1.name + "'s citizenship is "+s1.citizenShip);
                s1.setnumber("951623478");
                s1.getnumber();
                
                System.out.println();
                
                System.out.println("Transporter's Data");
                Transporter t1 = new Transporter();
                t1.name = "Ashutosh";
                t1.showName();
                System.out.println(t1.name + "'s citizenship is "+t1.citizenShip);
                t1.setnumber("987654321");
                t1.getnumber();
                
                System.out.println();
                
                System.out.println("Consumer's Data");
                Consumer c1 = new Consumer();
                c1.name = "Rishav";
                c1.showName();
                System.out.println(c1.name + "'s citizenship is "+c1.citizenShip);
                c1.setnumber("965455321");
                c1.getnumber();
                
//                out.close();
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
