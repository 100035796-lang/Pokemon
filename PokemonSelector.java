import javax.swing.*;

public class PokemonSelector {

    public static void selectPokemon() {
        JFrame frame = new JFrame("Select Your Pokémon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 920);

        RectangleGridPanel gridPanel = new RectangleGridPanel();
        frame.add(gridPanel);

        frame.setVisible(true);
    }
}
