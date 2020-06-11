import java.util.Scanner;
public class ChangeUsdToVnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD value: ");
        double vnd = 23000;
        double usd;
        usd = sc.nextDouble();
        double exchange = usd * 23000;
        System.out.println("VND equivalent: " + exchange);
    }
}
