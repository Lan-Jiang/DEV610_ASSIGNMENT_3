import java.util.Arrays;

public class ch7ex8_median {

    public static void main(String[] args) {
        int[] array1 = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int[] array2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};

        int median1 = median(array1);
        int median2 = median(array2);

        System.out.println("Median of array1: " + median1);
        System.out.println("Median of array2: " + median2);
    }

    public static int median(int[] array) {
        Arrays.sort(array);
        int middleIndex = array.length / 2;
        return array[middleIndex];
    }


}
