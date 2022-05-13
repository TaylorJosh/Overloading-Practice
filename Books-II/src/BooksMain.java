
import java.util.ArrayList;
import java.util.Scanner;

public class BooksMain {
  public static void main(String[] args) {
    ArrayList<Books> userBooks = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    userBooks.add(new Books("The Alchemist", 163 , 1988));
    userBooks.add(new Books("Push", 177 , 1996));
    userBooks.add(new Books("Fences", 145 , 1985));
    userBooks.add(new Books("The Show", 2020));
    userBooks.add(new Books("Sweet home California"));
    userBooks.add(new Books(1919));
    userBooks.add(new Books());


    while (true) {
      
      System.out.print("Please enter a book's title: ");
      String title = scanner.nextLine();
      if (title.isBlank())
        break;

      System.out.print("How many pages does " + title + " have?");
      int numOfPages = Integer.parseInt(scanner.nextLine());
      
      System.out.print("What year was " + title + " published?");
      int publicationYear = Integer.parseInt(scanner.nextLine());
      
      userBooks.add(new Books(title, numOfPages, publicationYear));
      

      System.out.println("\nEnter a blank title to quit.\n");
    }
       
        

          for (int i = 0; i < userBooks.size(); i++) 
          { 		      
              System.out.println(userBooks.get(i)); 		
	      }}}

