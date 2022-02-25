// Compatible array
// Write a program to find whether 2 arrays are compatible or not. Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all the values of i.
// INPUT FORMAT:

// Input consists of 2n+1 integers. 

// The first integer corresponds to ‘n’, the size of the array. 

// The next ‘n’ integers correspond to the elements in the first array. 

// The last 'n' integers correspond to the elements in the second array. 

// Assume that the maximum value of n is 15.



// OUTPUT FORMAT:

// Refer sample output for details.

import java.util.*;

class Compatible {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int j;
        for (j = 0; j < n; j++) {
            if (arr1[j] < arr2[j]) {
                flag = false;
            }

        }
        if (flag == true) {
            System.out.println("Compatible");
        } else {
            System.out.println("Incompatible");
        }
    }
}