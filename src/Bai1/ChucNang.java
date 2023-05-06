package Bai1;

import java.util.Random;

public class ChucNang {
    private int value;

   public void roll() {
      Random rand = new Random();
      value = rand.nextInt(6) + 1;
   }

   public int getValue() {
      return value;
   }

   public static void main(String[] args) {
      ChucNang d = new ChucNang();
      d.roll();
      System.out.println("You rolled a " + d.getValue());
   }
}
