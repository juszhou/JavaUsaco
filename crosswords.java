import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class crosswords {


    public static void main(String[] args) throws IOException {
        Scanner f = new Scanner(new File("crosswords.in"));
        PrintWriter out = new PrintWriter(new FileWriter("crosswords.out"));
        int N = f.nextInt();
        int M = f.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        char [] [] arr = new char[N][M];
        for(int i = 0; i <N; i++) {
            String s = f.next();
            for (int j = 0; j < M; j++) {
                arr[i] = s.toCharArray();
            }
        }
        for(int r = 0; r < N; r++){
            for(int c = 0; c < M; c++){
                if(arr[r][c] == '#') {
                    continue;
                }
                if(c==0|| arr[r][c-1] == '#') {
                    if (c + 2 < M && arr[r][c + 1] == '.' && arr[r][c + 2] == '.') {
                        x.add(r);
                        y.add(c);
                        continue;
                    }
                }

                if((r==0|| arr[r-1][c] == '#') && (r +2 < N && arr[r+1][c] == '.' && arr[r+2][c] == '.')){
                    x.add(r);
                    y.add(c);
                }
            }
        }
        out.println(y.size());
        for(int c = 0; c< y.size(); c++){
            out.println((x.get(c)+1) + " " + (y.get(c) + 1));

        }

        out.close();
    }
}


