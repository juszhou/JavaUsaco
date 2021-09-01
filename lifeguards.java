import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class lifeguards {
    static final String PROB_NAME = "lifeguards";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int N = sc.nextInt();
        int counter = 0;
        int [] start = new int[N];
        int [] end = new int[N];
        int [] times = new int[N];


        for(int i = 0; i < N; i++){
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        for(int i = 0; i < times.length; i++){
            times[i] = end[i] - start[i];
        }
        Arrays.sort(times);
        for(int i =1; i < times.length; i++){
            counter += times[i];

        }





        pw.println(counter - 1);
        //generate output
        pw.close();


    }

}


