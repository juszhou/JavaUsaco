import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class billboard2 {
    static int frontx1, frontx2, fronty1, fronty2;

    static final String PROB_NAME = "billboard";//instance variable
    public static void main(String argv[]) throws IOException {

        // take input from promote.in
        Scanner sc = new Scanner(new File("ok.in"));
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();



        frontx1 = sc.nextInt();
        fronty1 = sc.nextInt();
        frontx2 = sc.nextInt();
        fronty2 = sc.nextInt();
        // algorithm
        int counter = 0;
        if(withinFront(bx1, by1)) counter++;
        if(withinFront(bx1,by2)) counter++;
        if(withinFront(bx2,by1)) counter++;
        if(withinFront(bx2,by2)) counter++;

        int backarea = (bx2 - bx1) * (by2 - by1);
        int answer;
        if(counter <= 1){
            answer = backarea;
        }else {


            int left = Math.max(bx1, frontx1);
            int right = Math.min(bx2, frontx2);
            int bottom = Math.max(by1, fronty1);
            int top = Math.min(by2, fronty2);
            int overLAP = (right - left) * (top - bottom);
            answer = backarea - overLAP;
        }


        //generate output
        PrintWriter pw = new PrintWriter(new FileWriter("ok.out"));
        pw.println(answer);
        pw.close();


    }
    public static boolean withinFront(int x, int y){
        return x >= frontx1 && x <=frontx2 && x >= fronty1 && y <= fronty2;

    }

}
