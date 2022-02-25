import java.util.Scanner;

class Fibonacci {
    static int fib(int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return (fib(n - 2) + fib(n - 1));

    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.printf("The term %d in the fibonacci series is %d", n, fib(n));
    }
    // fill your code;
}
