import javax.security.auth.login.AccountExpiredException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class circlescross {
    static final String PROB_NAME = "circlecross";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        String a = sc.next();
        ArrayList<String> string = new ArrayList<>();
        for(int o =0; o < 50; o++){
            string.add(a.substring(o,o+2));
        }
            String b = "";
        int counter = 0;
        for(int i =0; i <51; i +=2){
            b = a.substring(i,i+2);
            if(a.contains(b)){

                counter++;
            }

        }
        pw.println(counter);


        //generate output
        pw.close();


    }

}


