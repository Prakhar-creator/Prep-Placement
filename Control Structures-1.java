import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a=0,b=1;
       int c=a+b;
       while(n!=3)
       {
           a=b;
           b=c;
           c=a+b;
           n--;
       }
       System.out.println(c);
    }
}
/*
Sample Input:

7



Sample Output:

8
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,fact=1,x=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(fact<n)
    	{
        	x=x+1;
        	fact=fact*x;
    	}
		if(fact==n)
		{
    		System.out.println("Yes");
		}
    	else
		{
    		System.out.println("No");
		}
	}
}
/*
Sample Input:

6



Sample Output:

Yes
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0,c=1;
        System.out.printf("%d %d %d ",a,b,c);
        while(n!=3&&n>1)
        {
            int d=a+b+c;
            System.out.printf("%d ",d);
            a=b;
            b=c;
            c=d;
            n--;
        }
        
    }
}
/*
Sample Input:

5



Sample Output:

0 0 1 1 2
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int count=0;
       System.out.println(a);
       while(a!=1)
       {
           if(a%2==0){
               a=a/2;
               System.out.println(a);
               count++;
           }
           else
           {
               a=(3*a)+1;
               System.out.println(a);
               count++;
           }
       }
       System.out.println(count);
    }
}
/*
Sample Input:

5



Sample Output:

5

16

8

4

2

1

5
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       int a=scan.nextInt();
       if(a>99 && a<=999){
            a=a%100;
            a=a/10;
           if(a%3==0){
               System.out.printf("Trendy Number");
           }else
           System.out.printf("Not a Trendy Number");
       }else
       System.out.printf("Not a Trendy Number");
    }
}
/*
Sample Input:

791



Sample Output:

Trendy Number
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float mark=0;
        int count=0;
        int n=0;
        Scanner scan=new Scanner(System.in);
        //n=scan.nextInt();
        while(n>=0){
            if(count==3)
            {
                break;
            }
            n=scan.nextInt();
            if(n%2!=0 && n>=0)
            {
                ++mark;
                ++count;    
            }
          else if(n<0)
          {
              mark=(float)(mark-1);
           }
          else
           {
              mark=(float)(mark-0.5);
           }
               
        }
        System.out.printf("%.1f",mark);
        //System.out.println(count);   
    }
}
/*
Sample Input 1:

1

3

5



Sample Output 1:

3.0
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a<10)
        {
            int b=a*a;
            int c=a/10;
            int d=a%10;
            int e=c+d;
            if(a==e)
            {
                System.out.println("Kaprekar Number");
            }
            else
            {
            	System.out.println("Not a Kaprekar Number");
            }
        }
        else if(a>10 && a<100)
        {
            int b=a*a;
            int c=a%100;
            int d=a/100;
            int e=c+d;
            if(a==e)
            {
                System.out.println("Kaprekar Number");
            }
             else
            	System.out.println("Not a Kaprekar Number");
        }
        else if(a>100 && a<1000)
        {
            int b=a*a;
            int c=b%1000;
            int d=b/1000;
            int e=c+d;
            if(a==e)
            {
               	System.out.println("Kaprekar Number");
            }
            else
           		System.out.println("Not a Kaprekar Number");
        }
        
    }
}
/*
Sample Input:

9



Sample Output:

Kaprekar Number
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int sum=0,n,count=0;
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        while(sum<a){
            n=scan.nextInt();
            sum=sum+n;
            count++;
        }
        System.out.println("The number of turns is "+count);
    }
}
/*
Sample Input:

100

4

40

60



Sample Output 1:

The number of turns is 3
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int even=0,odd=0;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n!=0){
            int b=n%10;
            if(b%2==0){
                even=even+b;
            }else
            odd=odd+b;
            
            n=n/10;
        }
        if(even==odd){
            System.out.println("yes");
        }else
        System.out.println("No");
    }
}
/*
Sample Input:

143



Sample Output:

yes
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m,n,i,b,c,d,e,f,t;
        m=s.nextInt();
        n=s.nextInt();
        for(i=m;i<=n;i++)
        {
            t=i;
             b=i%10;
             c=i/10;
            d=b+c;
            e=b*c;
            f=d+e;
            if(f==t)
            {
                System.out.println(f);
            }
        }
    }
}
/*
Sample Input:

11

30



Sample Output:

19

29
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int i;
      int l=s.nextInt();
      int u=s.nextInt();
      for(i=l;i<=u;i++)
      {
          System.out.println(i);
      }
    }
}
/*
Sample Input :

4

10



Sample Output:

4

5

6

7

8

9

10
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=a;
       while(b<=a)
        {
            System.out.println(c);
            c--;
            b++;
        }
    }
}
/*
Sample Input :

10

4



Sample Output:

10

9

8

7

6

5

4
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[20];
        int n=s.nextInt();
        int count=0,i,count1=0;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
        if(a[i]>=0)
        {
            count++;
        }
        else
        {
          count1++;
        }
        }
        System.out.println("Number of positive numbers is "+count+" and the number of negative numbers is "+count1);
    	}
	
}
/*
Sample Input:

4

5

-2

-1

6



Sample Output:

Number of positive numbers entered is 2 and the sum is 1
*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=m;i++)
        {
            System.out.println(i+"*"+n+"="+n*i);
        }
    }
       
}
/*
Sample Input:

5

4



Sample Output:

The multiplication table of 5 is

1*5=5

2*5=10

3*5=15

4*5=20
*/
