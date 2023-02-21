package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the available genres
        System.out.println("Available genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (String genre : genres) {
            System.out.println(genre);
        }

        // Prompt the user to enter their name and favourite genre
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Choose your favourite genre: ");
        String genre = scanner.nextLine();

        // Check if the chosen genre is valid
        boolean validGenre = false;
        for (String availableGenre : genres) {
            if (availableGenre.equals(genre)) {
                validGenre = true;
                break;
            }
        }

        // Create the user profile and display a message
        if (validGenre) {
            UserProfile userProfile = new UserProfile(name, genre);
            System.out.println("User profile created for " + name + " with favourite genre " + genre);
        } else {
            System.out.println("Invalid genre choice");
        }
    }

}
