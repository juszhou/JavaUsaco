import javax.security.auth.login.AccountExpiredException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class shuffle {
    static final String PROB_NAME = "shuffle";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        char [] lineup = {' ','A', 'B', 'C','D','E'};
        int [] instruction = {0,1,4,5,3,2};
        char []after = new char[lineup.length];
                for(int i = 1; i < lineup.length; i++){

                    after[instruction[i]] = lineup[i];
                }
                for(int i= 1; i < lineup.length; i++){
                    System.out.print(after[i] + " ");
                }





        //generate output
        pw.print("a");
        pw.close();


    }

}


