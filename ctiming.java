import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ctiming {
    public static void main(String argv[]) throws IOException {
        // take input from promote.in
        Scanner sc = new Scanner(new File("ctiming.in"));
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = 0;
        int daytime = 0;
        int hourtime = 0;
        int minutetime = 0;


        if(d < 11){
        time = -1;
        }else if(d == 11 && h <11){
            time = -1;
        }else if(d == 11 && h == 11 && m < 11 ){
            time = -1;
        }else{
            daytime = (d - 11) * 24 * 60;
            hourtime = (h -11 ) * 60;
            minutetime = m -11;
            time = daytime+ hourtime+ minutetime;

        }
        //generate output
        PrintWriter pw = new PrintWriter(new FileWriter(("ctiming.out")));
        pw.println(time);
        pw.close();
    }
}
