import javax.security.auth.login.AccountExpiredException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class balancing {
    static final String PROB_NAME = "balancing";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int N = sc.nextInt();
        int B = sc.nextInt();
        int [] x = new int[N];
        int [] y = new int[N];

        for(int i = 0; i < N; i++){
        x[i] = sc.nextInt();
        y[i] = sc.nextInt();
        }

        //algorithm
        int minM = N;
        for(int i = 0; i < N; i++){
            int fence_y = y[i] - 1;
            for(int j = 0; j <N; j++){
                int fence_x = x[j] -1;
                int upper_left = 0, upper_right = 0, lower_left = 0, lower_right = 0;
                int M = 0;
                for(int p = 0; p < N; p++) {
                    if (x[p] < fence_x) {
                        if (y[p] < fence_y) {
                            lower_left++;}
                        else{

                            upper_left++;
                        }
                    }else {
                            if(y[p] < fence_y){
                                lower_right++;
                            }else
                                upper_right++;
                        }
                    }
                M = Math.max(Math.max(lower_left,lower_right),Math.max(upper_left,upper_right));
                minM = Math.min(minM, M);
            }
                }


        pw.println(minM);
        //generate output
        pw.close();


    }

}


