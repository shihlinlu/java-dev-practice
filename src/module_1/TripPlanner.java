package module_1;
import java.util.Scanner;
import java.lang.Math;

/**
 * Program that processes international trip information based on user input.
 * Module 1 assignment.
 */
public class TripPlanner {
    public static void main(String[] args) {
        Greeting();
        TimeAndBudget();
        TimeDifference();
        CountryArea();
        TravelDistance();
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
        /* handle minutes to string conversion to display in :mm format */
        String min = Integer.toString(minutes);
        min = min + "0";
        System.out.printf("That means that when it is midnight at home it will be %d:%s in your travel destination %n and when it is noon at home it will be %d:%s", midnightDiff, min, noonDiff, min);
        System.out.printf("%n ************");
    }

    public static void CountryArea() {
        Scanner countryArea = new Scanner(System.in);

        /* conversion from km2 to mi2 */
        double squareMiles = 0.3861;
        
        System.out.print("What is the square area of your destination country in km2?");
        double squareKm = countryArea.nextDouble();
        double miles2 = squareKm * squareMiles;
        System.out.printf("In miles2 that is %.2f", miles2);
        System.out.printf("%n ************");
    }

    /**
     * Calculate the distance between two points on a sphere utilizing the Haversine formula
     * Returns the distance between the home and travel destination.
     */
    public static void TravelDistance() {
        Scanner distance = new Scanner(System.in);

        System.out.print("What is the longitude of your home?");
        double long1 = distance.nextDouble();
        System.out.print("What is the latitude of your home?");
        double lat1 = distance.nextDouble();
        System.out.print("What is the longitude of your travel destination?");
        double long2 = distance.nextDouble();
        System.out.print("What is the latitude of your travel destination?");
        double lat2 = distance.nextDouble();

        final int R = 6371; // Earth's radius in km
        double longDist = Math.toRadians(long2 - long1);
        double latDist = Math.toRadians(lat2 - lat1);
        double a = Math.sin(latDist / 2) * Math.sin(latDist / 2) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.sin(longDist / 2) * Math.sin(longDist / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double dist = R * c;

        System.out.println();
        System.out.printf("The distance between your home and your travel destination is %f", dist);
        System.out.printf("%n ************");
    }

}
