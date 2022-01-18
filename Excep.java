import java.util.*;

class WrongAge extends Exception {
   public String toString() {
      {
         return "WrongAge['Age can't be less than 0']";
      }
   }
}

class Wrong extends Exception {
   public String toString() {
      {
         return "WrongAge['Son can't be older than Father']";
      }
   }
}

class Father {
   public int father_age;

   Father() {
   }

   Father(int age) throws WrongAge {
      if (age < 0) {
         System.out.println("Age of the Father is invalid.");
         throw new WrongAge();
      } else {
         father_age = age;
         System.out.println("***********************************");
         System.out.println("AGE OF THE FATHER IS " + father_age);
         System.out.println("***********************************");
      }
   }
}

class Son extends Father {
   public int son_age;

   Son(int ag, int m) throws WrongAge, Wrong {
      super(m);
      if (ag < 0) {
         System.out.println("Age of the son is invalid.");
         throw new WrongAge();
      } else if (ag >= super.father_age) {
         throw new Wrong();
      } else {
         son_age = ag;
         System.out.println("***********************************");
         System.out.println("AGE OF THE SON IS: " + son_age);
         System.out.println("***********************************");
      }
   }
}

class Excep{
   public static void main(String args[]) {
      int age, m;
      int cat = 0;
      Scanner s = new Scanner(System.in);
      do {
         System.out.println("Enter the age of the father: ");
         m = s.nextInt();
         System.out.println("Enter the age of the son: ");
         age = s.nextInt();
         cat = 0;
         try {
            Son s1 = new Son(age, m);
         } catch (WrongAge e) {
            System.out.println("Caught: " + e);
            cat = 1;
         } catch (Wrong e) {
            System.out.println("Caught: " + e);
            cat = 1;
         }
      } while (cat != 0);
      s.close();
   }
}
          
   
