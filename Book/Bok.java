import java.util.*;

class Book {
   String name;
   String author;
   float price;
   int num_pages;

   Book() {
   }

   Book(String name, String author, float price, int num_pages) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.num_pages = num_pages;
   }

   void getdata() {
      Scanner i = new Scanner(System.in);
      System.out.println("Enter the title of the book:  ");
      name = i.nextLine();
      System.out.println("Enter the author of the book: ");
      author = i.nextLine();
      System.out.println("Enter the price of the book: ");
      price = i.nextFloat();
      System.out.println("Enter the no. of pages of the book: ");
      num_pages = i.nextInt();
   }

   public String toString() {
      System.out.println("Title: " + " " + name);
      System.out.println("Author Name: " + " " + author);
      System.out.println("No. of pages: " + " " + num_pages);
      System.out.println("Price of the Book:" + " " + price);
      return "0";
   }
}

class Bok {
   public static void main(String args[]) {
      int k;
      Book b1 = new Book("ABC", "XYZ", 123, 789);
      System.out.println("Constructor values: ");
      b1.toString();
      System.out.println("Enter the no. of books: ");
      Scanner sc = new Scanner(System.in);
      k = sc.nextInt();
      Book b[] = new Book[k];
      for (int x = 0; x < k; x++) {
         b[x] = new Book();
         System.out.println("Enter data of the book" + " " + (x + 1));
         b[x].getdata();
      }
      for (int x = 0; x < k; x++) {
         System.out.println("Entered data of the book" + " " + (x + 1) + " are");
         b[x].toString();
      }
      sc.close();
   }
}
