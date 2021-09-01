import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class speeding {
    static final String PROB_NAME = "speeding";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int R = sc.nextInt();
        int B = sc.nextInt();
        int [] speed = new int[R];
        int [] pos = new int[R + 1];
        for(int i = 0; i < R; i++){
            int len  = sc.nextInt();
            speed[i] = sc.nextInt();
            pos[i+1] = pos[i] + len;

        }
        int [] speed1 = new int[B];
        int [] pos1 = new int[B + 1];
        for(int i = 0; i < B; i++){
            int len  = sc.nextInt();
            speed1[i] = sc.nextInt();
            pos1[i+1] = pos1[i] + len;
        }
        int poss = 0, b = 0, r = 0;
        int max = 0;
        while( poss <100){
        if( speed1[b] > speed[r]){
            max = Math.max(max, speed1[b] - speed[r]);
        }

        poss = Math.min(pos1[b+1], pos[r+1]);
        if( poss == pos1[b+1]) b++;

        if (poss == pos[r+1]) r++;


        }



       pw.println(max);
        //generate output
        pw.close();


    }

}


