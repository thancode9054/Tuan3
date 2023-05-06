package Bai1;
import java.util.Random;

/**
 * bai1
 */
public class ThuTuc {
    public static void main(String[] args) {
        Random rand = new Random();
        int rollResult = rand.nextInt(6) + 1;
        System.out.println("You rolled a " + rollResult);
     }
    
}