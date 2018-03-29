package module_1;
import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("Why are you here?");
        String reason = input.nextLine();
        System.out.println(name + " is " + age + " years old and believes he/she is here because " + reason);
    }
}
