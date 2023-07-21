import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Write your code here.
        String[]  n= s.split("[ !,?\\.\\_'@]+");    
        System.out.println(n.length);    
       StringTokenizer tokenizer = new StringTokenizer(s, "[ !,?\\.\\_'@]+ ");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}

