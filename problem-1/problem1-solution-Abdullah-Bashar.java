import java.util.*;

class Main {
  public static boolean validateRecipe(String[] fridge, String[] ingredients) {

    int count = 0;
    for (int i = 0; i < ingredients.length; i++) {
      for (int j = 0; j < fridge.length; j++) {
        if (ingredients[i].equalsIgnoreCase(fridge[j])) {
          count++;
        }
      }
    }
    if (count == ingredients.length) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {

     String[] list1={"tomato", "onion", "lettuce"};
     String[] food1={"tomato", "banana", "apple", "onion", "cucumber"};
    System.out.println("Result of Validate Recipe "+ validateRecipe(food1,list1));
     String[] list2={"olives", "onion", "lettuce"};
     String[] food2={"onion" ,"banana","lettuce", "olives"};
      System.out.println("Result of Validate Recipe "+ validateRecipe(food2,list2));

     // checking if input was taken from command line arguments
     if (args.length > 0) {
      System.out.println("the ingredients content was taken from Reading input from command line arguments");
      System.out.println("Result of Validate Recipe "+ validateRecipe(food1,args);
     }
     // take input from key borad
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the ingredients content");
      for(int i =0 ; i<list1.length;i++)
          list1[i]=input.next();
      System.out.println("Enter the fridge content");
        for(int i =0 ; i<list1.length;i++)
             list1[i]=input.next();
        System.out.println("Result of Validate Recipe "+ validateRecipe(food1,list1));
         
      
  }
}