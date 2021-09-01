import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class baseball {
    static final String PROB_NAME = "baseball";//instance variable
    public static void main(String argv[]) throws IOException {
        // take input from promote.in
        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        int counter = 0;
        for(int j =0; j < n  ; j++){
            for(int i = j+1; i < n  ; i++){
               int  difference1 = arr[i] - arr[j];
                for(int a = i+1; a < n;a++){
                    int  diff2 = arr[a] - arr[i];
                    if(difference1 <= diff2 && diff2 <= (2 * difference1)){
                        counter++;
                    }else if(diff2 > (2 * difference1)){
                        break;
                    }
                }
            }
        }

        //generate output
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
        pw.println(counter);
        pw.close();


    }


    }

