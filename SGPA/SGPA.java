import java.util.*;

class Student {
    String usn, name;
    int total = 0;
    double sgpa = 0;
    int credits[] = new int[5];
    int marks[] = new int[5];
    Scanner sc = new Scanner(System.in);

    void accept() {
        System.out.println("Enter the name of the student:");
        name = sc.nextLine();
        System.out.println("Enter the usn of the student:");
        usn = sc.nextLine();
        System.out.println("Enter the details of the student:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the credits of the subject:" + (i + 1));
            credits[i] = sc.nextInt();
            System.out.println("Enter the marks of the subject:" + (i + 1));
            marks[i] = sc.nextInt();
            calculate(credits[i], marks[i], i);
        }
    }

    void calculate(int credits, int marks, int m) {
        total = total + credits;
        if (marks <= 100 && marks >= 90) {
            sgpa = sgpa + (10 * credits);
        } else if (marks < 90 && marks >= 80) {
            sgpa = sgpa + (9 * credits);
        } else if (marks < 80 && marks >= 70) {
            sgpa = sgpa + (8 * credits);
        } else if (marks < 70 && marks >= 60) {
            sgpa = sgpa + (7 * credits);
        } else if (marks < 60 && marks >= 50) {
            sgpa = sgpa + (6 * credits);
        } else if (marks < 50 && marks >= 40) {
            sgpa = sgpa + (5 * credits);
        } else {
            System.out.println("Failed in subject:" + m);
        }
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("USN:" + usn);
        System.out.println("SGPA obtained:" + (sgpa / total));
    }
}

class SGPA {
    public static void main(String args[]) {
        Student s = new Student();
        s.accept();
        s.display();
    }
}