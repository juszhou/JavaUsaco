    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.util.Arrays;
    import java.util.Scanner;

    public class cowfind {
        static final String PROB_NAME = "cowfind";//instance variable
        public static void main(String argv[]) throws IOException {
            // take input from promote.in
            Scanner sc = new Scanner(new File(PROB_NAME + ".in"));
            String n = sc.next();
            int counter = 0,pairs = 0;
            for(int i = 0; i < n.length() -1 ; i++){
                if(n.substring(i,i+2).equals("((")){
                counter++;
                }
                if (n.substring(i,i+2).equals("))")){
                    pairs += counter;
                }
                }

            //generate output
            PrintWriter pw = new PrintWriter(new FileWriter(PROB_NAME + ".out"));
            pw.println(pairs);
            pw.close();


        }


    }

