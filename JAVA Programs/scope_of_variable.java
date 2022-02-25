public class scope_of_variable {
  static int x = 10;
    public void display() {
        
    }

    public static void main(String args[]) {
        System.out.println(x);
    }
}


/* 1st program
public class Main {
   int x = 10;
    public void display() {
        
    }

    public static void main(String args[]) {
        System.out.println(x);
    }
}

//OUTPUT: ERROR X IS NOT A STATIC VARIABLE
*/

/** 2 program
  import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        int x;
        x = 10;
        {
            int y = 20;
            System.out.print(x + " " + y);
        }

        System.out.print(x + " " + y);
    }

}

//OUTPUT : Compile time error message
 */
