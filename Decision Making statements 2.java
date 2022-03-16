import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      int t=sc.nextInt();
      if((t>=1&&t<=c)||((t%c)==0)||(((t-1)%c)==0)){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
}
/*
Sample Input:

5

5

11



Sample Output:

Yes
*/
import java.util.Scanner;
class Main
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    if(c==3||c==2||c==16||c==17||c==18||c==19||c==20||c==5||c==23||c==9||c==7)
    {
        System.out.println("yes");
    }
    else
    {
        System.out.println("No");
    }
}
}
/*
Sample Input:

5

5

15



Sample Output:

No
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int month=sc.nextInt();
      float rent=sc.nextInt();
      int days=sc.nextInt();
      float tariff;
      switch(month){
        case 4: case 5: case 6: case 11:   case 12:
          rent+=20*rent/100; tariff=rent*days;
           System.out.printf("%.2f",tariff);
          break; 
        case 1:  case 2:  case 3:  case 7:  case 8:  case 9:  case 10:
          tariff=rent*days; System.out.printf("%.2f",tariff);
          break;
        default:System.out.print("Invalid Input"); 
                    }
                    }
                    }
/*
Sample Input:

3

1500

2



Sample Output:

3000.00
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
 		Scanner sc=new Scanner(System.in);
 		float a=sc.nextFloat();
 		float b=sc.nextFloat();
 		float c= sc.nextFloat();
		if((a<c)||((a>c) && (b>1)))
    		System.out.println("No");
		else
    		System.out.println("Yes");
	}
}
/*
Sample Input:

59.99

1

60



Sample Output:

No
*/
import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int br = obj.nextInt();
int vs = obj.nextInt();
int as = obj.nextInt();
int a = obj.nextInt();
int l = obj.nextInt();
double total =(350.34*br)+(230.90*vs)+(190.55*as)+(125.30*a)+(180.90*l);
if(total<15000)
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

20

10

14

3

9



Sample Output:

Yes
*/
import java.util.Scanner;

class Main

{

public static void main(String args[])

{

 Scanner sc=new Scanner(System.in);

 String str1=sc.nextLine();

 int a=sc.nextInt();

 if(str1.equals("front" ))

 {

 if(a==1)

 System.out.println("Left Handed");

 else

 System.out.println("Right Handed");

 }

 else if(str1.equals("rear"))

 {

 if(a==1||a==2)

 System.out.println("Right Handed");

 else

 System.out.println("Left Handed");

 }

 else

 System.out.println("Nothing");

}

}
/*
Sample Input:

front

1



Sample Output:

Left Handed
*/
import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		int c=(int)(Math.sqrt(((x1-x2)*(x1-x2))+(y1-y2)*(y1-y2)));
		if(c==r1+r2)
    		System.out.println("Tangential");
		else if(c>r1+r2)
    		System.out.println("Do not overlap");
		else
    		System.out.println("Overlap");
	}
}
/*
Sample Input:

10

10

3

10

6

1



Sample Output:

Tangential
*/
import java.util.Scanner;
class Main {
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
      int wages=0,dailybonus=0,satbonus=0,sunbonus=0,workweekbonus=0;
      int d1=sc.nextInt(); //Sun
      int d2=sc.nextInt(); //Mon
      int d3=sc.nextInt(); //Tue
      int d4=sc.nextInt(); //Wed
      int d5=sc.nextInt(); //Thu
      int d6=sc.nextInt(); //Fri
      int d7=sc.nextInt(); //Sat
      int ww=d2+d3+d4+d5+d6-40;
      if(ww>0){
        workweekbonus=ww*25;
      }
      wages=(ww+40)*100;
      if(d2>8){
        dailybonus+=15*(d2-8);
      }
      if(d3>8){
        dailybonus+=15*(d3-8);
      }
      if(d4>8){
        dailybonus+=15*(d4-8);
      }
      if(d5>8){
        dailybonus+=15*(d5-8);
      }
      if(d6>8){
        dailybonus+=15*(d6-8);
      }
      satbonus+=d7*100;
      if(d7>8){
        satbonus+=(d7-8)*25;
      }
      satbonus*=1.25;
      sunbonus+=d1*100;
      if(d7>8){
        sunbonus+=(d1-8)*25;
      }
      sunbonus*=1.5;
      wages+=workweekbonus+satbonus+sunbonus+dailybonus;
      System.out.println(wages);
  }
}
/*
Sample Input:

0

8

8

8

10

6

0



Sample Output:

4030
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      float b=sc.nextFloat();
      if(a>=4){
        System.out.print("Number of items is more");
      }
      else if (a==2){
        float ht=(50*b/100)+b;
        System.out.printf("%.2f",ht);
      }
      else {
       float ht=2*b;
         System.out.printf("%.2f",ht);
      }    
	}
}
/*
Sample Input:

2

5.0



Sample Output:

7.50
*/
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      float b=sc.nextFloat();
     float t=13.30f;
if(b==t)
{
if(a>13)
System.out.println("$5.00");
else
System.out.println("$2.00");
}
else
{
if(a>13)
System.out.println("$8.00");
else
System.out.println("$4.00");
}
	}
}
/*
Sample Input:

16

10.15



Sample Output:

$8.00
*/
