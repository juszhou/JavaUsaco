import javax.security.auth.login.AccountExpiredException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class cbarn {
    static final String PROB_NAME = "cbarn";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int N = sc.nextInt();
        int [] cows = new int[N];
        for(int i = 0; i <N; i ++){
            cows[i] = sc.nextInt();
        }
        int minTotalDistance = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            int totalDistance = 0;
            for(int destinationRoom = 0; destinationRoom < N; destinationRoom++){
                int eachCowWalk = destinationRoom - i;
                if(destinationRoom < i){
                    eachCowWalk += N;

                }
                totalDistance += cows[destinationRoom] * eachCowWalk;
            }
            if(totalDistance < minTotalDistance) {
                minTotalDistance = totalDistance;
            }
        }


        pw.println(minTotalDistance);
        //generate output
        pw.close();


    }

}


