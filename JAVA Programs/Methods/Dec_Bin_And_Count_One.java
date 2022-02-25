/* 1st Methods

public class Solution {
	public static int countSetBits(int n) {
        String bin ="";
        while(n!=0){
            int sh= n%2;
            String s=Integer.toString(sh);
            bin = bin.concat(s);
            n = n/2;
        }
        
        int count = 0;
        for(int i=0 ; i<bin.length();i++){
            if(bin.charAt(i) == '1'){
                count++;
            }
        }
        return count;
        
		// Write your code here.
	}
}

*/


/* 2nd Methods

int countBits(int n){
    if(n == 0)
        return 0;
    else
        return (n & 1) + countBits(n>>1);
}

*/



/* 3rd Methods

public class Solution {

public static int countSetBits(int n) {

// Write your code here.

      int count = 0;

      while(n>0){

          if (n % 2 == 1) count++;

          n /= 2;

      }

      return count;

}

}

*/