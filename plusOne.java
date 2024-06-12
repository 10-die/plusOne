import java.util.Random;
import java.util.Scanner;

public class plusOne
{
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    
    boolean isCorrect;

    int computerAnswer = 0;
    int playerInput = 0;
    int cAnswer = 0;
    int x = 0;
    int level = 0;
    int randomNumber = 0;
    int randomOperatorNumber = 0;
    int operator = 0;

    // save, random number
    public void setRandomNumber(int min, int max) 
    {
        this.randomNumber = random.nextInt(((max - min) + 1) + min);
    }
    // access, random number
    public int getRandomNumber()
    {
        return this.randomNumber;
    }

    // save, random number
    public void setRandomOperator(int min, int max) 
    {
        this.operator = random.nextInt(((max - min) + 1) + min);
    }
    // access, random number
    public int getRandomOperator()
    {
        return this.operator;
    }


    // savetate, computer prompt
    public void setComputerQuestion()
    {
        setRandomOperator(0, 1);
        if (getRandomOperator() == 0) 
        {
            System.out.println("+" + getRandomNumber());
        }
        else
        if(getRandomOperator() == 1)
        {
            System.out.println("-" + getRandomNumber());
        }
        /*
        else
        if(getRandomOperator() == 2)
        {
            System.out.println("x" + getRandomNumber());
        }
         */
    }

    // save, computer answer
    public void setComputerAnswer()
    {
        if (getRandomOperator() == 0) 
        {
            this.computerAnswer = this.computerAnswer + getRandomNumber();
            operator ++;
        }
        else
        if(getRandomOperator() == 1)
        {
            this.computerAnswer = this.computerAnswer - getRandomNumber();
            operator = 0;
        }
        /*
        else
        if(getRandomOperator() == 2)
        {
            this.computerAnswer = this.computerAnswer * getRandomNumber();
            operator = 0;
        }
    }
         */
    }
    // access, computer answer
    public int getComputerAnswer() 
    {
        return this.computerAnswer;
    }

    // save, player answer
    public void setPlayerAnswer()
    {
        this.playerInput = input.nextInt();
    }
    // access, player answer
    public int getPlayerAnswer()
    {
        return this.playerInput;
    }

    // save, current player level
    public void setLevel()
    {
        this.level++;
    }
    //
    public void gameOver()
    {
        System.out.println("GAME OVER, LEVEL " + getLevel());
    }
    // access, current player level
    public int getLevel()
    {
        return level;
    }

    // save, check player answer against computer answer
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

    // access, result of answer check
    public boolean getAnswer()
    {
        return isCorrect;
    }

    // save, game
    public void beginGame() 
    {
        do 
        {
            setRandomNumber(1, 33);
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