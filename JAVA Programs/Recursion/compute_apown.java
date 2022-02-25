
import java.util.Scanner;

class compute_apown {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        long fact = fact(n, p);

        System.out.println("The value of " + n + " power " + p + " is " + fact);
    }

    public static long fact(int n, int p) {
        if (p == 1)
            return n;
        else
            return (n * fact(n, (p - 1)));
    }
}