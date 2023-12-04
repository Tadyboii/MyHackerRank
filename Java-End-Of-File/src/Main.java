import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (input.hasNext()) {
            String s = input.nextLine();

            System.out.println((i) + " " + s);
            i++;
        }

    }
}