import java.util.*;
class Array_deletion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
          int arr1[]=new int[n-1];
        int pos,i,k;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        pos=sc.nextInt();
     
        for( i=0 , k=0 ;i<n;i++){
        if(i!=pos-1){
          arr1[k]= arr[i];
          k++;
        }
      }
      
      
      System.out.println("Array after deletion is");
      for(i=0;i<n-1;i++){
        System.out.println(arr1[i]);
      }
    }
}

