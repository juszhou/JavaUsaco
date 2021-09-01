import javax.security.auth.login.AccountExpiredException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class herding {
    static final String PROB_NAME = "herding";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int max =0, min = 0;
        int [] arr = new int[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] == arr[i+1] -1){
                min = 0;
                max = 0;
            }
        }

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i+1] - arr[i] == 2){
                min = 1;
            }else{
                min = 2;
            }

        }

        if(arr[1] - arr[0] > arr[2] - arr[1]){
            max = arr[1] - arr[0] -1;

        }else {
            max = arr[2] - arr[1] -1;
        }

        pw.println(min);
        pw.println(max);
        //generate output
        pw.close();


    }

}


