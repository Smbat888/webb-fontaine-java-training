package Week5.Chess;

public class Board {
    protected static Tile[][] tiles = new Tile[8][8];

    static {
        System.out.println("Board initialization");
        tiles[0][0] = new Tile(false, new Pawns((Color.WHITE), 0, 0));
        tiles[0][1] = new Tile(false, new Rook((Color.WHITE), 0, 1));
        tiles[0][2] = new Tile(true);
        tiles[0][3] = new Tile(false, new Pawns((Color.BLACK), 0, 3));
        tiles[0][4] = new Tile(false, new Pawns((Color.WHITE), 0, 4));
        tiles[0][5] = new Tile(false, new Rook((Color.WHITE), 0, 5));
        tiles[0][6] = new Tile(true);
        tiles[0][7] = new Tile(true);

        tiles[1][0] = new Tile(false, new Pawns((Color.WHITE), 1, 0));
        tiles[1][1] = new Tile(false, new Rook((Color.WHITE), 1, 1));
        tiles[1][2] = new Tile(true);
        tiles[1][3] = new Tile(false, new Pawns((Color.BLACK), 1, 3));
        tiles[1][4] = new Tile(false, new Pawns((Color.WHITE), 1, 4));
        tiles[1][5] = new Tile(false, new Rook((Color.WHITE), 1, 5));
        tiles[1][6] = new Tile(true);
        tiles[1][7] = new Tile(true);

        tiles[2][0] = new Tile(false, new Pawns((Color.WHITE), 2, 0));
        tiles[2][1] = new Tile(false, new Rook((Color.WHITE), 2, 1));
        tiles[2][2] = new Tile(true);
        tiles[2][3] = new Tile(false, new Pawns((Color.BLACK), 2, 3));
        tiles[2][4] = new Tile(false, new Pawns((Color.WHITE), 2, 4));
        tiles[2][5] = new Tile(false, new Rook((Color.WHITE), 2, 5));
        tiles[2][6] = new Tile(true);
        tiles[2][7] = new Tile(true);

        tiles[3][0] = new Tile(false, new Pawns((Color.WHITE), 3, 0));
        tiles[3][1] = new Tile(false, new Rook((Color.WHITE), 3, 1));
        tiles[3][2] = new Tile(true);
        tiles[3][3] = new Tile(false, new Pawns((Color.BLACK), 3, 3));
        tiles[3][4] = new Tile(false, new Pawns((Color.WHITE), 3, 4));
        tiles[3][5] = new Tile(false, new Rook((Color.WHITE), 3, 5));
        tiles[3][6] = new Tile(true);
        tiles[3][7] = new Tile(true);

        tiles[4][0] = new Tile(false, new Pawns((Color.WHITE), 4, 0));
        tiles[4][1] = new Tile(false, new Rook((Color.WHITE), 4, 1));
        tiles[4][2] = new Tile(true);
        tiles[4][3] = new Tile(false, new Pawns((Color.BLACK), 4, 3));
        tiles[4][4] = new Tile(false, new Pawns((Color.WHITE), 4, 4));
        tiles[4][5] = new Tile(false, new Rook((Color.WHITE), 4, 5));
        tiles[4][6] = new Tile(true);
        tiles[4][7] = new Tile(true);

        tiles[5][0] = new Tile(false, new Pawns((Color.WHITE), 5, 0));
        tiles[5][1] = new Tile(false, new Rook((Color.WHITE), 5, 1));
        tiles[5][2] = new Tile(true);
        tiles[5][3] = new Tile(false, new Pawns((Color.BLACK), 5, 3));
        tiles[5][4] = new Tile(false, new Pawns((Color.WHITE), 5, 4));
        tiles[5][5] = new Tile(false, new Rook((Color.WHITE), 5, 5));
        tiles[5][6] = new Tile(true);
        tiles[5][7] = new Tile(true);

        tiles[6][0] = new Tile(false, new Pawns((Color.WHITE), 6, 0));
        tiles[6][1] = new Tile(false, new Rook((Color.WHITE), 6, 1));
        tiles[6][2] = new Tile(true);
        tiles[6][3] = new Tile(false, new Pawns((Color.BLACK), 6, 3));
        tiles[6][4] = new Tile(false, new Pawns((Color.WHITE), 6, 4));
        tiles[6][5] = new Tile(false, new Rook((Color.WHITE), 6, 5));
        tiles[6][6] = new Tile(true);
        tiles[6][7] = new Tile(true);

        tiles[7][0] = new Tile(false, new Pawns((Color.WHITE), 7, 0));
        tiles[7][1] = new Tile(false, new Rook((Color.WHITE), 7, 1));
        tiles[7][2] = new Tile(true);
        tiles[7][3] = new Tile(false, new Pawns((Color.BLACK), 7, 3));
        tiles[7][4] = new Tile(false, new Pawns((Color.WHITE), 7, 4));
        tiles[7][5] = new Tile(false, new Rook((Color.WHITE), 7, 5));
        tiles[7][6] = new Tile(true);
        tiles[7][7] = new Tile(true);

    }

}
