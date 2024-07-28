package com.marsrover.rover;

import com.marsrover.grid.Grid;

public class Rover {
    private Position position;
    private Grid grid;

    public Rover(Position position, Grid grid) {
        this.position = position;
        this.grid = grid;
    }

    public void move() {
        Position newPosition = new Position(position.getX(), position.getY(), position.getDirection());
        position.getDirection().move(newPosition);
        if (grid.isWithinBounds(newPosition.getX(), newPosition.getY()) && !grid.isObstacle(newPosition.getX(), newPosition.getY())) {
            position = newPosition;
        }
    }

    public void turnLeft() {
        position.setDirection(position.getDirection().turnLeft());
    }

    public void turnRight() {
        position.setDirection(position.getDirection().turnRight());
    }

    public Position getPosition() {
        return position;
    }
}