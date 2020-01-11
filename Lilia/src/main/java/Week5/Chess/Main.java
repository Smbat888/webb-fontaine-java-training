package Week5.Chess;

public class Main {
    public static void main(String[] args) {
        Board.printBoard();
        try {
            Tile tile1 = Board.tiles[1][4];
            Tile tile2 = Board.tiles[2][3];
            if (tile1 != null && !tile1.isEmpty()) {
                tile1.getPiece().move(tile1, tile2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("Invalid tile");
        }finally {
            System.out.println("==========================");
            Board.printBoard();
        }
    }
}
