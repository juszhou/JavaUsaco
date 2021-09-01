import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class cowsignal {
    static final String PROB_NAME = "cowsignal";//instance variable
    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int height = sc.nextInt();
        int width = sc.nextInt();
        int factor = sc.nextInt();
        int counter = 0;

        String[] signal = new String[height];
        for(int i = 0; i < signal.length; i++){
            signal[i] = sc.next();
        }


        for(String origline : signal){
            for(int i = 0; i < origline.length(); i++){

                        char a = origline.charAt(i);

                            for (int x = 0; x < factor; x++) {
                                pw.print(a);
                            }



                    }
                pw.println();



        }



        //generate output
        pw.close();


    }

    }


