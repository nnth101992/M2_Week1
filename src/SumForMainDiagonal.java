import java.util.Scanner;

public class SumForMainDiagonal {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        size = scanner.nextInt();

        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter value of element row " + i + " column " + j + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of value in this matrix main diagonal is " +sum);
    }
}
