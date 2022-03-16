import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill the code;
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      if(x>y)
        System.out.println(x+" greater than "+y);
      else if(y>x)
         System.out.println(x+" less than "+y);
        else
         System.out.println(x+" and " +y+" are equal");
    }
}
/* 
Sample Input:

6

8



Sample Output:

6 less than 8
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
        System.out.print("Vowel");
      }
        else if ((ch>='a' && ch<='z') || (ch>='A'  && ch<='Z')) {
          System.out.print("Consonant"); }
        
      else {
        System.out.print("Not an alphabet");
      }
    }
}
/*
Sample Input:

e



Sample Output:

Vowel
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
     Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      if(a>=100) {
        System.out.print("S"); }
      else if (a>=90 && a<=99){
          System.out.print("A"); }
       else if (a>=80 && a<=89){
          System.out.print("B");}
       else if (a>=70 && a<=79){
          System.out.print("C");}
       else if (a>=60 && a<=69) {
          System.out.print("D");}
       else if (a>=50 && a<=59) {
          System.out.print("E"); }
      else if (a<50) {
         System.out.print("F"); }
      else {
         System.out.print("Invalid Input");
      }
              
    }
}
  /*
  Sample Input:

78



Sample Output:

C
*/
import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
float x=in.nextFloat();
float y=in.nextFloat();
float a=x/12;
if(a>y)
{
float p=x-(y*12);
System.out.printf("Loss : Rs."+"%.2f",p);
}
else if(a<y)
{
float p=x-(y*12);
System.out.printf("Profit : Rs."+"%.2f",p);
}
else
System.out.println("No profit nor loss");
}
}
/*
Sample Input:

60

4



Sample Output:

Loss : Rs.12.00
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        float tui=sc.nextInt();
        float bus=sc.nextInt();
        float hstl=sc.nextInt();
        if(str.equals("MSDS"))
        {
            System.out.printf("%.2f",(tui+bus));
        }
        else if(str.equals("MSH"))
        {
             System.out.printf("%.2f",(tui+hstl));
        }
         else if(str.equals("MGSDS"))
        {
             System.out.printf("%.2f",(1.5*tui+bus));
        }
         else if(str.equals("MGSH"))
        {
             System.out.printf("%.2f",(1.5*tui+hstl));
        }
      else {
        System.out.print("Invalid");
      }
    }
}
/*
Sample Input:

MSH

40000

12000

50000



Sample Output:

90000.00
*/
import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if(a>b)
{
System.out.println(b-a+100);
}
else
{
System.out.println(b-a);
}
}
}
/*
Sample Input:

62

00



Sample Output:

38
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
      if((x<y) && (x<z)) {
        System.out.print("L1"); }
      else if((y<x) && (y<z)) {
        System.out.print("L2");}
       else {
        System.out.print("L3");
       }
    }
}
/*
Sample Input:

30

40

20



Sample Output:

L3
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int[] l= new int[3];
      l[0]=sc.nextInt();
      l[1]=sc.nextInt();
      l[2]=sc.nextInt();
      String s=sc.next();
      int rmv=0;
      switch(s){
        case "L1":
          rmv=0;
          break;
        case "L2":
          rmv=1;
          break;
        case "L3":
          rmv=2;
               }
      if(rmv==0){
        if(l[1]<l[2]){
          System.out.println("L2");
        }
          else{
            System.out.println("L3");
          }
      }
      if(rmv==1){
        if(l[0]<l[2]){
          System.out.println("L1");
        }
          else{
            System.out.println("L3");
          }
      }
      if(rmv==2){
        if(l[0]<l[1]){
          System.out.println("L1");
        }
          else{
            System.out.println("L2");
          }
      }
    }
}
/*
Sample Input:

30

40

20

L3



Sample Output:

L1
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
      int stu=sc.nextInt();
      if((stu>x) && (stu<y) && (stu<z)) {
        System.out.print("1");}
      else if((stu>x) && (stu>y) && (stu<z)){
         System.out.print("2");}
      else if ((stu>x) && (stu>y) && (stu>z)){
        System.out.print("0");
      }  
      else {
         System.out.print("3");
      }
    }
}
/*
Sample Input:

30

40

20

25



Sample Output:

2 
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
        int l1,l2,l3,n;
        Scanner s=new Scanner(System.in);
        l1=s.nextInt();
        l2=s.nextInt();
        l3=s.nextInt();
        n=s.nextInt();
        if(n<l1&&n<l2&&n<l3)
        {
            if(l1<l2&&l1<l3)
            System.out.println("L1");
            else if(l2<l3)
            System.out.println("L2");
            else
            System.out.println("L3");
        }
        else if(n<l1&&n<l2)
        {
            if(l1<l2)
            System.out.println("L1");
            else
            System.out.println("L2");
        }
        else if(n<l1&&n<l3)
        {
            if(l1<l3)
            System.out.println("L1");
            else
            System.out.println("L3");
        }
        else if(n<l2&&n<l3)
        {
            if(l2<l3)
            System.out.println("L2");
            else
            System.out.println("L3");
        }
        else if(n<l1)
        System.out.println("L1");
        else if(n<l2)
        System.out.println("L2");
        else if(n<l3)
        System.out.println("L3");
        else
        System.out.println("0");
    }
}
/*
Sample Input:

30

40

20

25



Sample Output:

L1
*/


