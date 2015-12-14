/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarzombek_7_interactivefiction;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author josephjarzombek
 */
public class Jarzombek_7_Interactivefiction {

    static int pollstandings = 250;
    static String make;
    static Random comment = new Random();
    static Random commentneg = new Random();
    static int talk;
    static int really = 0;
    static boolean speaking = false;
    static Random visit = new Random();
    static int place;
    static boolean being = false;
    static Random debate = new Random();
    static boolean roasting = false;
    static boolean chilling = false;
    static String hotfire;
    static String where;
    static String okay;
    static int weeks = 70;
    static int talkagain;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("You are Donald Trump running for president. "
                //#forthewin
                + " Your objective is to aquire and hold above a score of 500 in pollstandings."
                + " You start with a score of 250 and the campaign time is 70 weeks."
                + " At the end of the 70 weeks if your score is above 500 you are elected president, if not you are just a billionare."
                //#forthelose
                + ""
                + " Make America Great Again.");
        mainish();
    }

    static void speaksmind() {
        //#method1()
        if (really < 1) {
            talk = ((comment.nextInt(41) + 118) + (commentneg.nextInt(23) - 90));
        } else {
            talk = ((comment.nextInt(41) + 118) * 2 / 3 / really + (commentneg.nextInt(23) - 90) * 4 / 5);
        }
        //#enemyobject
        System.out.println("The people want to hear your opinion.");
        Scanner userinputname = new Scanner(System.in);
        hotfire = userinputname.nextLine();
        if (hotfire.contains("wom") || hotfire.contains("mex") || hotfire.contains("black") || hotfire.contains("jew")) {
            pollstandings = pollstandings + talk;
            System.out.println("Exquisit speech. Your pollstandings are now " + pollstandings + ".");
            really = really + 1;
        }
        weeks = weeks - 1;
        System.out.println(weeks + " weeks util the election.");
        speaking = false;
        mainish();
    }

    static void thevisit() {
        //#method2()
           if (really>0){
                   place = (visit.nextInt(100) - 50);
           }else{
               place = (visit.nextInt(50)*really*-1);
           }
        System.out.println("Who will you grace with your presence this week.");
           Scanner userinputplace = new Scanner(System.in);
           where = userinputplace.nextLine();
           if (where.contains("san")||where.contains("new")||where.contains("cali")){
               pollstandings = pollstandings + place;
               really = 0;
               System.out.println("Maybe next time you should go to a coservative city, somewhere with more class.");
           }else{
               pollstandings = pollstandings*100/99;
               System.out.println("Publicity is key to the election.");
           }
           weeks = weeks - 1;
           mainish();
    }

    static void sweethome() {
        //#method3()
    pollstandings = pollstandings*97/100;
    weeks = weeks - 1;
        System.out.println("Hey even God took a day off."
            + "Your pollstandings are now " + pollstandings + ". " + weeks + " left till election.");
        really=0;
        chilling = false;
        mainish();
    }

    static void turn() {
        //#method4()
        System.out.println("Hello Mr. Trump. How will you fix our country? Say an \"offensive\" comment,"
                //#Hero
                + " make a public appearance, or stay at home and build your fourtune.");
        Scanner userinputname = new Scanner(System.in);
        make = userinputname.nextLine();
        if (make.contains("say")) {
            speaking = true;
        } else {
            if (make.contains("make")) {
                being = true;
            } else {
                if (make.contains("stay")) {
                    chilling = true;
                }
            }
        }
    }

    static void mainish() {
        //#method5()
        while (speaking == false & being == false & chilling == false) {
            turn();
        }
        while (speaking == true) {
            speaksmind();
        }
        while (being == true) {
            thevisit();
        }
        while (chilling == true) {
            sweethome();
            //#while
        }
        if (weeks == 0){
            electionday();
        }
    }
    static void electionday(){
        if (pollstandings > 500){
            System.out.println("Congradulations, the public has made the correct decision for their country and has elected you president."
                    + " You won with " + pollstandings + " precent of the votes. /(Note based on 1000% voting rubric/)");
        //#win
        }else{
            System.out.println("Well the ignorant Liberals have decided to destroy their country, "
                    //#enegyobject
                    + "you only received " + pollstandings + " percent of the vote. /(Note based on 1000% voting rubric/)"
                    + "Better invest in a Swiss band.");
            //#forthelose
        }
        System.exit(0);
    }
}
