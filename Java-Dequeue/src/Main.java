import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> set = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        long biggest = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            if (set.containsKey(num)) {
                set.put(num, set.get(num) + 1);
            } else {
                set.put(num, 1);
            }
            if (deque.size() == m + 1) {
                int remove = deque.remove();
                if (set.get(remove) > 1) {
                    set.put(remove, set.get(remove) - 1);
                } else {
                    set.remove(remove);
                }
            }
            if (deque.size() == m) {
                biggest = Math.max(biggest, set.size());
            }
        }
        System.out.println(biggest);
    }
}



