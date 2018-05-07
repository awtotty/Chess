// Models of each chess piece

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public interface Piece {
//    List<Point> getMoves();
    String getColor();
    Point getLoc();
    void setLoc(Point loc);
}


// Pieces
class King implements Piece {
    private String color;
    private Point loc;

    public King(String color, Point loc) {
        this.color = color;
        this.loc = loc;
    }
//    public List<Point> getMoves() {
//        return new ArrayList<>();
//    }
    public String getColor() { return color; }
    public Point getLoc() { return loc; }
    public void setLoc(Point loc) { this.loc = loc; }
}

class Queen implements Piece {
    private String color;
    private Point loc;

    public Queen(String color, Point loc) {
        this.color = color;
        this.loc = loc;
    }
//    public List<Point> getMoves() {
//        return new ArrayList<>();
//    }
    public String getColor() { return color; }
    public Point getLoc() { return loc; }
    public void setLoc(Point loc) { this.loc = loc; }
}

class Bishop implements Piece {
    private String color;
    private Point loc;

    public Bishop(String color, Point loc) {
        this.color = color;
        this.loc = loc;
    }
//    public List<Point> getMoves() {
//        return new ArrayList<>();
//    }
    public String getColor() { return color; }
    public Point getLoc() { return loc; }
    public void setLoc(Point loc) { this.loc = loc; }
}

class Knight implements Piece {
    private String color;
    private Point loc;

    public Knight(String color, Point loc) {
        this.color = color;
        this.loc = loc;
    }
//    public List<Point> getMoves() {
//        return new ArrayList<>();
//    }
    public String getColor() { return color; }
    public Point getLoc() { return loc; }
    public void setLoc(Point loc) { this.loc = loc; }
}

class Rook implements Piece {
    private String color;
    private Point loc;

    public Rook(String color, Point loc) {
        this.color = color;
        this.loc = loc;
    }
//    public List<Point> getMoves() {
//        return new ArrayList<>();
//    }
    public String getColor() { return color; }
    public Point getLoc() { return loc; }
    public void setLoc(Point loc) { this.loc = loc; }
}

class Pawn implements Piece {
    private String color;
    private Point loc;

    public Pawn(String color, Point loc) {
        this.color = color;
        this.loc = loc;
    }
//    public List<Point> getMoves() {
//        return new ArrayList<>();
//    }
    public String getColor() { return color; }
    public Point getLoc() { return loc; }
    public void setLoc(Point loc) { this.loc = loc; }
}

