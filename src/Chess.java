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


    public void applyMove(Point loc, Point moveTo) {
        if (getCell(loc) == null)
            throw new IllegalArgumentException("No piece in this location");
        if (getMoves(loc).contains(moveTo)) {
            game.removePiece(moveTo); // remove an opponent piece if it is in moveTo
            game.updatePiece(loc, moveTo);
        }
    }

    // Main logic of chess
    public List<Point> getMoves(Point loc) {
        Piece piece = getCell(loc); // Piece object

        if (piece == null)  // no piece in this location
            return null;

        int x = (int) loc.getX();
        int y = (int) loc.getY();
        String p = piece.getPiece();
        String color = piece.getColor();
        List<Point> moves = new ArrayList<>();

        if (p.equals("king")) {
            // calculate move set for king and add each move to moves, don't include blocked moves
            return moves;
        }
        if (p.equals("queen")) {
            // calculate move set for queen and add each move to moves
            return moves;
        }
        if (p.equals("bishop")) {
            // calculate move set for bishop and add each move to moves
            return moves;
        }
        if (p.equals("knight")) {
            // calculate move set for knight and add each move to moves
            return moves;
        }
        if (p.equals("rook")) {
            // calculate move set for rook and add each move to moves
            return moves;
        }
        else {
            // calculate move set for pawn and add each move to moves
            return moves;
        }
    }

    public Piece getCell(Point loc) {
        return game.getPiece(loc);
    }
}
