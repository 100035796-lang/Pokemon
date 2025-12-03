import javax.swing.*;
import java.awt.*;

public class RectangleGridPanel extends JPanel {

    private Image pokemonImage;

    public RectangleGridPanel() {
        pokemonImage = new ImageIcon("images/blastoisefront.png").getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int barHeight = 60;
        g.setColor(new Color(60, 120, 200));
        g.fillRect(0, 0, getWidth(), barHeight);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 28));
        g.drawString("Select Your Pokémon", 630, 40);

        int rows = 2;
        int cols = 4;
        int availableHeight = getHeight() - barHeight;
        int cellHeight = availableHeight / rows;
        int cellWidth = getWidth() / cols;

        // Draw the grid
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

        int imgX = 0 * cellWidth;
        int imgY = barHeight + 0 * cellHeight - 50;
        g.drawImage(pokemonImage, imgX, imgY, cellWidth, cellHeight, this);
        
        int imgX2 = 0 * cellWidth;
        int imgY2 = barHeight + 0 * cellHeight - 50;
        g.drawImage
    }
}
