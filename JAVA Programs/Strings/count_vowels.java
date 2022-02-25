import java.util.Scanner;
class count_vowels
{
	public static void main(String args[])
	{
      Scanner sc =new Scanner(System.in);
      String s = sc.nextLine();
      String str = "aeiouAEIOU";
      int count=0;
      for(int i=0 ; i<s.length();i++){
        if(str.indexOf(s.charAt(i))!=-1){
          count++;
        }
		// fill your code
	}
      System.out.println(count);
}
}