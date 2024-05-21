import java.util.Random;
import java.util.Scanner;

public class plusOne
{
    static int computerAnswer = 0;
    static int cAnswer = 0;
    static Random random = new Random();
    int x = 0;
    int level = 0;
    static int randomNumber;



    //
    public void setRandomNumberGenerator(int min, int max) 
    {
        randomNumber = random.nextInt(((max - min) + 1) + min);
    }

    public int getRandomNumber()
    {
        return randomNumber;
    }

    boolean isCorrect(int userAnswer, int computerAnswer) 
    {
        boolean result;
        if (computerAnswer == userAnswer) 
        {
            result = true;
        } 
        else 
        {
            result = false;
            System.out.println("end loop");
        }
        return result;
    }

    public static int getComputerAnswer(int computerAnswer, int randomNumber) 
    {
        return computerAnswer + randomNumber;
    }

    public void beginGame() 
    {
        try (Scanner player = new Scanner(System.in)) {
            int playerAnswer;

            do 
            {
                x++;
                setRandomNumberGenerator(1,9);
                System.out.println("+" + getRandomNumber());
                playerAnswer = player.nextInt();
                computerAnswer += randomNumber;
                setLevel();
            } 
            while (playerAnswer == computerAnswer);
        }
        System.out.println("level " + getLevel());
    }

    //
    public void setLevel()
    {
        level++;
    }

    //
    public int getLevel()
    {
        return level;
    }
}