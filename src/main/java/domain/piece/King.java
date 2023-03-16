package domain.piece;

import domain.Square;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class King extends Piece {

    private static final List<DirectionVector> directions = List.of(DirectionVector.values());
    private static final int STEP_SIZE = 1;

    public King(TeamColor teamColor) {
        super(teamColor);
    }

    @Override
    public List<Square> findRoutes(Square src, Square dest) {
        Vectorr vector = dest.calculateVector(src);
        Optional<DirectionVector> direction = findDirection(vector);

        if (direction.isEmpty() || vector.getMaxLength() != STEP_SIZE) {
            return Collections.emptyList();
        }
        return List.of(dest);
    }

    private Optional<DirectionVector> findDirection(Vectorr vector) {
        return directions.stream()
            .filter(direction -> direction.isSameDirection(vector))
            .findAny();
    }
}
