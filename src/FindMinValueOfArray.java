import java.util.Scanner;

public class FindMinValueOfArray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = sc.nextInt();

        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value of " + (i+1) + " element: ");
            array[i] = sc.nextDouble();
        }
        System.out.println(findMin(array));
    }

    public static double findMin(double arr[]) {
        double min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        return min;
    }
}
