import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ch6ex12_stripHtmlTags {

    public static void main(String[] args)
        throws FileNotFoundException {
            Scanner input = new Scanner(new File("input.html"));
            stripHtmlTags(input);
    }


    public static void stripHtmlTags(Scanner scanner) {

        while(scanner.hasNextLine()) {
            String htmlLine = scanner.nextLine();

            boolean print = true;

            for(int i = 0; i < htmlLine.length(); i++) {
                if(htmlLine.charAt(i) == '<') {
                    print = false;
                } else if(htmlLine.charAt(i) == '>') {
                    print = true;
                } else if(print) {
                    System.out.print(htmlLine.charAt(i));
                }
            }

            System.out.println();
        }
    }

    // public static void stripHtmlTags(Scanner scanner) {
    //     while (scanner.hasNextLine()) {
    //         String line = scanner.nextLine();
    //         String strippedLine = line.replaceAll("<[^>]*>", "");
    //         System.out.println(strippedLine);
    //     }
    // }


}
