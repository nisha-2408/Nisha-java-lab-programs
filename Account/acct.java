import java.util.*;

class Account {
   String name;
   String acc;
   int type;
   double bal;

   void accept() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      name = sc.nextLine();
      System.out.println("Enter last 4 digits of your account: ");
      acc = sc.nextLine();
      System.out.println("Enter your account type: ");
      System.out.println("1.Savings");
      System.out.println("2.Current");
      type = sc.nextInt();
      System.out.println("Enter the money in your account: ");
      bal = sc.nextDouble();
      sc.close();
   }

   void display(Account ob, double n) {
      System.out.println("Details: ");
      System.out.println("NAME: " + ob.name);
      System.out.println("ACCOUNT NUMBER: " + ob.acc);
      if (ob.type == 1)
         System.out.println("ACCOUNT TYPE: Savings");
      else
         System.out.println("ACCOUNT TYPE: Current");
      System.out.println("AVAILABLE BALANCE: " + n);
   }
}

class CurrAcct extends Account {
   double withdraw(double n) {
      double x;
      Scanner sc = new Scanner(System.in);
      if (n < 500) {
         System.out.println("Your balance is below minimal balance");
         System.out.println("Service charge of Rs 100 is deducted");
         n = n - 100;
         System.out.println("Available balance: " + n);
      } else {
         System.out.println("Enter the amount you want to withdraw: ");
         x = sc.nextDouble();
         if (n < x) {
            System.out.println("You don't have sufficient balance.");
         } else if (n >= x) {
            n = n - x;
            System.out.println("Available balance: " + n);
         }
      }
      sc.close();
      return n;
   }

   double deposit(double n) {
      double amt;
      System.out.println("Enter the amount you want to deposit: ");
      Scanner sc = new Scanner(System.in);
      amt = sc.nextDouble();
      n = n + amt;
      System.out.println("Available balance: " + n);
      sc.close();
      return n;
   }
}

class SavAcct extends Account {
   double withdraw(double n) {
      double x;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the amount you want to withdraw: ");
      x = sc.nextDouble();
      if (n < x) {
         System.out.println("You don't have sufficient balance.");
      } else if (n >= x) {
         n = n - x;
         System.out.println("Available balance: " + n);
      }
      sc.close();
      return n;
   }

   double interest(double n) {
      int t;
      System.out.println("Interest Rate: 8%");
      System.out.println("Enter the number of years you want to claim interest: ");
      Scanner sc = new Scanner(System.in);
      t = sc.nextInt();
      n = n * Math.pow(1 + (0.08 / 12), 12 * t);
      System.out.println("Available balance: " + n);
      sc.close();
      return n;
   }

   double deposit(double n) {
      double amt;
      System.out.println("Enter the amount you want to deposit: ");
      Scanner sc = new Scanner(System.in);
      amt = sc.nextDouble();
      n = n + amt;
      System.out.println("Available balance: " + n);
      sc.close();
      return n;
   }
}

class Bank {
   public static void main(String args[]) {
      Account ob = new Account();
      ob.accept();
      Scanner i = new Scanner(System.in);
      if (ob.type == 1) {
         System.out.println("Cheque service not available.");
         SavAcct ob1 = new SavAcct();
         int opt;
         double n = ob.bal;
         do {
            System.out.println("Enter your option: ");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit money");
            System.out.println("3.Exit");
            opt = i.nextInt();
            switch (opt) {
               case 1:
                  n = ob1.withdraw(n);
                  break;
               case 2:
                  n = ob1.deposit(n);
                  n = ob1.interest(n);
                  break;
               case 3:
                  System.out.println("Exitting. . .");
                  break;
               default:
                  System.out.println("Invalid choice");
            }
         } while (opt != 3);
         ob1.display(ob, n);
      } else if (ob.type == 2) {
         System.out.println("Cheque service available.");
         CurrAcct ob2 = new CurrAcct();
         int opt;
         double z = ob.bal;
         do {
            System.out.println("Enter your option: ");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit money");
            System.out.println("3.Exit");
            opt = i.nextInt();
            switch (opt) {
               case 1:
                  z = ob2.withdraw(z);
                  break;
               case 2:
                  z = ob2.deposit(z);
                  break;
               case 3:
                  System.out.println("Exitting. . .");
                  break;
               default:
                  System.out.println("Invalid choice");
            }
         } while (opt != 3);
         ob2.display(ob, z);
      }
      i.close();
   }
}
