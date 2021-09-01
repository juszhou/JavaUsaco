import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class moocrypt  {
    static char [][] puzzle;
    static int count (char m, char o) {
        int count = 0;
        for (int r = 0; r < puzzle.length ; r++) {
            for (int c = 0; c < puzzle[0].length; c++) {
                if (puzzle[r][c] != m) continue;
                if (c + 2 < puzzle[0].length && puzzle[r][c + 1] == o && puzzle[r][c + 2] == o) count++; //right
                if (c - 2 >= 0 && puzzle[r][c - 1] == o && puzzle[r][c - 2] == o) count++; //left
                if (r - 2 >= 0 && puzzle[r - 1][c] == o && puzzle[r - 2][c] == o) count++; //up
                if (r + 2 < puzzle.length && puzzle[r + 1][c] == o && puzzle[r + 2][c] == o) count++; //down
                if (r + 2 < puzzle.length && c + 2 < puzzle[0].length && puzzle[r + 1][c + 1] == o && puzzle[r + 2][c + 2] == o)
                    count++; //bottom right
                if (r - 2 >= 0 && c + 2 < puzzle[0].length && puzzle[r - 1][c + 1] == o && puzzle[r - 2][c + 2] == o)
                    count++; //top right
                if (r - 2 >= 0 && c - 2 >= 0 && puzzle[r - 1][c - 1] == o && puzzle[r - 2][c - 2] == o)
                    count++; //top left
                if (r + 2 < puzzle.length && c - 2 >= 0 && puzzle[r + 1][c - 1] == o && puzzle[r + 2][c - 2] == o)
                    count++; //bottom left
            }
        }
        return count;
    }


    public static void main(String[] args) throws IOException {
        Scanner f = new Scanner(new File("moocrypt.in"));
        PrintWriter out = new PrintWriter(new FileWriter("moocrypt.out"));
        int N = f.nextInt();
        int M = f.nextInt();
        puzzle = new char[N][M];
        for (int r = 0; r < N; r++) {
            String line = f.next();
            puzzle[r] = line.toCharArray(); //convert line to a char array
        }

        int max = Integer.MIN_VALUE;
        for (char m = 'A'; m <= 'Z'; m++) {
            if (m == 'M') continue;
            for (char o = 'A'; o <= 'Z'; o++) {
                if (o == 'O' || o == m) continue;
                int count = count(m, o);
                max = Math.max(count, max);
            }
        }
        out.println(max);
        out.close();
    }
    }


