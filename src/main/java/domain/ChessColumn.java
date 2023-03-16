package domain;

public enum ChessColumn {
    A(1), B(2), C(3), D(4),
    E(5), F(6), G(7), H(8);

    public final static int MAX_SIZE = values().length;
    public final static int MIN_SIZE = 1;

    private final int column;

    ChessColumn(int column) {
        this.column = column;
    }

    public static ChessColumn find(int column) {
        ChessColumn[] chessColumns = values();
        for (var chessColumn : chessColumns) {
            if (chessColumn.column == column) {
                return chessColumn;
            }
        }
        throw new IllegalArgumentException("체스판을 벗어날 수 없습니다.");
    }

    public int minus(ChessColumn other) {
        return this.column - other.column;
    }

    public int getColumn() {
        return column;
    }
}
