import java.util.*;

class Main {
  public static boolean validateRecipeWithQuantity(Map<String, Integer> ingredients, Map<String, Integer> fridge) {
    int count = 0; 
    boolean rslt;
    if (ingredients.size() == fridge.size()) {
      return rslt = ingredients.equals(fridge);

    } else {
      for (Map.Entry<String, Integer> pair1 : ingredients.entrySet()) {
        for (Map.Entry<String, Integer> pair2 : fridge.entrySet()) {
          if (pair1.getKey() == pair2.getKey() && pair1.getValue() == pair2.getValue()) {
            count++;
          }
        }
      } 
         if(count==ingredients.size()){
              rslt=true;
        }
        else{
          rslt=false;
        }

    }

    return rslt;
  }

  public static void main(String[] args) {
    Map<String, Integer> list = new HashMap<>();
    Map<String, Integer> food = new HashMap<>();

    list.put("tomato", 1);
    list.put("onion", 2);

    food.put("tomato", 1);
    food.put("onion", 1);

    System.out.println("Result of Validate Recipe with Quantity is " + validateRecipeWithQuantity(list, food));

    list.put("tomato", 2);
    list.put("onion", 3);
     
    food.put("tomato", 2);
    food.put("onion", 3);
    food.put("olives", 1);

    System.out.println("Result of Validate Recipe with Quantity is " + validateRecipeWithQuantity(list, food));

    

 
    }

  }
