import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(input.nextInt());
        }
        int q = input.nextInt();
        input.nextLine();
        while (q-- > 0) {
            String command = input.nextLine();
            if (command.equals("Insert")) {
                String[] x = input.nextLine().split(" ");
                list.add(Integer.parseInt(x[0]),Integer.parseInt(x[1]));
            } else if (command.equals("Delete")) {
                String x = input.nextLine();
                list.remove(Integer.parseInt(x));
            }
        }

        for(Integer integer: list){
            System.out.print(integer + " ");
        }

    }
}