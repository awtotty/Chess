// View

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ChessGUI extends JPanel implements ActionListener {

    private static final int BOARD_SIZE = 500;
    private static final int IMG_WIDTH = 50;

    public ChessGUI() {
        super(new BorderLayout());
        setPreferredSize(new Dimension(BOARD_SIZE,BOARD_SIZE));
    }

    public static void makeAndShowGUI() {
        ChessGame game = new ChessGame();
        Chess controller = new Chess(game);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel chess = new ChessGUI();
        chess.add(new ChessBoard()); // draw tiles

        // TODO get img files for pieces
        // Pieces gui


        JLayeredPane lpane = new JLayeredPane();
        lpane.setBounds(0,0, BOARD_SIZE, BOARD_SIZE);
        lpane.setPreferredSize(new Dimension(BOARD_SIZE, BOARD_SIZE));
        lpane.add(chess, 0, 0);

        // for each piece in the game, draw the image of the piece in the location
        int imgSpacer = BOARD_SIZE/8 + BOARD_SIZE/16 - IMG_WIDTH/2; // up/left of each tile
        for (Point loc : game.getPieces().keySet()) {
            String piece = game.getPiece(loc).getPiece();

            if (piece != null) {
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(System.getProperty("user.dir/images/" + piece + ".jpg")));
                } catch (IOException e) {
                }
            }



        }

        // Add layered pane to frame
        frame.add(lpane, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Listen for mouse press in a location and stage responses
    }

    // GUI for a tile
    static class ChessBoard extends JComponent {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int tileSize = BOARD_SIZE/8;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((i+j) % 2 == 0)
                        g.setColor(new Color(100,50,20)); // brown
                    else
                        g.setColor(new Color(250,220,150)); // tan
                    g.fillRect(i*tileSize, j*tileSize, tileSize, tileSize);
                }
            }
        }
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


