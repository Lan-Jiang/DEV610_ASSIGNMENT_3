import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ch6ex16_mostCommonNames {

    public static void main(String[] args)
        throws FileNotFoundException {
            Scanner input = new Scanner(new File("commonnames.txt"));
            mostCommonNames(input);
    }


    public static int mostCommonNames(Scanner scanner) {
        int target = 0;

        while(scanner.hasNextLine()) {
            Scanner line = new Scanner(scanner.nextLine());
            target++;
            int maxCount = 1;
            String maxName = line.next();
            int count = 1;
            String prevName = maxName;

            while(line.hasNext()) {
                String currentName = line.next();

                if(currentName.equals(prevName)) {
                    count++;
                } else {
                    if(count > maxCount) {
                        maxCount = count;
                        maxName = prevName;
                    }

                    target++;
                    count = 1;
                    prevName = currentName;
                    }
                }

                if(count > maxCount)
                    maxName = prevName;

                System.out.println("Most common: " + maxName);
       }

        return  target;
    }

}

