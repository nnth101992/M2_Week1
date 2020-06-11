
import java.util.Scanner;

public class ShowFirstTwentyPrimes {
    public static void main(String[] args) {
        System.out.println("Enter numbers of prime that u want to print: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            if (checkPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
//        while (count < 20) {
//            for (int N = 2; count < 20; N++) {
//                boolean check = true;
//                for (int i = 2; i <= Math.sqrt(N); i++) {
//                    if (N % i == 0) {
//                        check = false;
//                        break;
//                    }
//                }
//                if (check) {
//                    System.out.println(N);
//                    count++;
//                }
//            }
//        }

    }

    public static boolean checkPrime(int x) {
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }


}
