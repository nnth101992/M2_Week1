import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 2, 0, 3};
        int input;
        int pos;
        System.out.print("Enter a number: ");
        input = scanner.nextInt();
        System.out.print("Enter index of number: ");
        pos = scanner.nextInt();

        arr = addElement(arr, input, pos);
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        //System.out.println(Arrays.toString(arr2));
    }

    public static int[] addElement(int[] array, int x, int position) {
        if (position < 0 || position > array.length - 1) {
            System.out.println("Can't add this element to array!");
        } else {
            for (int i = 0; i < array.length; i++) {
                array[position] = x;
                if (position == i) {
                    int index;
                    for (index = array.length -1; index > i; index--) {
                        array[index] = array[index - 1];
                    }
                }
            }
        }
        return array;
    }
}


