public class ch7ex3_countInRange {

    public static void main(String[] args) {
        int[] array = {14, 1, 22, 17, 36, 7, -43, 5};
        int min = 4;
        int max = 17;

        int result = countInRange(array, min, max);
        System.out.println(result);
    }

    public static int countInRange(int[] array, int min, int max) {
        int count = 0;

        for (int num : array) {
            if (num >= min && num <= max) {
                count++;
            }
        }

        return count;
    }




}
