import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArray {
    public static void main(String[] args) throws IOException {
    ArrayList<String> a = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            a.add(scan.next());
        }
        int q = scan.nextInt();
        for(int i = 0; i < q; i++) {
            int count = 0;
            String s = scan.next();
            for(String str : a) {
                if(str.equals(s))
                    count++;
            }
            System.out.println(count);
        }
    }
}
