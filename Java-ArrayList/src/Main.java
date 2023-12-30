import javax.swing.*;
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
        input.nextLine();
        ArrayList<ArrayList<Integer>> rowArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = input.nextLine();
            String[] lineArr = line.split(" ");
            ArrayList<Integer> colArr = new ArrayList<>();
            for (int j = 0; j < Integer.parseInt(lineArr[0]); j++) {
                colArr.add(Integer.parseInt(lineArr[j + 1]));
            }
            rowArr.add(colArr);
        }

        int m = input.nextInt();
        input.nextLine();
        ArrayList<String> queryArr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String line = input.nextLine();
            String[] lineArr = line.split(" ");
            int x = Integer.parseInt(lineArr[0]);
            int y = Integer.parseInt(lineArr[1]);
            try {
                int value = rowArr.get(x - 1).get(y - 1);
                queryArr.add(Integer.toString(value));
            } catch (Exception e) {
                queryArr.add("ERROR!");
            }
        }

        for (String string : queryArr) {
            System.out.println(string);
        }
    }
}