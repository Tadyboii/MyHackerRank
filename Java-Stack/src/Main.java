import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.StringBuilder;

class Main {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            //Complete the code
            String input = sc.next();
            Stack<Character> line = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                line.push(input.charAt(i));
            }
            while (true) {
                try {
                    if (line.peek() == ')' && line.contains('(')) {
                        line.pop();
                        line.removeElementAt(line.lastIndexOf('('));
                    } else if (line.peek() == '}' && line.contains('{')) {
                        line.pop();
                        line.removeElementAt(line.lastIndexOf('{'));
                    } else if (line.peek() == ']' && line.contains('[')) {
                        line.pop();
                        line.removeElementAt(line.lastIndexOf('['));
                    } else {
                        break;
                    }
                } catch (EmptyStackException e) {
                    break;
                }
            }
            if(line.isEmpty()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}



