import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int i,nn=0;
	        for(i=1;i<=n;i++)
	        {
	            nn=i*i;
	            System.out.printf("%d ",nn );
	        }   
	}
}
/*
Sample Input:

7



Sample Output:

1 4 9 16 25 36 49 
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int q=s.nextInt();
	int i,j=5;
	int sum=6;
	for(i=1;i<=q;i++)
	{
	    System.out.print(sum+" ");
	    sum=sum+(i*j);
	}
	}
}
/*
Sample Input:

6



Sample Output:

6 11 21 36 56 81
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner r=new Scanner(System.in);
		int n=r.nextInt();
		int i;
		double mul=0;
		for(i=1;i<=n;i++)
		{
            mul=Math.pow(3,i);
	    	System.out.print((int)mul+" ");
	     }
	 }
}
/*
Sample Input:

6



Sample Output:

3 9 27 81 243 729
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		double p;
		for(i=0;i<n;i++)
		{
	    	p=(((Math.pow(3,i))*5)/10);   
	    	System.out.print(p+" ");
		}    
	}
}
/*
Sample Input:

5



Sample Output:

0.5 1.5 4.5 13.5 40.5
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		double p=11;
		for(i=0;i<n;i++)
        {
	    	System.out.printf("%d ",(int)Math.pow(p,2));
			p=p+4;  
		}
	}
	
}
/*
Sample Input:

4



Sample Output:

121 225 361 529
*/
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
  	int n=sc.nextInt();
	int i,sum;
	for(i=1;i<=n;i++)
    {
      if(i%2==0)
      {
        sum=(i*i)-2;
		System.out.printf("%d ",sum);
	  }
	  else
      {
		sum=(i*i)-1;
		System.out.printf("%d ",sum);
	  }
    }
 }
}
/*
Sample Input:

6



Sample Output:

0 2 8 14 24 34
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		float even=2;
		float odd=1;
		for(i=1;i<=n;i++)
		{
	    	if(i==1)
	    	{
	        	System.out.print("1 ");
	       		i++;
	    	}
	    	if(i%2==0)
	    	{
	        	System.out.print(even+" ");
	    		even=even*3;
	    	}
	    	else
	    	{
	        	odd=odd*3;
	        	System.out.print(odd+" ");
	    	}
		}    
	}
}
/*
Sample Input:

6



Sample Output:

1 2.0 3.0 6.0 9.0 18.0
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		double sum=4,i;
		for(i=0;i<d;i++)
		{
	    	sum=sum+Math.pow(i,2);
	    	System.out.print((int)sum+" ");
		}    
	}
}
/*
Sample Input:

6



Sample Output:

4 5 9 18 34 59
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{	
      	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int sum=2;
	    int i;
	    for(i=0;i<n;i++)
	    {
	        sum=sum+(13*i);
	        System.out.print(sum+" ");
	    }
	}
}
/*
Sample Input:

5



Sample Output:

2 15 41 80 132
*/
import java.util.Scanner;
class Test
{ 
   void disp()
    {
        int s=2, p=0,i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf(s+" ");
        for(i=2;i<=n;i++)
        {
            s=(s*s)-1;
            System.out.printf(s+" ");
        }
    }   
        
 }
public class Main
{
    public static void main(String args[])
	{
		Test obj=new Test();
		obj.disp();
	}
}
/*
Sample Input:

5



Sample Output:

2 3 8 63 3968
*/
import java.util.Scanner;
class Series
{
    float num=95.0f;
    void constructseries(int a)
    {   
        for(int i=0;i<a;i++)
        {
            System.out.printf("%.1f ",num);
            num=num+20.5f+(i*2);
        }
    }
}
public class Main
{
 public static void main(String args[])
 {
     Series s=new Series();
     Scanner sc =new Scanner(System.in);
     int n=sc.nextInt();
     s.constructseries(n);  
 }
}
/*
Sample Input:

5



Sample Output:

95.0 115.5 138.0 162.5 189.0
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int num=9;
		int sum=11;
		System.out.print(num+" "+sum+" ");
		for(int i=1;i<a-1;i++)
		{
		    int add=num+sum;
		    num=sum;
		    sum=add;
		    System.out.print(add+" ");
		}
	}
}
/*
Sample Input:

6



Sample Output:

9 11 20 31 51 82
*/
import java.util.Scanner;
class Series
{
    int num=5;
    int d=11,odd=1;
    void constructseries(int a)
    {
        
       
        for(int i=0;i<a;i++)
        {
            System.out.printf("%d ",num);
            num=num+d*odd;
            odd=odd+2;
        }
    }
}
public class Main
{
 public static void main(String args[])
 {
     Series s=new Series();
     Scanner sc =new Scanner(System.in);
     int n=sc.nextInt();
     s.constructseries(n);
     
 }
}
/*
Sample Input:

5



Sample Output:

5 16 49 104 181
*/
import java.util.Scanner;
class A
{
    void fun()
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i;
        int sum=5,t,f=2;
        for(i=1;i<=n;i++)
        {
            if(i==1)
            {
            System.out.print("2 ");
            }
            else
            {
                System.out.print(sum+" "); 
            t=(f*sum)+1;
            
            sum=t;
                
            }
            
        }
    }
}
class Main
{
	public static void main(String args[])
	{
		A g=new A();
		g.fun();
	
	}
}
/*
Input (stdin)
5

Output (stdout)
2 5 11 23 47
*/
import java.util.Scanner;
class A
{
    void fun()
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i;
        int sum=8,t,f=3;
        for(i=1;i<=n;i++)
        {
            if(i==1)
            {
            System.out.print("3 ");
            }
            else
            {
                System.out.print(sum+" "); 
            t=f+(sum+i);
            f=sum;
            sum=t;
                
            }
            
        }
    }
}
class Main
{
	public static void main(String args[])
	{
		A g=new A();
		g.fun();
	
	}
}
/*
Sample Input:

6



Sample Output:

3 8 13 24 41 70
*/
