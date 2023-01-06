import java.util.Random;

public class ServerNameGenerator {
    // Array of adjectives
    private static final String[] adjectives = {
            "dedicated",
            "loyal",
            "fast",
            "powerful",
            "strong",
            "quick",
            "gifted",
            "durable",
            "tactical",
            "smart",
            "spanked"
    };

    // Array of nouns
    private static final String[] nouns = {
            "llama",
            "dog",
            "moose",
            "coyote",
            "camel",
            "machine",
            "computer",
            "processor",
            "cloud",
            "mug",
            "monkey",
            "chicken"
    };

    // Returns a random element from a given array of strings
    private static String getRandomElement(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }

    public static void main(String[] args) {
        // Generate a random server name
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        String serverName = adjective + "-" + noun;

        // Display the generated name to the user
        System.out.println("Here is your server name: " + serverName);
    }
}
