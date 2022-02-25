import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println("Anagram");  
        } else {  
            System.out.println("Not an anagram");  
        }  
    }  
}
