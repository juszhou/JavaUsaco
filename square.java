import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class square {
    static final String PROB_NAME = "square";//instance variable
    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int s1x1 = sc.nextInt();
        int s1y1 = sc.nextInt();
        int s1x2 = sc.nextInt();
        int s1y2 = sc.nextInt();
        int s2x1 = sc.nextInt();
        int s2y1 = sc.nextInt();
        int s2x2 = sc.nextInt();
        int s2y2 = sc.nextInt();
        // algorithm

        int left  = Math.min(s1x1,s2x1);
        int right = Math.max(s1x2, s2x2);
        int bottom = Math.min(s1y1, s2y1);
        int top = Math.max(s1y2, s2y2);
        int height = top - bottom;
        int width = right - left;
        int square = Math.max(height,width);
        int answer =square*square;


        //generate output
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
        pw.println(answer);
        pw.close();


    }
}
