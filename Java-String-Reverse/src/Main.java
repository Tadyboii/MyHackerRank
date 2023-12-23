import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n = A.length()-1;
        int i = 0;
        while(i < A.length()/2){
            if(A.charAt(i) != A.charAt(n)){
                System.out.println("No");
                return;
            }
            i++;
            n--;
        }
        System.out.println("Yes");
    }
}



