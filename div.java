import java.util.*;

public class div {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        a = sc.nextInt();
        System.out.println("Enter Number: ");
        b = sc.nextInt();

        int c = a / b;
        System.out.println("Number\nA: " + a + "\nB: " + b + "\nC: " + c);
        sc.close();
    }
}
