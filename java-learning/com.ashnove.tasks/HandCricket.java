import java.io.*;
import java.util.*;
public class HandCricket {
        public static void main(String[] args)throws Exception {
                FastScanner fs = new FastScanner();
                PrintWriter out = new PrintWriter(System.out);
                
                out.println("Cricket Game Started");
           
                int playerA_Hand;
                int playerB_Hand;
                int timeout = 90; // minutes;
                Random random = new Random();		
                int playerA_score = 0, playerB_score = 0;
                
                out.println("Player A is batting and Player B is bowling");
                out.println();
                while(true) {
                	
                	playerA_Hand = random.nextInt(7);
                	playerB_Hand = random.nextInt(7);
                	out.println("Player A throws "+ playerA_Hand +" Player B throws " + playerB_Hand);
                	if(playerA_Hand == playerB_Hand) {
                		out.println("A is out!");
                		break;
                	}
                	playerA_score += playerA_Hand;
                }
                timeout = 90; // reset timeout
                
                
                out.println("Player B is batting and Player A is bowling");
                out.println();
                while(true) {
                	
                	playerA_Hand = random.nextInt(7);
                	playerB_Hand = random.nextInt(7);
                	out.println("Player A throws "+ playerA_Hand +" Player B throws " + playerB_Hand);
                	if(playerA_Hand == playerB_Hand) {
                		out.println("B is out!");
                		break;
                	}
                	playerB_score += playerB_Hand;
                }
                
                if(playerA_score == playerB_score) {
                	out.println("Match Tied");
                }
                else if(playerA_score > playerB_score) {
                	int AwonBy = playerA_score - playerB_score;
                	out.println("A won the game by " + AwonBy + " runs.");
                }
                else if(playerA_score < playerB_score) {
                	int BwonBy = playerB_score - playerA_score;
                	out.println("A won the game by " + BwonBy + " runs.");
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
                long nextLong() {
                        return Long.parseLong(next());
                }
                double nextDouble() {
                        return Double.parseDouble(next());
                }
        }


}
