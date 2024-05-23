import java.util.Random;
import java.util.Scanner;

public class plusOne
{
    int computerAnswer = 0;
    boolean isCorrect;
    int playerInput = 0;
    int cAnswer = 0;
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    int x = 0;
    int level = 0;
    int randomNumber;

    // upload, random number
    public void setRandomNumber(int min, int max) 
    {
        this.randomNumber = random.nextInt(((max - min) + 1) + min);
    }
    // download, random number
    public int getRandomNumber()
    {
        return this.randomNumber;
    }
    

    // uploadtate, computer prompt
    public void setComputerQuestion()
    {
        System.out.println("+" + getRandomNumber());
    }

    // upload, computer answer
    public void setComputerAnswer()
    {
        int operator = 0;;
        if (operator == 0) 
        {
            this.computerAnswer = this.computerAnswer + getRandomNumber();
        }
        else
        if(operator == 1)
        {
            this.computerAnswer = this.computerAnswer - getRandomNumber();
        }
        else
        if(operator == 2)
        {

        }
        else
        {

        }
    }
    // download, computer answer
    public int getComputerAnswer() 
    {
        return this.computerAnswer;
    }

    // upload, player answer
    public void setPlayerAnswer()
    {
        this.playerInput = input.nextInt();
    }
    // download, player answer
    public int getPlayerAnswer()
    {
        return this.playerInput;
    }

    // upload, current player level
    public void setLevel()
    {
        this.level++;
    }
    //
    public void gameOver()
    {
        System.out.println("level " + getLevel());
    }
    // download, current player level
    public int getLevel()
    {
        return level;
    }

    // upload, check player answer against computer answer
    public void setAnswer()
    {
        if (getPlayerAnswer() == getComputerAnswer()) 
        {
            isCorrect = true;
        }
        else
        {
            isCorrect = false;
        }
    }

    // download, result of answer check
    public boolean getAnswer()
    {
        return isCorrect;
    }

    // upload, game
    public void beginGame() 
    {
        do 
        {
            setRandomNumber(1, 9);
            setComputerQuestion();
            setPlayerAnswer();
            setComputerAnswer();
            setLevel();
            setAnswer();
        } 
            while (getAnswer() == true);
            gameOver();
    }
}