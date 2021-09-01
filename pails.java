import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class pails {
    static final String PROB_NAME = "pails";//instance variable
    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int x = sc.nextInt();
        int y = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;

        // algorithm
        for(int i = 0; i*x <= m; i++) {
            for(int p = 0; i*x + p*y <= m; p++) {
                if(i*x + p*y > ans) {
                    ans = i*x + p*y;
                }
            }
        }

        //generate output
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
        pw.println(ans);
        pw.close();


    }
}
