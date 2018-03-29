package module_1;
import java.util.Scanner;

/**
 * Program that processes international trip information based on user input.
 */
public class TripPlanner {

    public static void main(String[] args) {
        Greeting();
        TimeAndBudget();
        TimeDifference();

    }

    public static void Greeting(){
        Scanner greeting = new Scanner(System.in);
        System.out.println("Welcome to the International Trip Planner!");
        System.out.print("What is your name?");
        String name = greeting.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to?");
        String destination = greeting.nextLine();
        System.out.println("Awesome! " + destination + "sounds like a great trip!");
        System.out.println("************");
        System.out.println();
    }

    public static void TimeAndBudget() {
        Scanner timeBudget = new Scanner(System.in);
        System.out.print("How many days are you gong to spend travelling?");
        int days = timeBudget.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        double budget = timeBudget.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination?");
        String currency = timeBudget.next();
        System.out.print("How many " + currency + " are there in 1 USD?");
        double conversionRate = timeBudget.nextDouble();
        System.out.println();

        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println("If you are travelling for " + days + " that is the same as " + hours + " hours or " + minutes + " minutes");
        double dailyBudget = budget / days;
        System.out.printf("If you are going to spend %.2f that means per day you can spend up to $ %.2f USD", budget, dailyBudget);
        double currencyBudget = conversionRate * budget;
        double currencyDailyBudget = currencyBudget / days;
        System.out.printf("%nYour total budget in %s is %.2f, which per day is %.2f %s", currency, currencyBudget,currencyDailyBudget, currency);
        System.out.printf("%n ************");
        System.out.println();
    }

    public static void TimeDifference(){
        Scanner timeDiff = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and destination?");
        int time = timeDiff.nextInt();
        int midnightDiff = time % 24;
        int noonDiff = (time + 12) % 24;
        int minutes = (time * 100) % 100;
        /* handle string conversion to display in :mm format */
        String min = Integer.toString(minutes);
        min = min + "0";
        System.out.printf("That means that when it is midnight at home it will be %d:%s in your travel destination %n and when it is noon at home it will be %d:%s", midnightDiff, min, noonDiff, min);
        System.out.printf("%n ************");
    }

}
