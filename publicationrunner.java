
package publication;
import java.util.Scanner;


public class publicationrunner {  
    
     public static void main(String[] args) {
         
         Scanner input = new Scanner( System.in);
         System.out.println("Enter title");
         String title=input.next();
         System.out.println("Enter price");
         int price=input.nextInt();
         System.out.println("Enter the page count");
         int pagecount=input.nextInt();
         System.out.println(" Enter the time duration");
         int time=input.nextInt();
         Book b=new Book(price,title,pagecount);
         Tape t=new Tape(title,price,time);
          b.display();
          t.display();
       
     }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
     }

