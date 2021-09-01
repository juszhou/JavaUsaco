import javax.security.auth.login.AccountExpiredException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class cowroute {
    static final String PROB_NAME = "cowroute";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int A = sc.nextInt();
        int B = sc.nextInt();
        int numofRoutes = sc.nextInt();
        int minCost = Integer.MAX_VALUE;
        for(int r= 0; r< numofRoutes; r++){
            int cost =sc.nextInt();
            int numofCities = sc.nextInt();
            int [] citiesonRoute = new int [numofCities];
            boolean alreadyseenA = false;
            for(int  c= 0; c< numofCities; c++){
                int aCity = sc.nextInt();
                if(aCity == A) {
                    alreadyseenA = true;
                }
                    else if(aCity == B){
                        if(alreadyseenA){
                            minCost = Math.min(minCost, cost);
                        }


                }
            }
        }
        if(minCost == Integer.MAX_VALUE){
            minCost = -1;
        }

        pw.println(minCost);
        //generate output
        pw.close();


    }

}


