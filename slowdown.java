import javax.security.auth.login.AccountExpiredException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class slowdown {
    static final String PROB_NAME = "slowdown";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int N = sc.nextInt();
        int counter = 0;
        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i = 1; i < N; i++){
            for(int o = i- 1; o > -1; o--){
                if(x[o] == x[i]){
                    if(y[o] != y[i]){
                        counter++;

                    }
                    break;

                }
            }

        }


        pw.println(counter);


        //generate output
        pw.close();


    }

}


