
public class Piece {
    private String piece;
    private String color;

    public Piece(String piece, String color) {
        this.color = color;
        this.piece = piece;
    }

    public String getPiece() {
        return piece;
    }

    public String getColor() {
        return color;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public void setColor(String color) {
        this.color = color;
    }
}