// Sum of 2 arrays
// Ramu have some number of Apples and he arrange that in a matrix format. Raju have some another number of Apples. He also wants to arrange that in a matrix format. Ragul wants to calculate the total number of apples. Help him to find out the total number of apples.
// Input Format:

// Input consists of 2n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the first array. The last 'n' integers correspond to the elements in the second array. Assume that the maximum value of n is 15.



// Output Format:

// Refer sample output for details.


import java.util.Scanner;

class Sum_of_2_arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int j;
        for (j = 0; j < n; j++) {
            arr[j] = arr1[j] + arr2[j];
            System.out.println(arr[j]);
        }
        // fill the code;
    }
}
