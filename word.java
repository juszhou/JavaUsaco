import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class word {
    static final String PROB_NAME = "word";//instance variable
    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
        int N = sc.nextInt();
        int A = sc.nextInt();
        String [] B = new String[N];
        int charCount = 0;
        String currLin = "";
        for(int x  = 0; x < B.length; x++){
            B[x] =sc.next();
        }



        // algorithm
        for(int i = 0; i < N; i++){
            if(charCount + B[i].length() <= A){
                currLin +=   B[i] + " ";
                charCount +=  B[i].length();



            }
            else{
                pw.println(currLin.trim());
                currLin = B[i] + " ";
                charCount = B[i].length();
            }
        }




        //generate output

        pw.println(currLin.trim());
        pw.close();


    }

}
