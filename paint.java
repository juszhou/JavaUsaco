import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class paint {
    static final String PROB_NAME = "paint";//instance variable
    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // algorithm
            int john = b- a;
            int bessie = d -c;
            int totalLabor = john + bessie;

            //if overlap
            int left = Math.min(c,a);
            int right = Math.max(b,d);
            int coverIfOverlap = right - left;

            int answer;
            if(coverIfOverlap > totalLabor){
                answer = totalLabor;
            }else {
                answer = coverIfOverlap;
            }

        //generate output
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
        pw.println(answer);
        pw.close();


        }
}
