import java.util.*;

class Game {
    int index;
    int leap;
    int[] game;
    ArrayList<Integer> jumpHistory = new ArrayList<>();
    ArrayList<Integer> walkHistory = new ArrayList<>();


    public Game(int leap, int[] game) {
        index = 0;
        this.game = game;
        this.leap = leap;
    }

    public boolean canJump() {
        return game[index + leap] == 0 && !walkHistory.contains(index + leap);
    }

    public void jump() {
        walkHistory.add(index);
        jumpHistory.add(index);
        index = index + leap;
    }

    public void walk() {
        while (game[index + 1] == 0 && !walkHistory.contains(index + 1)) {
            index++;
        }
    }

    public boolean canBack() {
        try {
            return game[index - 1] == 0;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    public void stepBack() {
        walkHistory.add(index);
        index--;
    }

    public void goBackToLatestJump() {
        walkHistory.add(index);
        index = jumpHistory.get(jumpHistory.size() - 1);
        if (canBack()) {
            index--;
            jumpHistory.remove(jumpHistory.size()-1);
        } else {
            jumpHistory.remove(jumpHistory.size() - 1);
        }
    }
    public boolean stuckToZero(){
        return index == 0;
    }
}

public class Main {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false
        Game g = new Game(leap, game);

        while (true) {
            try {
                g.walk();
                if (g.canJump()) {
                    g.jump();
                } else {
                    if (g.canBack()) {
                        g.stepBack();
                    } else if (g.stuckToZero()) {
                        return false;
                    } else {
                        g.goBackToLatestJump();
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                return true;
            }
        }

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
