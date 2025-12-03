import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    private Image image1;

    public ImagePanel() {
        image1 = new ImageIcon("images/blastoisefront.png").getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image1, 0, 0, getWidth(), getHeight(), this);
    }
}
