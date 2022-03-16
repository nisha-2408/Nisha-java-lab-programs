package CIE;

import java.util.*;

public class students {
    public String name;
    public String usn;
    public int sem;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        name = sc.nextLine();
        System.out.println("Enter the USN of the student:");
        usn = sc.nextLine();
        System.out.println("Enter the sem of the student:");
        sem = sc.nextInt();
    }

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("USN:" + usn);
        System.out.println("Sem:" + sem);
    }
}
