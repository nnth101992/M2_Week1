import java.util.Scanner;

public class DeleteElementOutOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 3, 6, 0};
        int input;
        System.out.print("Enter a number: ");
        input = sc.nextInt();

        arr = deleteElement(arr, input);
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

    public static int[] deleteElement(int[] array, int x) {
        int index;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                index = i;
                for (i = index; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                    break;
            }
//        if (isInTheArray) {
//            System.out.println("Invalid");
//        }
//        if (index == -1) {
//            //System.out.println("Invalid value!");
//            return array;
//        }
//        int[] newArray = new int[array.length - 1];
//        for (int i = 0; i < index; i++) {
//            newArray[i] = array[i];
//        }
//        for (int i = index + 1; i < newArray.length - 1; i++) {
//            newArray[i] = array[i + 1];
//        }
//        return newArray;

        }


        }
        return array;
    }
}