import java.util.Random;

public class RandomChar {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0;i<5;i++)
        {
        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        System.out.println("Generated Random Character: " + randomizedCharacter);
        }
    }

}