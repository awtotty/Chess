// Model of a chess game

import java.util.List;
import java.util.ArrayList;
import java.awt.Point;

public class ChessGame {
    private final String BLACK = "black";
    private final String WHITE = "white";
    private List<Piece> pieces;


    /**
     * Creates a new game of chess.
     */
    public ChessGame() {
        pieces = new ArrayList<>();

        // Add black pieces
        pieces.add(new King(BLACK, new Point(3,0)));
        pieces.add(new Queen(BLACK, new Point(4,0)));
        pieces.add(new Bishop(BLACK, new Point(2,0)));
        pieces.add(new Bishop(BLACK, new Point(5,0)));
        pieces.add(new Knight(BLACK, new Point(1,0)));
        pieces.add(new Knight(BLACK, new Point(6,0)));
        pieces.add(new Rook(BLACK, new Point(0,0)));
        pieces.add(new Rook(BLACK, new Point(7,0)));
        // Pawns
        for (int i=0; i<8; i++)
            pieces.add(new Pawn(BLACK, new Point(i, 1)));

        // Add white pieces
        pieces.add(new King(WHITE, new Point(3,7)));
        pieces.add(new Queen(WHITE, new Point(4,7)));
        pieces.add(new Bishop(WHITE, new Point(2,7)));
        pieces.add(new Bishop(WHITE, new Point(5,7)));
        pieces.add(new Knight(WHITE, new Point(1,7)));
        pieces.add(new Knight(WHITE, new Point(6,7)));
        pieces.add(new Rook(WHITE, new Point(0,7)));
        pieces.add(new Rook(WHITE, new Point(7,7)));
        // Pawns
        for (int i=0; i<8; i++)
            pieces.add(new Pawn(WHITE, new Point(i, 6)));
    }


    public List<Piece> getPieces() {
        return pieces;
    }


    public List<Piece> getBlackPieces() {
        ArrayList<Piece> blackPieces = new ArrayList<>();

        for (Piece piece : pieces)
            if (piece.getColor().equals(BLACK))
                blackPieces.add(piece);

        return blackPieces;
    }


    public List<Piece> getWhitePieces() {
        ArrayList<Piece> whitePieces = new ArrayList<>();

        for (Piece piece : pieces)
            if (piece.getColor().equals(WHITE))
                whitePieces.add(piece);

        return whitePieces;
    }


    public void updatePiece(Point start, Point end) {
        for (Piece piece : pieces)
            if (piece.getLoc().equals(start))
                piece.setLoc(end);
    }


    public void removePiece(Point loc) {
        for (Piece piece : pieces) {
            if (piece.getLoc().equals(loc))
                updatePiece(loc, new Point (-1,-1));
        }
    }
}
