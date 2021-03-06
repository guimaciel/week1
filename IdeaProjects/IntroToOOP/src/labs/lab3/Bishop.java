package labs.lab3;

public class Bishop extends Piece{

    public Bishop(boolean isWhite) {
        super(3,isWhite);
    }

    public Bishop(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString() {
        return "Bishop{" +
                "value=" + this.getValue() +
                ", isWhite=" + this.isWhite() +
                "}";
    }
}
