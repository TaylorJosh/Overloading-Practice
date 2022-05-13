
import java.util.ArrayList;
import java.util.Scanner;

public class TVShowMain {
  public static void main(String[] args) {
    ArrayList<TVShow> userTVShows = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    
    userTVShows.add(new TVShow("Martin", 65 , "Comedy"));
    userTVShows.add(new TVShow("Fresh Prince", 150));
    userTVShows.add(new TVShow("Wheel of Fortune", "Game Show"));
    userTVShows.add(new TVShow(1165 , "Reality TV"));
    userTVShows.add(new TVShow());
    userTVShows.add(new TVShow(99));
    userTVShows.add(new TVShow("Sports"));

    while (true) {
      
      System.out.print("Please enter a show's name: ");
      String name = scanner.nextLine();
      if (name.isBlank())
        break;

      System.out.print("How many episodes does " + name + " have?");
      int numOfEpisodes = Integer.parseInt(scanner.nextLine());
      
      System.out.print("What is " + name + "'s genre?");
      String genre = scanner.nextLine();
      
      userTVShows.add(new TVShow(name, numOfEpisodes, genre));
      

      System.out.println("\nEnter a blank name to quit.\n");
    }
       
        

          for (int i = 0; i < userTVShows.size(); i++) 
          { 		      
              System.out.println(userTVShows.get(i)); 		
	      }}}

