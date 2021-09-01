import javax.security.auth.login.AccountExpiredException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class records {
    static final String PROB_NAME = "records";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int A = sc.nextInt();
        String [] lines = new String[A];
        for(int i=0; i< A; i++){
            String [] names = new String[3];
            names[0] = sc.next();
            names[1] = sc.next();
            names[2] = sc.next();
            Arrays.sort(names);
            String line = names[0] + " " + names[1] + " "+ names[2];
            lines[i] = line;
        }
        Arrays.sort(lines);
        int maxCount = 1, counter =1;
        for(int i =1; i < A; i++){
            if(lines[i].equals(lines[i-1])){
                counter++;
            }else {
                maxCount = Math.max(maxCount,counter);
                    counter = 1;
            }

        }

        maxCount = Math.max(maxCount,counter);
        pw.println(maxCount);
        //generate output
        pw.close();


    }

}


