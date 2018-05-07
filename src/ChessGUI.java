// View

import javax.swing.*;
import java.awt.*;

public class ChessGUI extends JPanel {

    public ChessGUI() {
        super(new BorderLayout());
        setPreferredSize(new Dimension(500,500));
    }

    public static void makeAndShowGUI() {
        ChessGame game = new ChessGame();
        Chess controller = new Chess(game);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel chess = new ChessGUI();

        // Add stuff to frame
        frame.add(chess);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> {
                    UIManager.put("swing.boldMetal", Boolean.FALSE);
                    makeAndShowGUI();
                }
        );
    }
}
