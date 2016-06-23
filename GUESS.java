
import java.io.*;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.math.*;


public class GUESS
{
   
    private String vPlayerName;
    private int vNumber;
    private int vGuess;
    private int RandNum;
    

 
    public GUESS()
    {
      vPlayerName = "";
      vNumber = 0;
      vGuess = 0;
      vRandNum = 0;
      
     
    }
    
    
    public void display_message()
    {
      System.out.print("Welcome to the Random Number Game");  
       
    }
    
    
    public GUESS play_game()
    {	
        
        //3.1   	Display Menu
        System.out.println("Press enter to play and Q to quit");
        	//3.2   	If option is equal to play then
        IF <condition == true> THEN
         <action> 
          END IF
          //3.3               	Enter player name
        vPlayerName = JOptionPane.showInputDialog("Please enter your name: ");
        //3.4               	Generate random number
        Random rand = new RandNum();
        int  n = rand.nextInt(50) + 1
                                	//3.4.1	Computer generates a number between 1 and 50       	
        	//3.5               	While found equals false do
        	//3.6   	        	        	enter lucky guess from player
        	//3.7               	        	if guess equals random number then
        	//3.8                           	        	set found to true
        	//3.9               	        	else if guess is less than random number then
        	//3.10             	        	        	display a less than message
        	//3.11 	        	        	else
        	//3.12             	        	        	display a more than message
        	//3.13             	        	end if
        	//3.14 	        	end while
        	//3.15             	Display results
        	//3.16 	else
        	//3.17             	quit game
        //3.18 	end if
    }
    
    
            public void display_closing_message()
            {
                //4. 	Display closing message
                System.out.print("Thank you for playing the Random Number Game!");

        
      
           }

   
}
