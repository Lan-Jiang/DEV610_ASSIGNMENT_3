import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ch6ex4_countCoins {
    public static void main(String[] args)
        throws FileNotFoundException {
            Scanner input = new Scanner(new File("coins.txt"));
            countCoins(input);
    }

    public static void countCoins(Scanner scanner) {
        double totalCents = 0;

        while(scanner.hasNext()) {
            int amount = scanner.nextInt();
            String type = scanner.next().toLowerCase();

            if(type.equals("pennies")) {
                totalCents += amount;
            } else if(type.equals("nickels")) {
                totalCents += 5 * amount;
            } else if(type.equals("dimes")) {
                totalCents += 10 * amount;
            } else if(type.equals("quarters")) {
                totalCents += 25 * amount;
            }
    }

        System.out.println("Total money: $" +
        String.format("%.2f", totalCents / 100));

}

}
