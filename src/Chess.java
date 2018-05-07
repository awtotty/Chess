// Controller

import java.awt.Point;
import java.util.List;
import java.util.ArrayList;

public class Chess {
    private ChessGame game;
    private Player player1, player2;

    public Chess(ChessGame game) {
        this.game = new ChessGame();
        player1 = new HumanPlayer();
        player2 = new HumanPlayer();
    }


    public void makeMove(Point loc, Point moveTo) {
        if (getCell(loc) == null)
            throw new IllegalArgumentException("No piece in this location");
        if (getMoves(loc).contains(moveTo)) {
            game.removePiece(moveTo); // remove an opponent piece if it is in moveTo
            game.updatePiece(loc, moveTo);
        }
    }

    // Main logic of chess
    public List<Point> getMoves(Point loc) {
        Piece piece = getCell(loc);

        if (piece == null)  // no piece in this location
            return new ArrayList<>();

        int x = (int) loc.getX();
        int y = (int) loc.getY();
        List<Point> moves = new ArrayList<>();

        if (piece instanceof King) {
            // calculate move set for king and add each move to moves, don't include blocked moves
            return moves;
        }
        if (piece instanceof Queen) {
            // calculate move set for queen and add each move to moves
            return moves;
        }
        if (piece instanceof Bishop) {
            // calculate move set for bishop and add each move to moves
            return moves;
        }
        if (piece instanceof Knight) {
            // calculate move set for knight and add each move to moves
            return moves;
        }
        if (piece instanceof Rook) {
            // calculate move set for rook and add each move to moves
            return moves;
        }
        else {
            // calculate move set for pawn and add each move to moves
            return moves;
        }
    }

    public Piece getCell(Point loc) {
        for (Piece piece : game.getPieces())
            if (piece.getLoc().equals(loc))
                return piece;
        return null;
    }
}
