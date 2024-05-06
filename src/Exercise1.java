import javax.swing.*;
import java.util.Scanner;

public class Exercise1 {

    public static void vatCalculator() {
        Scanner scanner = new Scanner(System.in);
        final double VAT = 1.17;


        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        double priceAfterVAT = price * VAT;
        System.out.println("Your price: " + price);
        System.out.println("Your priceAfterVAT: " + priceAfterVAT);

    }

    // 10.20   1.30   2.00
    public static void taxi() {
        Scanner scanner = new Scanner(System.in);

        final double START_FEE = 10.20;
        final double KM_FEE = 1.30;
        final double SUITCASE_FEE = 2.00;
        final int MAX_SUITCASE = 4;



        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
        System.out.println("Enter km: ");
        int km = scanner.nextInt();
        System.out.println("Enter num of suitcases: ");
        int numOfSuitcase = scanner.nextInt();

        System.out.println("km: " + km + ", numOfSuitcase: " + numOfSuitcase);

        if (numOfSuitcase <= MAX_SUITCASE) {
            double totalPrice = START_FEE + (KM_FEE * km) + (SUITCASE_FEE * numOfSuitcase);
            System.out.println("Your total price: " + totalPrice);
        } else {
            System.out.println("Too many suitcases");
        }
    }

    public static void GUI() {
        JOptionPane.showInternalMessageDialog(null, "My GUI App", "----", JOptionPane.WARNING_MESSAGE);

        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showInternalMessageDialog(null, "Hi " + name);


        String ageS = JOptionPane.showInputDialog("Enter your age:");
        int ageNum = Integer.parseInt(ageS);
        JOptionPane.showInternalMessageDialog(null, "Age " + ageNum);

    }

    public static void dateParser(String s) {
        int num = Integer.parseInt(s);
        int d = num / 1_000_000;
        int m = (num / 10_000) % 100;
        int y = num % 10000;

        System.out.println("data: " + s);
        System.out.println("d: " + d);
        System.out.println("m: " + m);
        System.out.println("y: " + y);

    }

    public static void time() {
        long time = System.currentTimeMillis();
        System.out.println("time: " + time);

        int i = 0;
        System.out.println("A i: " + i);
        System.out.println("B i: " + ++i);
        System.out.println("C i: " + i);
        System.out.println("D i: " + i++);
        System.out.println("E i: " + i);




    }
}
