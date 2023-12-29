import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            String result = "";
            Pattern pattern = Pattern.compile("<([^<>]+)>\\s*[^<>]+\\s*<(/\\1)>");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                result = line.substring(matcher.start(), matcher.end());
                result = result.replaceAll("<" + Pattern.quote(matcher.group(1)) + ">\\s*", "");
                result = result.replaceAll("\\s*<" + Pattern.quote(matcher.group(2)) + ">", "");
                System.out.println(result);
            }
            if (result.isEmpty()) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}



