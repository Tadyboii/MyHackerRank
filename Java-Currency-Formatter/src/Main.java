import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        if (payment >= 0 && payment <= 1000000000) {
            NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
            String us = usFormat.format(payment);
            NumberFormat indiaFormat = NumberFormat.getNumberInstance();
            indiaFormat.setMinimumFractionDigits(2);
            indiaFormat.setMaximumFractionDigits(2);
            String india = indiaFormat.format(payment);
            NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            String china = chinaFormat.format(payment);
            NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String france = franceFormat.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: Rs." + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }
}