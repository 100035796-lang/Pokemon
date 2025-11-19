import javax.swing.*;
import java.awt.*;

public class PokemonSelector {

    public static void selectPokemon() {
        JFrame frame = new JFrame("Select Your Pokémon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 920);

        frame.add(new RectangleGridPanel());

        frame.setVisible(true);
    }
}


class RectangleGridPanel extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int barHeight = 60;
        g.setColor(new Color(60, 120, 200));   // Blue bar
        g.fillRect(0, 0, getWidth(), barHeight);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 28));
        g.drawString("Select Your Pokémon", 630, 40);

        int rows = 2;
        int cols = 4;

        int availableHeight = getHeight() - barHeight;
        int cellHeight = availableHeight / rows;
        int cellWidth = getWidth() / cols;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                int x = c * cellWidth;
                int y = barHeight + r * cellHeight;

                g.setColor(Color.BLACK);
                g.drawRect(x, y, cellWidth, cellHeight);

                g.setColor(new Color(180, 220, 255));
                g.fillRect(x + 1, y + 1, cellWidth - 2, cellHeight - 2);
            }
        }
    }
}
