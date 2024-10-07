package practice;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HeatMap extends JPanel {

    // Sample data
    double[][] data = {
        { 0.1, 0.5, 0.9 },
        { 0.4, 0.8, 0.6 },
        { 0.7, 0.3, 0.2 }
    };
    
    // Define the dimensions of each cell in the heatmap
    private static final int CELL_SIZE = 50;

    // Map a value between 0.0 and 1.0 to a color
    public Color getColor(double value) {
        if (value < 0.0 || value > 1.0) {
            throw new IllegalArgumentException("Value out of range");
        }
        // Blue (low) to red (high) gradient
        int r = (int) (255 * value);
        int g = 0;
        int b = (int) (255 * (1 - value));
        return new Color(r, g, b);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw each cell in the data array
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                // Map the data value to a color
                g.setColor(getColor(data[row][col]));

                // Draw the rectangle
                g.fillRect(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }

    public static void main(String[] args) {
        // Set up the JFrame
        JFrame frame = new JFrame("Heat Map");
        HeatMap heatMap = new HeatMap();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(heatMap);
        frame.setSize(300, 300); // Adjust size to your needs
        frame.setVisible(true);
    }
}
