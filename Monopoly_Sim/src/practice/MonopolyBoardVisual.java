package practice;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MonopolyBoardVisual extends JPanel {

    // Define constants for the board layout
    private static final int BOARD_WIDTH = 650;  // Total width of the board (in pixels)
    private static final int BOARD_HEIGHT = 600; // Total height of the board (in pixels)
    
    // Dimensions for square corner spaces
    private static final int CORNER_SIZE = 100; // Size of the corner spaces (width and height)
    
    // Adjusted space sizes for horizontal and vertical spaces
    private static final int HORIZONTAL_SPACE_WIDTH = (BOARD_WIDTH - 2 * CORNER_SIZE) / 7; // Width of each space on top/bottom row
    private static final int HORIZONTAL_SPACE_HEIGHT = CORNER_SIZE; // Height of each space on top/bottom row
    
    private static final int VERTICAL_SPACE_WIDTH = CORNER_SIZE;    // Width of each space on left/right column
    private static final int VERTICAL_SPACE_HEIGHT = (BOARD_HEIGHT - 2 * CORNER_SIZE) / 7; // Height of each space on left/right column

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    
        // Calculate the x and y offsets to center the board
        int xOffset = (getWidth() - BOARD_WIDTH) / 2;
        int yOffset = (getHeight() - BOARD_HEIGHT) / 2;
    
        // Adjust the vertical space height to match the horizontal space width
        int adjustedVerticalSpaceHeight = HORIZONTAL_SPACE_WIDTH;
    
        // Adjust the height of the entire board to account for the taller vertical spaces
        int adjustedBoardHeight = CORNER_SIZE + adjustedVerticalSpaceHeight * 7 + CORNER_SIZE;
    
        // Draw the top and bottom rows (horizontal spaces)
        for (int i = 1; i < 8; i++) {
            // Top row (wider horizontal spaces, excluding corners)
            g.drawRect(xOffset + CORNER_SIZE + (i - 1) * HORIZONTAL_SPACE_WIDTH, yOffset, HORIZONTAL_SPACE_WIDTH, HORIZONTAL_SPACE_HEIGHT);
    
            // Bottom row (wider horizontal spaces, excluding corners) moved down
            g.drawRect(xOffset + CORNER_SIZE + (i - 1) * HORIZONTAL_SPACE_WIDTH, yOffset + adjustedBoardHeight - HORIZONTAL_SPACE_HEIGHT, HORIZONTAL_SPACE_WIDTH, HORIZONTAL_SPACE_HEIGHT);
        }
    
        // Draw the left and right columns (vertical spaces)
        for (int i = 1; i < 8; i++) {
            // Left column (taller vertical spaces)
            g.drawRect(xOffset, yOffset + CORNER_SIZE + (i - 1) * adjustedVerticalSpaceHeight, VERTICAL_SPACE_WIDTH, adjustedVerticalSpaceHeight);
    
            // Right column (taller vertical spaces)
            g.drawRect(xOffset + BOARD_WIDTH - VERTICAL_SPACE_WIDTH, yOffset + CORNER_SIZE + (i - 1) * adjustedVerticalSpaceHeight, VERTICAL_SPACE_WIDTH, adjustedVerticalSpaceHeight);
        }
    
        // Draw the four corner squares
        g.drawRect(xOffset, yOffset, CORNER_SIZE, CORNER_SIZE); // Top-left corner
        g.drawRect(xOffset + BOARD_WIDTH - CORNER_SIZE, yOffset, CORNER_SIZE, CORNER_SIZE); // Top-right corner
        g.drawRect(xOffset, yOffset + adjustedBoardHeight - CORNER_SIZE, CORNER_SIZE, CORNER_SIZE); // Bottom-left corner
        g.drawRect(xOffset + BOARD_WIDTH - CORNER_SIZE, yOffset + adjustedBoardHeight - CORNER_SIZE, CORNER_SIZE, CORNER_SIZE); // Bottom-right corner

        g.setFont(g.getFont().deriveFont(16f)); // Increase font size for better visibility

        // Draw the labels on top of the spaces
        for (int i = 1; i < 8; i++) {
            // Labels for top row
            g.drawString("Top " + i, xOffset + CORNER_SIZE + (i - 1) * HORIZONTAL_SPACE_WIDTH + 10, yOffset + 25);
            // Labels for bottom row
            g.drawString("Bottom " + i, xOffset + CORNER_SIZE + (i - 1) * HORIZONTAL_SPACE_WIDTH + 10, yOffset + adjustedBoardHeight - 10);
        }

        // Draw the left and right column labels
        for (int i = 1; i < 8; i++) {
            g.drawString("Left " + i, xOffset + 10, yOffset + CORNER_SIZE + (i - 1) * adjustedVerticalSpaceHeight + 25);
            g.drawString("Right " + i, xOffset + BOARD_WIDTH - VERTICAL_SPACE_WIDTH + 10, yOffset + CORNER_SIZE + (i - 1) * adjustedVerticalSpaceHeight + 25);
        }

        // Draw corner labels
        g.drawString("Free", xOffset + 20, yOffset + 50);
        g.drawString("Parking", xOffset + 20, yOffset + 65);
        g.drawString("Go to Jail", xOffset + BOARD_WIDTH - CORNER_SIZE + 10, yOffset + 50);
        g.drawString("Jail", xOffset + 10, yOffset + adjustedBoardHeight - CORNER_SIZE + 50);
        g.drawString("Go", xOffset + BOARD_WIDTH - CORNER_SIZE + 10, yOffset + adjustedBoardHeight - CORNER_SIZE + 50);
    }
    


    public static void main(String[] args) {
        // Set up the JFrame
        JFrame frame = new JFrame("Monopoly Board");
        MonopolyBoardVisual board = new MonopolyBoardVisual();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(board);
        frame.setSize(800, 800); // Window size, larger than the board
        frame.setVisible(true);
    }
}
