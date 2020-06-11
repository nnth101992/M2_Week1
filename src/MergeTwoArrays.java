import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int length1, length2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of first array: ");
        length1 = sc.nextInt();
        int[] array1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.print("Enter " + (i + 1) + "th element of first array: ");
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter length of second array: ");
        length2 = sc.nextInt();
        int[] array2 = new int[length1];
        for (int j = 0; j < length2; j++) {
            System.out.print("Enter " + (j + 1) + "th element of second array: ");
            array2[j] = sc.nextInt();
        }

        int length3 = length1 + length2;
        int[] array3 = new int[length3];

        for (int k = 0; k < length1; k++) {
            array3[k] = array1[k];
        }
        for (int m = 0; m < length2; m++) {
            array3[length1+m] = array2[m];
        }
        for (int n = 0; n < length3; n++) {
            System.out.print(array3[n] + " ");
        }

    }
}
