import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;

public class ch6ex2_evenNumbers {

    public static void main(String[] args)
        throws FileNotFoundException {
            Scanner input = new Scanner(new File("numbers.txt"));
            evenNumbers(input);
    }

    public static void evenNumbers(Scanner scanner) {
        int totalCount = 0;
        int evenCount = 0;
        int totalSum = 0;

        while (scanner.hasNext()) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                totalSum += num;
                evenCount ++;
            } else {
                totalSum += num;
        }

        totalCount++;
    }
    double pct = (double)(evenCount * 100) / totalCount;

    System.out.println(totalCount + " numbers, sum = " + totalSum);
    System.out.println(evenCount + " evens: (" + String.format("%.2f", pct) + "%)");

}
    //1 check if list ends
    //2 check if even or odd
    //3 count, sum, even sum

}
