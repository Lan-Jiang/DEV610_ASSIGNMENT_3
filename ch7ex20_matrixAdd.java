public class ch7ex20_matrixAdd {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 15, 3}, {-7, 11, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};

        int[][] sumMatrix = matrixAdd(matrix1, matrix2);

        System.out.println("Matrix1:");
        printMatrix(matrix1);

        System.out.println("Matrix2:");
        printMatrix(matrix2);

        System.out.println("Sum Matrix:");
        printMatrix(sumMatrix);
    }

    public static int[][] matrixAdd(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] sumMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
