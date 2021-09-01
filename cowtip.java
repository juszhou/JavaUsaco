import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class cowtip  {


    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("cowtip.in"));
        PrintWriter out = new PrintWriter(new FileWriter("cowtip.out"));
        int N = Integer.parseInt(f.readLine());
        int [] [] arr = new int[N][N];
        for(int i = 0; i <N; i++){
            String s = f.readLine();
            for(int j = 0; j  < N; j++){
                arr[i][j] = Integer.parseInt(s.substring(j,j+1));
            }

        }
        int mincount = 0;
        for(int o = N-1; o >= 0; o--){
            for(int c = N-1; c >= 0; c--){
                if(arr[o][c] == 1){
                    mincount++;
                    for( int flipso = 0; flipso <=o; flipso++){
                        for(int flipc = 0; flipc <= c; flipc++){
                            arr[flipso][flipc]  = 1 - arr[flipso][flipc];

                        }
                    }
                }
            }
        }
        out.println(mincount);
        out.close();
    }
}


