import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class lemonade {
    static final String PROB_NAME = "lemonade";//instance variable
    public static void main(String argv[]) throws IOException {
        // take input from promote.in
        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        

        //generate output
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
        pw.println();
        pw.close();


    }


}

