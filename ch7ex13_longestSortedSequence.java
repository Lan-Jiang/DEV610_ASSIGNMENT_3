public class ch7ex13_longestSortedSequence {


    public static void main(String[] args) {
        int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};

        int result = longestSortedSequence(array);
        System.out.println("Longest sorted sequence length: " + result);
    }

    public static int longestSortedSequence(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        return maxLength;
    }




}
