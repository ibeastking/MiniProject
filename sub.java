import java.util.*;

public class sub {
    public static void main(String[] args) {
        String a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        a = sc.nextLine();
        System.out.println("Enter String: ");
        b = sc.nextLine();

        System.out.println("String\nA: " + a + "\nB: " + b + "C: " + a + b);
        sc.close();
    }
}
