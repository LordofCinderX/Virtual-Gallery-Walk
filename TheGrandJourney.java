import java.util.Scanner;

public class TheGrandJourney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Java Mad Libs Generator!");
        System.out.println("Please provide the following words:\n");

        // User inputs
        System.out.print("Enter a hero’s name: ");
        String name = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter a magical object (noun): ");
        String noun = input.nextLine();

        System.out.print("Enter a A verb ending in -ing: ");
        String verbing = input.nextLine();

        System.out.print("Enter a fantastical place: ");
        String place = input.nextLine();

        System.out.print("Enter a mythical creature (plural): ");
        String animal = input.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = input.nextLine();

        System.out.print("Enter a verb (past tense): ");
        String verbPast = input.nextLine();

        System.out.print("Enter a type of treasure: ");
        String treasure = input.nextLine();

        System.out.print("Enter an exclamation: ");
        String exclamation = input.nextLine();

        String story = "\nHere's your Grand Adventure:\n" +
            "Once upon a time, " + name + " set out on a " + adjective + " quest. Armed with only their trusty " + noun +
                ", they began " + verbing + " toward the mysterious land of " + place + ".\n" +
                "Along the way, they encountered a pack of " + animal + " that looked very " + adjective2 + ". After a fierce battle, " +
                name + " " + verbPast + " the creatures and claimed the legendary " + treasure + ".\n" +
                "\"" + exclamation + "!\" they exclaimed, knowing their grand journey was complete.";

        System.out.println(story);
        
        input.close();
    }
}