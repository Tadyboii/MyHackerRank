import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        while (true) {
            try {
                if ((int) A.toLowerCase().charAt(i) > (int) B.toLowerCase().charAt(i)) {
                    System.out.println("Yes");
                    break;
                } else if ((int) A.toLowerCase().charAt(i) < (int) B.toLowerCase().charAt(i) || A.equalsIgnoreCase(B)) {
                    System.out.println("No");
                    break;
                } else {
                    i++;
                }
            }catch(StringIndexOutOfBoundsException e){
                if(A.length() > B.length()){
                    System.out.println("yes");
                }
                else{
                    System.out.println("No");
                }
                break;
            }
        }
        String first = A.replace(A.charAt(0), A.toUpperCase().charAt(0));
        String second = B.replace(B.charAt(0), B.toUpperCase().charAt(0));
        System.out.println(first + " " + second);
    }
}



