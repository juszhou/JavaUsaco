import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mixmilk {
    static final String PROB_NAME = "mixmilk";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int [] capacity = new int[3];
        int [] curr = new int[3];
        for(int i = 0; i < 3; i++){
            capacity[i] = sc.nextInt();
            curr[i] = sc.nextInt();
        }

        for(int i = 0; i < 100; i++){
            int from = i % 3;
            int to = (from + 1) % 3;
            if(curr[from] <= capacity[to] - curr[to]){
                curr[to] += curr[from];
                        curr [from] = 0;
            } else {
                curr [ from] -= capacity[to] - curr[to];
                curr[to] = capacity[to];

            }
        }


        for(int i = 0; i < 3; i++){
            pw.println(curr[i]);
        }
        //generate output
        pw.close();


    }

}


