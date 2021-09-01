import javax.security.auth.login.AccountExpiredException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class hps {
    static final String PROB_NAME = "hps";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int N = sc.nextInt();
        int counter = 0;
        int counter2 = 0;
        int ans = 0;
        int[] x = new int[N];
        int[] y = new int[N];
        int [] answer = {3, 1,2};
        int [] answer2 = {2,3 ,1};


        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            if(answer[x[i]-1] == y[i]){
                counter++;
            }

        }

        for(int i = 0; i < N; i++){
            if(answer2[x[i]-1] == y[i]){
                counter2++;
            }

        }

        if(counter > counter2){
            ans = counter;
        }else{
            ans = counter2;
        }
        pw.println(ans);
        //generate output
        pw.close();


    }

}


