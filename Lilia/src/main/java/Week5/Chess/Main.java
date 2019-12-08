package Week5.Chess;

public class Main {
    public static void main(String[] args) {
        String message="";
        for (int i = 0; i < Board.tiles.length; i++) {
            for (int j = 0; j < Board.tiles[i].length; j++) {
                if (Board.tiles[i][j].empty) {
                    message = "empty";
                }
                else if (Board.tiles[i][j].getPiece().getColor().equals(Color.BLACK)) {
                    message = "Black";
                }else {
                    message = "White";
                }
                if (Board.tiles[i][j].getPiece().equals("Something?"));
                }
            }
        }
    }
