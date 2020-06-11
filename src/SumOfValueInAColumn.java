import java.util.Scanner;

public class SumOfValueInAColumn {
    public static void main(String[] args) {
        int row, column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        row = scanner.nextInt();
        System.out.println("Enter number of columns:");
        column = scanner.nextInt();
        double [][] matrix = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter value of element row " + i + " column " + j + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        int anyColumn;
        System.out.println("Enter column that u want to sum:");
        anyColumn = scanner.nextInt();

        double total = 0;
        for (int i = 0; i < row; i++) {
            total += matrix[i][anyColumn];
        }
        System.out.println("Sum for column " + anyColumn + " is " + total);
    }
}
