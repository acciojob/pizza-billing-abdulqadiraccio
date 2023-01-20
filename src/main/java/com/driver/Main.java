package com.driver;

public class Main {
  public static void main(String[] args) {
   DeluxePizza dp = new DeluxePizza(true);
   // System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());
   System.out.println("Total Price: "+dp.getPrice());

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
   System.out.println("Total Price: "+p.getPrice());

  }
}