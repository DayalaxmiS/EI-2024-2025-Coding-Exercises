package com.marsrover.grid;

import java.util.Objects;
import java.util.function.BiFunction;

public class Cell {
    private final int x;
    private final int y;
    private final BiFunction<Cell, Object, Boolean> equalityChecker;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.equalityChecker = createEqualityChecker();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private BiFunction<Cell, Object, Boolean> createEqualityChecker() {
        return (self, other) -> other instanceof Cell && self.x == ((Cell) other).x && self.y == ((Cell) other).y;
    }

    @Override
    public boolean equals(Object o) {
        return equalityChecker.apply(this, o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}