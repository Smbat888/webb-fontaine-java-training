package Week5.Chess;

class Board {
    static Tile[][] tiles = new Tile[8][8];

    static {
        System.out.println("Board initialization");
        tiles[0][0] = new Tile(false, new Rook(Color.BLACK, 0, 2), 0, 0);
        tiles[0][1] = new Tile(false, new Knight(Color.BLACK, 0, 2), 0, 1);
        tiles[0][2] = new Tile(false, new Bishop(Color.BLACK, 0, 2), 0, 2);
        tiles[0][3] = new Tile(false, new Queen(Color.BLACK, 0, 3), 0, 3);
        tiles[0][4] = new Tile(false, new King(Color.BLACK, 0, 4), 0, 4);
        tiles[0][5] = new Tile(false, new Bishop(Color.BLACK, 0, 5), 0, 5);
        tiles[0][6] = new Tile(false, new Knight(Color.BLACK, 0, 6), 0, 6);
        tiles[0][7] = new Tile(false, new Rook(Color.BLACK, 0, 7), 0, 7);

        tiles[1][0] = new Tile(true, 1, 0);
        tiles[1][1] = new Tile(false, new Pawn(Color.BLACK, 1, 1), 1, 1);
        tiles[1][2] = new Tile(false, new Pawn(Color.BLACK, 1, 2),1, 2);
        tiles[1][3] = new Tile(false, new Pawn(Color.BLACK, 1, 3), 1, 3);
        tiles[1][4] = new Tile(false, new Pawn(Color.BLACK, 1, 4), 1, 4);
        tiles[1][5] = new Tile(false, new Pawn(Color.BLACK, 1, 5), 1, 5);
        tiles[1][6] = new Tile(false, new Pawn(Color.BLACK, 1, 6), 1, 6);
        tiles[1][7] = new Tile(false, new Pawn(Color.BLACK, 1, 7),1, 7);

        tiles[2][0] = new Tile(true, 2, 0);
        tiles[2][1] = new Tile(true, 2, 1);
        tiles[2][2] = new Tile(true, 2, 2);
        tiles[2][3] = new Tile(false,new Pawn(Color.WHITE, 2, 3), 2, 3);
        tiles[2][4] = new Tile(true, 2, 4);
        tiles[2][5] = new Tile(true, 2, 5);
        tiles[2][6] = new Tile(true, 2, 6);
        tiles[2][7] = new Tile(true, 2, 7);

        tiles[3][0] = new Tile(true, 3, 0);
        tiles[3][1] = new Tile(true, 3, 1);
        tiles[3][2] = new Tile(true, 3, 2);
        tiles[3][3] = new Tile(true, 3, 3);
        tiles[3][4] = new Tile(true, 3, 4);
        tiles[3][5] = new Tile(true, 3, 5);
        tiles[3][6] = new Tile(true, 3, 6);
        tiles[3][7] = new Tile(true, 3, 7);

        tiles[4][0] = new Tile(true, 4, 0);
        tiles[4][1] = new Tile(true, 4, 1);
        tiles[4][2] = new Tile(true, 4, 2);
        tiles[4][3] = new Tile(true, 4, 3);
        tiles[4][4] = new Tile(true, 4, 4);
        tiles[4][5] = new Tile(true, 4, 5);
        tiles[4][6] = new Tile(true, 4, 6);
        tiles[4][7] = new Tile(true, 4, 7);

        tiles[5][0] = new Tile(true, 5, 0);
        tiles[5][1] = new Tile(true, 5, 1);
        tiles[5][2] = new Tile(true, 5, 2);
        tiles[5][3] = new Tile(true, 5, 3);
        tiles[5][4] = new Tile(true, 5, 4);
        tiles[5][5] = new Tile(true, 5, 5);
        tiles[5][6] = new Tile(true, 5, 6);
        tiles[5][7] = new Tile(true, 5, 7);

        tiles[6][0] = new Tile(false, new Pawn(Color.WHITE, 6, 0),6, 0);
        tiles[6][1] = new Tile(false, new Pawn(Color.WHITE, 6, 1),6, 1);
        tiles[6][2] = new Tile(true, 6, 2);
        tiles[6][3] = new Tile(false, new Pawn(Color.WHITE, 6, 3),6, 3);
        tiles[6][4] = new Tile(false, new Pawn(Color.WHITE, 6, 4),6, 4);
        tiles[6][5] = new Tile(false, new Pawn(Color.WHITE, 6, 5),6, 5);
        tiles[6][6] = new Tile(false, new Pawn(Color.WHITE, 6, 6),6, 6);
        tiles[6][7] = new Tile(false, new Pawn(Color.WHITE, 6, 7),6, 7);

        tiles[7][0] = new Tile(false, new Rook(Color.WHITE, 7, 0), 7, 0);
        tiles[7][1] = new Tile(false, new Knight(Color.WHITE, 7, 1), 7, 1);
        tiles[7][2] = new Tile(false, new Bishop(Color.WHITE, 7, 2),7, 2);
        tiles[7][3] = new Tile(false, new Queen(Color.WHITE, 7, 3), 7, 3);
        tiles[7][4] = new Tile(false, new King(Color.WHITE, 7, 4), 7, 4);
        tiles[7][5] = new Tile(false, new Bishop(Color.WHITE, 7, 5), 7, 5);
        tiles[7][6] = new Tile(false, new Knight(Color.WHITE, 7, 6),7, 6);
        tiles[7][7] = new Tile(false, new Rook(Color.WHITE, 7, 7),7, 7);
    }

    static void printBoard() {
        String message;
        System.out.println("   A  B  C  D  E  F  G  H");
        int num = 8;
        for (int i = 0; i < Board.tiles.length; i++) {
            System.out.print((num--) + " ");
            for (int j = 0; j < Board.tiles[i].length; j++) {
                if (Board.tiles[i][j].empty) {
                    message = " ";
                } else {
                    message = Board.tiles[i][j].getPiece().print();
                }
                if ((i + j) % 2 == 0) {
                    System.out.print("\033[48;5;7m\033[38;5;15m" + " " + message + " " + "\033[0m");
                } else {
                    System.out.print("\033[38;5;15m\033[48;5;0m" + " " + message + " " + "\033[0m");
                }
            }
            System.out.println();
        }
    }
}
