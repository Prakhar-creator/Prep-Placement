import java.util.Scanner;
class Max_ele {
     
    // function to return maximum element using recursion
    public static int findMaxRec(int A[], int n)
    {
      // if size = 0 means whole array
      // has been traversed
      if(n == 1)
        return A[0];
         
        return Math.max(A[n-1], findMaxRec(A, n-1));
    }
 
    // Driver code
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int A[] = new int[a];
        int n = A.length;
      	for(int i=0;i<n;i++){
          A[i] = sc.nextInt();
        }
         
        // Function calling
        System.out.println("Maximum element in the array is "+findMaxRec(A, n));
    }
}