import java.util.*;
class multiple<T,V>
{
	T ob1;
	V ob2;
	multiple(T o,V o1)
	{
	     ob1=o;
	     ob2=o1;
	}
	T getob1()
	{
	     return ob1;
	}
	V getob2()
	{
	     return ob2;
	}
	void showType()
	{
	     System.out.println("Type of object1 is :"+ob1.getClass().getName());
	     System.out.println("Type of object2 is :"+ob2.getClass().getName());
	}
}

class MultiGen{
	public static void main(String args[])
	{
	       multiple<Integer, String> iob;
               multiple<Double, String> iob1;
	       Scanner sc = new Scanner(System.in);
	       int x,y;
	       String a,b,c,d;
               Double u,v;
               System.out.println("Enter the values for set1: ");
	       System.out.println("Enter an integer :");
	       y = sc.nextInt();
	       sc.nextLine();
	       System.out.println("Enter your name :");
	       b = sc.nextLine();
               System.out.println();
               System.out.println("Enter the values for set2: ");
               System.out.println("Enter any double :");
	       u = sc.nextDouble();
	       sc.nextLine();
	       System.out.println("Enter your name :");
	       c = sc.nextLine();
               iob = new multiple<Integer, String>(y,b);
	       iob1 = new multiple<Double, String>(u,c);
               x = iob.getob1();
               a = iob.getob2();
	       v = iob1.getob1();
	       d = iob1.getob2();
	       System.out.println("Value of first object in set1 is :"+x);
	       System.out.println("Value of second object in set1 is: "+a);
               System.out.println("Type of objects passed on in set1:");
               iob.showType();
               System.out.println();
	       System.out.println("Value of first object in set2 is :"+v);
	       System.out.println("Value of second object in set2 is: "+d);
               System.out.println("Type of objects passed on in set2:");
               iob1.showType();
	}
}