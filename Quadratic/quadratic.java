import java.util.*;

class QuadRoot {
   public static void main(String args[]) {
      int a, b, c, res;
      float r1, r2, disc;
      System.out.println("Enter the values of a,band c :");
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      disc = (b * b) - (4 * a * c);
      if (disc > 0)
         res = 1;
      else if (disc < 0)
         res = -1;
      else
         res = 0;
      switch (res) {
         case 1:
            System.out.println("Roots are real.");
            r1 = ((-1 * b) + (float) (Math.sqrt(disc))) / (2 * a);
            r2 = ((-1 * b) - (float) (Math.sqrt(disc))) / (2 * a);
            System.out.println("Root1: " + r1 + " Root2: " + r2);
            break;
         case -1:
            System.out.println("Roots are imaginary.");
            float re1 = (-b) / (2 * a);
            disc = -1 * disc;
            r1 = ((float) Math.sqrt(disc)) / (2 * a);
            System.out.println("Roots are: " + re1 + "+i" + r1);
            System.out.println(re1 + "-i" + r1);
            break;
         case 0:
            System.out.println("Roots are equal.");
            r1 = r2 = (-b) / (2 * a);
            System.out.println("Roots are: " + r1 + "and" + r2);
            break;
      }
      sc.close();
   }
}