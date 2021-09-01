import javax.security.auth.login.AccountExpiredException;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class triangles {
    static final String PROB_NAME = "triangles";//instance variable
    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));

        Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
        int N = sc.nextInt();
        int [] x = new int[N];
        int [] y = new int[N];
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        for(int centerV = 0; centerV < N; centerV++){
            for(int v1 = 0; v1<N; v1++){
                if(v1 == centerV) continue;
                for(int v2 = 0; v2 <N ; v2++){
                    if(x[centerV] == x[v1] && y[centerV] == y[v2]){
                        int width = Math.abs(x[centerV] - x[v2]);
                        int height = Math.abs(y[centerV] - y[v1]);
                        int area = width * height;
                        if(area > max)
                            max = area;
                    }

                }
            }
        }

        pw.println(max);







        //generate output
        pw.close();


    }

}


