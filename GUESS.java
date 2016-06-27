
import java.io.*;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.math.*;


public class GUESS
{
    private String vGameChoice;
    private String vPlayerName;
    private int vRandomNumber;
    private int vGuess;
    Random randomGenerator = new Random();
    private String vgameChoice;
    private int vRandNum;
    public GUESS()
    {
      vGameChoice = "";
      vPlayerName = "";
      vRandomNumber = 0;
      vGuess = 0;
      vgameChoice = "";
      vRandNum = 0;
    }
    
    
    public void display_message()
    {
      System.out.print("Welcome to the Random Number Game");  
       
    }
    
    
    public GUESS play_game()
    {   
        
        //3.1       Display Menu
        System.out.println("Press P to play and S to stop");
            
         vgameChoice = JOptionPane.showInputDialog("Enter choice now");
        //3.2       If option is equal to play then
       if(vgameChoice.equals("P")){
              vPlayerName = JOptionPane.showInputDialog("Please enter your name: ");      
             Random rand = new Random();
        int  n = rand.nextInt(50) + 1; 
         }
        //3.3                   Enter player name
        //3.4                   Generate random number
           //3.4.1 Computer generates a number between 1 and 50        
            //3.5                   While found equals false do
            
            ///3.6                               enter lucky guess from player
            vGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess"));
            while ((vGuess >=1) || (vGuess <= 50))
           { //3.7                               if guess equals random number then
            {
                if (<vGuess >= true> then
            <System.out.print("Correct!");>
            else if
        
            <vGuess = false> then
            <System.out.print("Incorrect!");>
            end if
            
        
            
       }

            
            
            
            }
            
            //3.8                                           set found to true
            //3.9                               else if guess is less than random number then
            //3.10                                      display a less than message
            //3.11                          else
            //3.12                                      display a more than message
            //3.13                          end if
            //3.14              end while
            //3.15              Display results
            //3.16  else
            //3.17              quit game
        //3.18  end if
    }
    
   public void display_closing_message()
   {
                //4. 	Display closing message
     System.out.print("Thank you for playing the Random Number Game!");

        
      
   }

   
}
