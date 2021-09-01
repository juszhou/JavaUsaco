import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class billboard {
    static int tx1, ty1, tx2, ty2;

    static final String PROB_NAME = "billboard";//instance variable
    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int b1x1 = sc.nextInt();
        int b1y1 = sc.nextInt();
        int b1x2 = sc.nextInt();
        int b1y2 = sc.nextInt();
        int area = (b1x2-b1x1) * (b1y2-b1y1);

        int b2x1 = sc.nextInt();
        int b2y1 = sc.nextInt();
        int b2x2 = sc.nextInt();
        int b2y2 = sc.nextInt();
        int area1 = (b2x2-b2x1) * (b2y2-b2y1);

         tx1 = sc.nextInt();
         ty1 = sc.nextInt();
         tx2 = sc.nextInt();
         ty2 = sc.nextInt();
        // algorithm
        int overlapS = overLap(b2x1, b2x2, b2y1, b2y2 ) + overLap(b1x1,b1x2,b1y1,b1y2);




        //generate output
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
        pw.println(area+area1 - overlapS);
        pw.close();


    }
    public static int overLap(int b1x1, int b1x2, int b1y1, int b1y2){
        int left  = Math.max(b1x1,tx1);
        int right = Math.min(b1x2, tx2);
        int bottom = Math.max(b1y1, ty1);
        int top = Math.min(b1y2, ty2);
        return Math.max(0, right-left) + Math.max(0, top-bottom);

    }
}
