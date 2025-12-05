import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        
        List<String> originalPokemon = List.of(
            "Blastoise",
            "Charizard",
            "Machamp",
            "Venusaur",
            "Victreebel",
            "Wailord",
            "Arceus",
            "Rayquaza",
            "Cofagrigus",
            "Zekrom"
        );

        Scanner scanner = new Scanner(System.in);

        List<String> player1Team = new ArrayList<>();
        List<String> player2Team = new ArrayList<>();

        for (int p = 1; p <= 2; p++) {

            System.out.println("\n===== PLAYER " + p + " CHOOSE YOUR TEAM =====");

            List<String> availablePokemon = new ArrayList<>(originalPokemon);
            List<String> currentTeam = (p == 1) ? player1Team : player2Team;

            while (currentTeam.size() < 5) {

                System.out.println("\nChoose a Pokémon (" + (currentTeam.size() + 1) + "/5):");

                for (int i = 0; i < availablePokemon.size(); i++) {
                    System.out.println((i + 1) + ". " + availablePokemon.get(i));
                }

                System.out.print("Enter number: ");
                int choice = scanner.nextInt();

                if (choice < 1 || choice > availablePokemon.size()) {
                    System.out.println("Invalid choice! Try again.");
                    continue;
                }

                String selected = availablePokemon.remove(choice - 1);
                currentTeam.add(selected);

                System.out.println("You chose: " + selected);
            }

            System.out.println("\nPlayer " + p + " — FINAL TEAM:");
            for (String pok : currentTeam) {
                System.out.println("- " + pok);
            }
        }

        System.out.println("\n===== FINAL TEAMS =====");
        System.out.println("PLAYER 1:");
        player1Team.forEach(p -> System.out.println("- " + p));

        System.out.println("\nPLAYER 2:");
        player2Team.forEach(p -> System.out.println("- " + p));
    }
    
}
