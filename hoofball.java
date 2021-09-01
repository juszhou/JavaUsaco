import javax.security.auth.login.AccountExpiredException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class hoofball {
    static final String PROB_NAME = "hoofball";//instance variable

    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int N = sc.nextInt();
        int [] arr = new int[N+1];
        int [] arr1 = new int[N+1];
        int [] arr2 = new int[N+1];


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        arr1[1] =2;
        arr2[2]++;
        for(int i = 2; i< N; i++){
            if(i == N || arr[i] - arr[i-1] <= arr[i+1] - arr[i]){
                arr1[i] = i-1;
                arr2[i-1] ++;
            }else{
                arr1[i] = i+1;
                arr2 [i+1] ++;
            }
        }
        int answer = 0;
        for(int i =1; i <= N; i++){
            if(arr2[i] == 0) answer++;
                    else if(arr2[i] == 1){
                        int cow = arr1[i];
                        if(arr2[cow]==1){
                            if(arr1[cow] == i){
                                answer++;
                                i++;
                            }
                        }
            }

        }


        //generate output
        pw.print(answer);
        pw.close();


    }

}


