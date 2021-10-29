import java.util.Scanner; 
import java.io.IOException;
 

class Main {
  public static int whereIsMyFood(String[] fridge, String item) {

    for (int i = 0; i < fridge.length; i++){
      if (fridge[i].equalsIgnoreCase(item)){
                return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) throws Exception {

    String[] foods = { "mango", "apple", "banana", "pizza", "carrots" };
    String fruit = "banana";
    System.out.println("banana locate at index " + whereIsMyFood(foods, fruit));
    // checking if input was taken from command line arguments
    if (args.length > 0) {
      System.out.println("the fridge content was taken from reading input from command line arguments");
      System.out.println("banana locate at index " + whereIsMyFood(args, fruit));
    }
    // take input from key borad
     Scanner input = new Scanner(System.in);
    System.out.println("Reading input from command line arguments");
    for (int i = 0; i < foods.length; i++)
      foods[i] = input.next();

    System.out.println("banana locate at index " + whereIsMyFood(foods, fruit));

     

  }
}