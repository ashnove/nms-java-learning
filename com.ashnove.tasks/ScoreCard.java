import java.io.*;
import java.io.FileOutputStream;
import java.util.*;
public class ScoreCard {
        public static void main(String[] args)throws Exception {

//                File file = new File("/home/ashnove/Documents/NETMEDS-WORK/netmeds-java-learning/files/ScoreCardOutput.txt");
                PrintWriter out = new PrintWriter(System.out);
                
                out.println("Cricket Game Started");
           
                int playerA_Hand;
                int playerB_Hand;

                Random random = new Random();	
                
                int numberOfMatches = 3;
                boolean turn = true;
                
                
                int matchesWonByA = 0, matchesWonByB = 0;
                
                for(int match = 1; match <= numberOfMatches; match++) {
                	int playerA_score = 0, playerB_score = 0;
                    
                    out.println("Match " + match);
                    out.println("================");
                    out.println("Player A           Player B");
                    out.println("----------------------------");
      
                    String player = "B";
                    if(turn == true)
                    	player = "A";
                    
                    while(true) {
                    	
                    	playerA_Hand = random.nextInt(7);
                    	playerB_Hand = random.nextInt(7);
                    	out.println("   "+ playerA_Hand +"            	" + playerB_Hand);
                    	if(playerA_Hand == playerB_Hand) {
                    		out.println(player + " is out!");
                    		break;
                    	}
                    	if(turn == true)
                    		playerA_score += playerA_Hand;
                    	else
                    		playerB_score += playerB_Hand;
                    }
//                    out.println();
                    if(playerA_score == playerB_score) {
                    	out.println("Match Tied");
                    }
                    else if(playerA_score > playerB_score) {
                    	int AwonBy = playerA_score - playerB_score;
                    	out.println("A won the game by " + AwonBy + " runs.");
                    	matchesWonByA++;
                    }
                    else if(playerA_score < playerB_score) {
                    	int BwonBy = playerB_score - playerA_score;
                    	out.println("A won the game by " + BwonBy + " runs.");
                    	matchesWonByB++;
                    }
                    out.println();
                }
                String divider = "==============================================";
                out.println(divider);
                if(matchesWonByA > matchesWonByB) {
                	out.println("A won the Championship!");
                }
                else {
                	out.println("B won the Championship!");
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
