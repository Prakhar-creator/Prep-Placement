import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int i,j,num;
		
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		
		for(i=num;i>=1;i--)
		{
		    for(j=1;j<=2*i-1;j++)
		    {
		        System.out.print(j+" ");
		    }
		    
		    System.out.print("\n");
		}
	}
}
/*
Sample Input:

4



Sample Output:

1 2 3 4 5 6 7

1 2 3 4 5

1 2 3

1
*/
import java.util.Scanner;
class A
{
    void test()
    {
        	Scanner s=new Scanner(System.in);
	     	int a1=s.nextInt();
	     	int i=0,j;
	     
	     	int c=0;
	     
    for(i=1;i<=a1;i++)
    {
      
       for(j=1;j<=i;j++)
        {  
            ++c;
            if(c%2==0)
            {
            System.out.print("1 ");
            }
            else
            {
                System.out.print("0 ");
            }
            
        }
        
        System.out.println(" ");
        
    }
    
 }
}
class Main
{
	public static void main(String args[])
	{
	
	A obj=new A();
	obj.test();
		  
		}

}
/*
Sample Input:

4



Sample Output:

1

0 1

1 0 1

0 1 0 1
*/
import java.util.Scanner;
class A
{
    void d()
    {
     	Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int i,j;
	    int z=1;
	    a=a*2;
	   for(i=1;i<=a;i=i+2)
	    {
         for(j=i;j<=a;j=j+2)
	     {
	        System.out.print(j+" ");
         }
	       System.out.println(" ");    
	    }
    }
}
class Main
{
	public static void main(String args[])
    {  
	 A c=new A();
	 c.d();
	}
}
/*
Sample Input:

5



Sample Output:

1 3 5 7 9

3 5 7 9

5 7 9

7 9

9
*/
import java.util.Scanner;
class A
{
    void d()
    {
Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int i,j,k;
	 
	  for(i=a;i>=1;i--)
	    {
	     
	    for(j=i;j<=a;j++)
	    {
	        System.out.print(j+"");
         
	    }
	    
	    for(k=1;k<=i-1;k++)
	      { 
	          System.out.print(a+"");
	    
	    }  
	    System.out.println("");

	    }
    }
}
class Main
{
	public static void main(String args[])
	{
	   
	 A c=new A();
	 c.d();
	}
}
/*
Sample Input:

5



Sample Output:

5 5 5 5 5

4 5 5 5 5

3 4 5 5 5

2 3 4 5 5

1 2 3 4 5
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
        int i,j,n,k=1;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
	}
}
/*
Sample Input:

4



Sample Output:

1

2 3

4 5 6

7 8 9 10
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
		    for(int j=1;j<=(2*i)-1;j++)
		    {
		        System.out.print(j+" ");
		    }
		    System.out.printf("\n");
		}
	}
}
/*
Sample Input:

4



Sample Output:

1 

1 2 3 

1 2 3 4 5 

1 2 3 4 5 6 7
*/
import java.util.Scanner;
class A
{
    void fun(int d)
    {
    int i, j, k, s;
    
    for (i=1; i<=d; i++)
    {
		for (j =1 ; j<=i; j++)
		{
		    if(j%2==0)
		    {
		        System.out.printf("0 ");
		    }
		    else
		    {
		        System.out.printf("1 ");
		    }
		
		}  
		System.out.printf("\n");
        
    }
}}
class Main
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		A obj=new A();
		obj.fun(d);
	}
}
/*
Sample Input:

5



Sample Output:

1 

1 0 

1 0 1 

1 0 1 0 

1 0 1 0 1
*/
import java.util.Scanner;
class A
{
    void fun(int d)
    {
    int i, j, k, s;
    
    for (i =1; i<=d; i++)
    {
		for (j =1 ; j <= d; j++)
		{
		    
		if(i==j || i+j==d+1)
		System.out.printf("*");
		else
		System.out.printf(" ");
		}
		System.out.printf("\n");
		}  
        
    }
}
class Main
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		A obj=new A();
		obj.fun(d);
	}
}
/*
Sample Input:

5



Sample Output:

*   *

 * * 

  *  

 * * 

*   *
*/
import java.util.Scanner;
class A
{
    void fun(int d)
    {
    int i, j, k, s;
    int a = 1;
    int b = d*d + 1;
    for (i = d; i >= 1; i--)
    {
		for (s = 0; s < d - i; s++)
		System.out.printf(" ");
		
		for (j = 0; j < i; j++)
		System.out.printf("%d*", a++);
		
		for (k = 0; k < i - 1; k++)
		System.out.printf("%d*", b++);
		
	System.out.printf("%d\n", b);			
		
		b -= 2*(i - 1);
  }  }
}
class Main
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		A obj=new A();
		obj.fun(d);
	}
}
/*
Sample Input:

4



Sample Output:

1*2*3*4*17*18*19*20

 5*6*7*14*15*16

  8*9*12*13

   10*11
   */
import java.util.Scanner;
class A
{
    void fun(int a)
    {
       for(int i=1;i<=a;i++)
	  {
		    for(int j=1;j<=a;j++)
		    {
		        if(i%2!=0 && j==a || i%2==0 && j==1)
		        {
		        System.out.print((i+1));
		        }
		        
		        else
		        {
		           System.out.print(i); 
		        }
		    }
		    System.out.printf("\n");
		} 
    }
}
class Main
{
	public static void main(String args[])
	{
	    	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		A obj=new A();
		obj.fun(a);
	}
}
/*
Sample Input:

4



Sample Output:

1112

3222

3334

5444
*/
