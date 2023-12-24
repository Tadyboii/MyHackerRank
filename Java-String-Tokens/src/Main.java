import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String[] res = s.trim().split("[ _,'?!.@]+");
        if (res.length == 1 && res[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(res.length);
        }
        for (String str : res) {
            System.out.println(str);
        }
    }
}

