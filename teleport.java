
import java.util.*;
        import java.io.*;

public class teleport {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(new File("teleport.in"));

        // Don't teleport.
        int a = s.nextInt();
        int b = s.nextInt();
        int res = Math.abs(a-b);

        // Get teleport.
        int c = s.nextInt();
        int d = s.nextInt();

        // Teleport to a->c.
        res = Math.min(res, Math.abs(a-c)+Math.abs(d-b));

        // Teleport to a->d.
        res = Math.min(res, Math.abs(a-d)+Math.abs(c-b));

        // Ta da!
        PrintWriter pw = new PrintWriter(new FileWriter("teleport.out"));
        pw.println(res);
        pw.close();
    }
}