 //Number Guessing game.
import java.util.Scanner;
class Guesser
{
    
    int guessNum;
    int guessingNumber()
    {
        System.out.println(" Guesser kindly guess the number");
        Scanner scan =new Scanner (System.in);
        guessNum = scan.nextInt();
        return guessNum;
    }
}
 class Player
 {
    int guessNum;
    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" payer ! kindly guess number");
        guessNum = scan.nextInt();
        return guessNum;
    }
 }
 class Umpire
 {
    int numFormGuesser;
    int numFormPlayer1;
    int numFormPlayer2;
    int numFormPlayer3;
    void collectNumFormGuesser()
    {
        Guesser g = new Guesser();
        numFormGuesser = g.guessingNumber();

    }
    void collectNumFormPlayers()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player(); 

        numFormPlayer1 =  p1.guessingNumber();
        numFormPlayer2 =  p2.guessingNumber();
        numFormPlayer3 =  p3.guessingNumber();
    }
    void compare()
    {
        if(numFormGuesser == numFormPlayer1)
        {
            if(numFormGuesser == numFormPlayer2 && numFormGuesser == numFormPlayer3)
            {
                System.out.println("All player won the game");
            }
            else if(numFormGuesser == numFormPlayer2)
            {
                System.out.println("player 1 and player2 won the game ");
            }
            else if(numFormGuesser == numFormPlayer3)
            {
                System.out.println(" player1 and player3 won the game");
            }
            else
            {
                 System.out.println(" player1 won the game");
            }     
        }
        else if(numFormGuesser == numFormPlayer2)
        {
            if(numFormGuesser == numFormPlayer3  ) 
             {

             System.out.println(" player2 and player 3won the game");
            }
            else 
            {
                System.out.println(" player2 won the game");
            }
        }
        else if( numFormGuesser == numFormPlayer3   )
        {
             System.out.println(" player3 won the game");
        }
        else
        {
             System.out.println(" sabhi game har gaye please restart the game");
        }
    }
 }

public class LaunchGame{
    public static void main(String []args)
{
    System.out.println("Start the game");
    Umpire u = new Umpire();
    u.collectNumFormGuesser();
    u.collectNumFormPlayers();
    u.compare();
}
}

