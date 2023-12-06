import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar c = new GregorianCalendar(year, month-1, day);
        int w = c.get(Calendar.DAY_OF_WEEK);
        if(w==1)return "SUNDAY";
        else if(w==2)return "MONDAY";
        else if(w==3)return "TUESDAY";
        else if(w==4)return "WEDNESDAY";
        else if(w==5)return "THURSDAY";
        else if(w==6)return "FRIDAY";
        else if(w==7)return "SATURDAY";
        return "";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
