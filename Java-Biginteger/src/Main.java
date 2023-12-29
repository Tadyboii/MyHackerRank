import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        input.close();
        System.out.println(new BigInteger(a).add(new BigInteger(b)));
        System.out.println(new BigInteger(a).multiply(new BigInteger(b)));

    }
}