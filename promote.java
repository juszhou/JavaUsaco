import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class promote {
    public static void main(String argv[]) throws IOException {
        // take input from promote.in
        Scanner sc = new Scanner(new File("promote.in"));
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int g1 = sc.nextInt();
        int g2 = sc.nextInt();
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();

        // algorithm
        int g2p = p2 - p1;
        int s2g = g2 - g1 + g2p;
        int b2s = s2 - s1 + s2g;


        //generate output
        PrintWriter pw = new PrintWriter(new FileWriter(("promote.out")));
        pw.println(b2s);
        pw.println(s2g);
        pw.println(g2p);
        pw.close();
    }
}
