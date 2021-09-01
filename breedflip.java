import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class breedflip {
    static final String PROB_NAME = "breedflip";//instance variable
    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int N = sc.nextInt();
        String A = sc.next();
        String  B = sc.next();

        // algorithm
        int flipCount = 0;;
        boolean prevCharbad = false;
        for(int i = 0; i < N; i++){
        char a = A.charAt(i);
        char b = B.charAt(i);
        if(a == b){
            prevCharbad = false;
        }else {
            if(!prevCharbad){
                flipCount++;
            }
            prevCharbad = true;
        }



        }




        //generate output
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
        pw.println(flipCount);
        pw.close();


    }

}
