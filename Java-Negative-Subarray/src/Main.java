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
        String list = input.nextLine();
        int[] arr = new int[n];
        String[] lists = list.split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(lists[i]);
        }
        int negCounter = 0;
        for (int x = n, i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                int sum = 0;
                for (int k = 0; k < x; k++) {
                    sum += arr[k + j];
                }
                if(sum < 0){
                    negCounter++;
                }
            }
            x--;
        }
        System.out.println(negCounter);
    }
}