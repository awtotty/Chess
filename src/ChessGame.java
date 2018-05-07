// Model of a chess game

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.awt.Point;

public class ChessGame {
    private final String BLACK = "black";
    private final String WHITE = "white";
    private HashMap<Point, Piece> pieces;


    /**
     * Creates a new game of chess.
     */
    public ChessGame() {
        pieces = new HashMap<>();

        // Add black pieces
        pieces.put(new Point(3,0), new Piece("king", BLACK));
        pieces.put(new Point(2,0), new Piece("queen", BLACK));
        pieces.put(new Point(2,0), new Piece("bishop", BLACK));
        pieces.put(new Point(5,0), new Piece("bishop", BLACK));
        pieces.put(new Point(1,0), new Piece("knight", BLACK));
        pieces.put(new Point(6,0), new Piece("knight", BLACK));
        pieces.put(new Point(0,0), new Piece("rook", BLACK));
        pieces.put(new Point(7,0), new Piece("rook", BLACK));

        // Pawns
        for (int i=0; i<8; i++)
            pieces.put(new Point(i, 1), new Piece("pawn", BLACK));

        // Add white pieces
        pieces.put(new Point(3,7), new Piece("king", WHITE));
        pieces.put(new Point(2,7), new Piece("queen", WHITE));
        pieces.put(new Point(2,7), new Piece("bishop", WHITE));
        pieces.put(new Point(5,7), new Piece("bishop", WHITE));
        pieces.put(new Point(1,7), new Piece("knight", WHITE));
        pieces.put(new Point(6,7), new Piece("knight", WHITE));
        pieces.put(new Point(0,7), new Piece("rook", WHITE));
        pieces.put(new Point(7,7), new Piece("rook", WHITE));

        // Pawns
        for (int i=0; i<8; i++)
            pieces.put(new Point(i, 7), new Piece("pawn", BLACK));
    }


    public HashMap<Point, Piece> getPieces() { return pieces; }


    public Piece getPiece(Point loc) {
        return pieces.get(loc);
    }

    public void updatePiece(Point start, Point end) {
        Piece piece = pieces.get(start);
        if (piece != null) {
            pieces.remove(start);
            pieces.put(end, piece);
        }
    }


    public void removePiece(Point loc) {
        updatePiece(loc, new Point(-1,-1));
    }
}
