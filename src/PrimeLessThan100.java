public class PrimeLessThan100 {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100) {
            if (checkPrime(N)) {
                System.out.println(N);
            }
            N++;
        }
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