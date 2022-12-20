import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Main{
    public static void main(String[] args){
       Countdown timer = new Countdown();
       Scanner sc = new Scanner(System.in);
       boolean q1 = false;
       int score = 0;

    //Trivia question 1
    while (!q1){
        timer.count = 1;
        System.out.println("What is a Bombay Duck?");
        System.out.println("a) A type of fish");
        System.out.println("b) A type of curry");
        System.out.println("c) A type of duck");
        System.out.println("d) A basketball term");

        //Timer
        int x = timer.CountDown();
        String guess = sc.nextLine();

        //if else statement that prints out if they guessed the correct answer
        if (guess.equals("a")){
            //timer.count = 0;
            score += 1000;
            System.out.println("You got it correct "+ score);
            break; 
        }
        else{
            //timer.count = 0;
            System.out.println("You are incorrect");
            break; 
       }
    }

    //Trivia question 2
    while (!q1){
        //timer.count = 1;
        System.out.println("In New Zealand what is it illegal to fly in a hot air balloon with?");
        System.out.println("a) A dog");
        System.out.println("b) A bicycle");
        System.out.println("c) A violin");
        System.out.println("d) A rooster");
        //int y = timer.CountDown();
        String guess = sc.nextLine();
        if (guess.equals("d")){
            score += 1000;
            //timer.count = 0;
            System.out.println("You got it correct "+ score);
            break; 
        }
        else{
            //timer.count = 0;
            System.out.println("You are incorrect");
            break; 
       }
    }

    //Trivia question 3
    while (!q1){
        //timer.count = 1;
        System.out.println("In the Harry Potter book and film series, Professor Dumbledore’s name comes from the Old English word for what creature?");
        System.out.println("a) Owl");
        System.out.println("b) Elephant");
        System.out.println("c) Bumblebee");
        System.out.println("d) Unicorn");
        //int z = timer.CountDown();
        String guess = sc.nextLine();
        if (guess.equals("c")){
            score += 1000;
            //timer.count = 0;
            System.out.println("You got it correct "+ score);
            break; 
        }
        else{
            //timer.count = 0;
            System.out.println("You are incorrect");
            break; 
       }
    }

    //Trivia question 4
    while (!q1){
        //timer.count = 1;
        System.out.println("The world’s first game of ice hockey was played with a puck made from which material?");
        System.out.println("a) Stone");
        System.out.println("b) Cow manure");
        System.out.println("c) Wood");
        System.out.println("d) Ice");
        //int z = timer.CountDown();
        String guess = sc.nextLine();
        if (guess.equals("b")){
            score += 1000;
            //timer.count = 0;
            System.out.println("You got it correct "+ score);
            break; 
        }
        else{
            //timer.count = 0;
            System.out.println("You are incorrect");
            break; 
       }
    }

    //Trivia question 5
    while (!q1){
        //timer.count = 1;
        System.out.println("What are you afraid of if you are Syngenesophobic?");
        System.out.println("a) Syringes");
        System.out.println("b) Genetically modified crops");
        System.out.println("c) Relatives");
        System.out.println("d) Snakes");
        //int z = timer.CountDown();
        String guess = sc.nextLine();
        if (guess.equals("c")){
            score += 1000;
            //timer.count = 0;
            System.out.println("You got it correct "+ score);
            break; 
        }
        else{
            //timer.count = 0;
            System.out.println("You are incorrect");
            break; 
       }
    }

    //Final tally of points
    int bonus = timer.CountDown()*50;
    System.out.println("You earned "+score+" points and "+bonus+" bonus points.");
    }
}