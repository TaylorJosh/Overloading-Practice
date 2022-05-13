
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
  public static void main(String[] args) {
    ArrayList<Animal> userAnimals = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    userAnimals.add(new Animal("Rover"));
    userAnimals.add(new Animal(false));
    userAnimals.add(new Animal());




      while (true) {
        System.out.println("Please enter your pet's name: ");
        
        String name = scanner.nextLine();
        
          if (name.isBlank()){
          break;}

          System.out.print("\nIs " + name + " a dog? \nEnter yes or no: ");
         
          boolean isDog = scanner.nextLine().equalsIgnoreCase("yes");
          userAnimals.add(new Animal(name, isDog));
         
          System.out.println("\nEnter a blank name to quit.\n");}

          for (int i = 0; i < userAnimals.size();i++) 
          { 		      
              System.out.println(userAnimals.get(i)); 		
	      }}}

