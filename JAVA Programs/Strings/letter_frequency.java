import java.util.*;

class letter_frequency
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      
      char arr[] = str.toCharArray();
      Arrays.sort(arr);
      
      for(int i=0; i<arr.length; i++)
      {
        int count = 1;
        	for(int j=i+1; j<arr.length; j++)
            {
             	 if(arr[i]==arr[j])
                 {
                   count++;
                   arr[j]='0';
                 } 
            }
        if(arr[i]!='0')
        System.out.println(arr[i]+""+count);
      }
      
    }
}