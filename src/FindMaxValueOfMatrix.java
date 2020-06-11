import java.util.Scanner;

public class FindMaxValueOfMatrix {
    public static void main(String[] args) {
        int colValue, rowValue;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        colValue = sc.nextInt();
        System.out.print("Enter number of columns: ");
        rowValue = sc.nextInt();

        double[][] matrix1 = new double[rowValue][colValue];
        for (int k = 0; k < rowValue; k++) {
            for (int m = 0; m < colValue; m++) {
                System.out.print("Enter value of element: row" + k + " col" + m + " : ");
                matrix1[k][m] = sc.nextDouble();
            }
        }
        System.out.println(findMax(matrix1));
    }

    public static double findMax(double matrix[][]) {
        int maxRow = 0;
        int maxColumn = 0;
        double max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.println("The greatest value of array is " + max + " at row " + maxRow + " and column " + maxColumn);
        return + max;
    }
}
