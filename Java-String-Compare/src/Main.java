import java.util.Scanner;

public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        String[] list = new String[s.length() - k + 1];
        for (int i = 0; i <= s.length() - k; i++) {
            list[i] = s.substring(i, i + k);
        }
        String temp;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < list.length; j++) {
                for (int l = 1; l < list.length - j; l++) {
                    if ((int) list[l - 1].charAt(i) > (int) list[l].charAt(i) && i != 0 && list[l - 1].substring(0, i).equals(list[l].substring(0, i))) {
                        temp = list[l - 1];
                        list[l - 1] = list[l];
                        list[l] = temp;
                    } else if ((int) list[l - 1].charAt(i) > (int) list[l].charAt(i) && i == 0) {
                        temp = list[l - 1];
                        list[l - 1] = list[l];
                        list[l] = temp;
                    }
                }
            }
        }
        smallest = list[0];
        largest = list[list.length - 1];

        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}