import java.util.*;

public class add {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int c = a + b;

        System.out.println("Number\nA: " + a + "\nB: " + b + "\nC: " + c);
        sc.close();
    }
}