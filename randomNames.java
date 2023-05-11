import java.util.*;
import java.util.Random;

public class Main {
    static Random rand = new Random();
    static int randomNumber;
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static char[] charArray = alphabet.toCharArray();

    public static void main(String[] args) throws Exception {

        int numberOfNames = 100;
        int nameLength = 5; // You can modify the length of the generated names here

        for (int i = 0; i < numberOfNames; i++) {
            StringBuilder randomName = new StringBuilder();

            for (int j = 0; j < nameLength; j++) {
                randomNumber = rand.nextInt(charArray.length);
                randomName.append(charArray[randomNumber]);
            }

            System.out.println(randomName.toString());
        }
    }
}
