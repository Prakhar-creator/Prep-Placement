/* 

class CountPrime {
    public int totalPrime(int s , int e){
        int count = 0;
        while(s<=e){
            int cnt = 0;
            for(int i =2 ; i<=s ;i++){
                if(s%i == 0){
                    cnt++;
                }
              
              }
            if(cnt==1){
                count++;
            
                  
            }
            s++;
        }
        return count;
    }
	
	// Write your totalPrime function here
}

*/