import java.util.Random;
import java.util.Scanner;

public class plusOne
{
    int computerAnswer = 0;
    boolean isCorrect;
    int playerInput = 0;
    static int cAnswer = 0;
    static Random random = new Random();
    Scanner input = new Scanner(System.in);
    int x = 0;
    int level = 0;
    int randomNumber;



    //
    public void setRandomNumberGenerator(int min, int max) 
    {
        this.randomNumber = random.nextInt(((max - min) + 1) + min);
    }

    //
    public int getRandomNumber()
    {
        return this.randomNumber;
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

    //
    public void setGameOutput()
    {
        System.out.println("+" + getRandomNumber());
    }

    //
    public int getPlayerInput()
    {
        this.playerInput = input.nextInt();
        return playerInput;
    }

    //
    public void setGame()
    {
        this.computerAnswer += getRandomNumber();
    }

    //
    public void setIsCorrect()
    {
        if (this.playerInput == this.computerAnswer) 
        {
            isCorrect = true;
        }
        else
        {
            isCorrect = false;
        }
    }

    public void beginGame() 
    {
        do 
        {
            setRandomNumberGenerator(1, 9);
            setGameOutput();
            getPlayerInput();
            setGame();
            setLevel();
        } 
            while (isCorrect = true);
        
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