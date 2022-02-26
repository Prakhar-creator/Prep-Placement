import java.util.Arrays;
import java.util.Scanner;
public class Main {
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int a[] = new int [size];
      int max = a[0];
      for(int i = 0; i<size; i++)
      {
          a[i] = s.nextInt();
      }

      for(int i=0; i<size; i++)
      {
        if(a[i] > max)
			{
				max = a[i];
			}
      }
      System.out.println("Maximum element in the array is " +max);
   }
}

/*6

2

5

1

7

4

2
Maximum element in the array is 7
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long fact = fact(n);
       
        System.out.println("The factorial of " + n + " is " + fact);
    }
    public static long fact(int n)
    {
        if (n >= 1)
            return n * fact(n- 1);
        else
            return 1;
    }        
}
//factorial of a number
