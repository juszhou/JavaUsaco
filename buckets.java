import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class buckets {
    static final String PROB_NAME = "buckets";//instance variable
    public static void main(String argv[]) throws IOException {
        // take input from promote.in
        String board  = "";


        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));

        for(int i =0; i < 10; i++) {
            board += sc.next();
        }

        int b = board.indexOf("B");
        int r = board.indexOf("R");
        int l = board.indexOf("L");
        int bx = b % 10;
        int rx = r % 10;
        int lx = l % 10;
        int by = b / 10;
        int ry = r / 10;
        int ly = l / 10;
        int maxx = Math.max(bx,lx);
        int minx = Math.min(bx,lx);
        int maxy = Math.max(by,ly);
        int miny  = Math.min(by,ly);
        System.out.print(rx + " "+ lx + " " +ry + " " + ly);
        int distance = (maxx-minx) +  (maxy- miny) -1;
        if(rx == lx&& rx == bx && ry > miny && ry < maxy){
            distance += 2;
        }
        if(ry == ly&& ry == by && rx > minx && rx < maxx){
            distance += 2;
        }
        //generate output
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
            pw.println(distance);
        pw.close();


    }


}

