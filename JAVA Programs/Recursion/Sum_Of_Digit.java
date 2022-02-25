

import java.util.Scanner;

class Sum_Of_Digit {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = sum(n);
        System.out.println("The sum of digits in " + n + " is " + sum);

    }

    public static int sum(int n) {

        if (n == 0)
            return 0;
        else
            return (n % 10 + sum(n / 10));

    }

}