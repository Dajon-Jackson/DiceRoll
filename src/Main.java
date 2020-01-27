import java.awt.*;
import java.lang.reflect.Array;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    private static void p(String x) {
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        int choice = 0;
        Random d20 = new Random();
        p("1. Roll to see if you seduce the dragon");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        if (choice == 1)
            {
            int roll = d20.nextInt(20);
            if(roll == 1) {
                p("("+roll+") The dragon burns you to a crisp with its fiery breath.");
            }else if (roll >= 2 && roll <= 15){
                p("("+roll+") The dragon slashes at you, ready to fight.");
            }else if (roll >= 16 && roll <= 19){
                p("("+roll+") The dragon blushes and is persuaded to speak to hear you out.");
            }else if (roll >= 20){
                p("("+roll+") The dragon picks you up and chains you to the wall to keep you as its pet forever.");
            }
            }else p("INVALID");
        }
    }
