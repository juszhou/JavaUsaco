import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class whereami {
    static final String PROB_NAME = "whereami";//instance variable
    public static void main(String argv[]) throws IOException {
        // take input from promote.in
        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
        int n = sc.nextInt();
        String house = sc.next();
        tryk:for (int i = 1; i <= n; i++) {
            for (int start = 0; start <= n - i; start++) {
                String see = house.substring(start, start + i);
                int repeat = house.indexOf(see, start + 1);
                if (repeat != -1) {
                   continue tryk;
                }

            }


            //generate output

            pw.println(i);
            pw.close();
        return;

        }
    }

}

