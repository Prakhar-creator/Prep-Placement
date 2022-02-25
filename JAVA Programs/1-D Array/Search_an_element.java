// Search an element
// Arun's teacher gave him the following challenge. Help him solve it. "Given an array with 'n' elements by a user, you need to search if a particular element is present in the array or not. The element to be searched for is also given by the user"
// Input Format:

// Input consists of n+2 integers. 

// The first integer corresponds to ‘n’, the size of the array. 

// The next ‘n’ integers correspond to the elements in the array. 

// The last integer corresponds to ‘a’, the element to be searched.



// Output Format:

// Refer to sample output for details


import java.util.*;

class Search_an_element {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int i, found = 0;
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int ele = in.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == ele) {
                System.out.printf("%d is present in the array", ele);
                found = 1;
            }
        }
        if (found == 0)
            System.out.printf("%d is not present in the array", ele);
    }
}