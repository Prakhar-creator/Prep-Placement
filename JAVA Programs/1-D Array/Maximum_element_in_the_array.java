// // Maximum_element_in_the_array
// Maximum Element in an Array
// You are playing the PUBG game and you entered into the Bootcamp. There you viewed the drop box which was filled with guns. you have to choose the biggest gun in the drop box. Find the biggest gun and you will get the chicken dinner.
// Input Format:

// Input consists of n+1 integers.

// The first integer corresponds to ‘n’ , the size of the array.

// The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15.



// Output Format:

// Refer sample output for details.



// Sample Input 1:

// 5

// 2

// 3

// 6

// 8

// 1



// Sample Output 1:

// 8 is the maximum element in the array
import java.util.Scanner;
class Maximum_element_in_the_array
{
    public static void main(String args[])
    {
       try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for( int i = 0 ; i < n ; i++ )
            a[i] = sc.nextInt();
        int max = a[0];
        
        for( int i = 1; i < n ; i++ ){
            if( a[i] > max )
                max = a[i];
        }
        System.out.println(max+" is the maximum element in the array");
    }
    }
}