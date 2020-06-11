import java.util.Scanner;

public class ShowShapes {
    public static void main(String[] args) {
        int choice = 5;
        while (choice != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Draw the square");
            System.out.println("2. Draw the square triangle - bottom-left");
            System.out.println("3. Draw the square triangle - top-left");
            System.out.println("4. Draw the square triangle - bottom-right");
            System.out.println("5. Draw the square triangle - top-right");
            System.out.println("6. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 5; k >= i; k--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 1; i <= 9; i += 2) {
                        for (int j = 9; j > i; j -= 2) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}