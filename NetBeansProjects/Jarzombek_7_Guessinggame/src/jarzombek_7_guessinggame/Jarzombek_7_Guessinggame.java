/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarzombek_7_guessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author josephjarzombek
 */
public class Jarzombek_7_Guessinggame {
static String username;
static int yourguess;
static int magicnumber;
static Random randbo = new Random();
static boolean playmore = true;
static int counter = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    magicnumber = randbo.nextInt(100);
    System.out.println("Hello, would you like to play a game?");
    
    System.out.println("Whats your name?");
    Scanner userinputname = new Scanner(System.in);
    username = userinputname.nextLine();
    System.out.println("Hello " + username + " Let's play a game...");
    
    
    
    while (playmore == true){
        playgame();
        
    }
    
    
    }
    static void playgame(){
        Scanner userinputnumbers = new Scanner(System.in);
        System.out.println("Please pick a number");
        yourguess = userinputnumbers.nextInt();

        if (magicnumber == yourguess){
          System.out.println("Congradulations! " + username + ", you won using " + counter + " guesses.");
          playmore = false;
        }else if (magicnumber > yourguess){
             counter = counter+1;
            System.out.println("Too low, try again. You have " + (10 - counter) + " tries left." );
        }else{
             counter = counter+1;
            System.out.println("Too high, try again. You have " + (10 - counter) + " tries left." );
        }
        if (counter > 10){
            System.out.println("You lose, scrub. The right answer was " + magicnumber + ".");
            playmore = false;
    }
    }
}
