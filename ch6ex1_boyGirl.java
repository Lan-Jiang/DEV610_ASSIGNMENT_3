import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;

public class ch6ex1_boyGirl {

    public static void main(String[] args)
        throws FileNotFoundException {
            Scanner input = new Scanner(new File("names.txt"));
            boyGirl(input);
    }

    public static void boyGirl(Scanner scanner) {
        int boysSum = 0;
        int girlsSum = 0;
        int boysCount = 0;
        int girlsCount = 0;
        int totalCount = 0;

        while (scanner.hasNext()) {
            String name = scanner.next();
            int age = scanner.nextInt();

            if (totalCount % 2 == 0) {
                boysSum += age;
                boysCount++;
            } else {
                girlsSum += age;
                girlsCount++;
            }

            totalCount++;

        }

        int diff = Math.abs(boysSum - girlsSum);

        System.out.println(boysCount + " boys, " + girlsCount + " girls");
        System.out.println("Difference between boys\u2019 and girls\u2019 sums: " + diff);
    }

}

        // 1. if the list end?
        // 2. if not end, check if %2 = 0 or 1
        // 3. add up based on result
        // 4. compare sum difference
