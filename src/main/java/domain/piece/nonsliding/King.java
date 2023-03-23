package domain.piece.nonsliding;

import domain.piece.Direction;
import domain.piece.Directions;
import domain.piece.PieceInfo;
import domain.piece.TeamColor;

public class King extends NonSlidingPiece {

    private static final Directions DIRECTIONS = Directions.Every;

    public King(TeamColor teamColor) {
        super(teamColor);
    }

    @Override
    protected void validateDirection(Direction direction) {
        DIRECTIONS.validateContains(direction);
    }

    @Override
    public PieceInfo getPieceType() {
        return PieceInfo.KING;
    }
}
