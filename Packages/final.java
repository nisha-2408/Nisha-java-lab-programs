import SEE.externals;
import CIE.internals;
import CIE.students;
import java.util.*;
class fina
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,n;
System.out.println("Enter the number of students:");
n=sc.nextInt();
students s[]=new students[n];
internals cie[]=new internals[n];
externals see[]=new externals[n];
for(i=0;i<n;i++)
{
System.out.println("Enter the details of student"+" "+(i+1));
s[i]=new students();
cie[i]=new internals();
see[i]=new externals();
s[i].accept();
cie[i].get_marksc();
see[i].get_marks();
}
System.out.println("Student details:");
for(i=0;i<n;i++)
{
s[i].display();
System.out.println("Total marks="+(cie[i].sumc+see[i].sums));
}
}
}
