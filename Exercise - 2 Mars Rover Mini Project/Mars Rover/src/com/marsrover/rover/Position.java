package com.marsrover.rover;

public class Position {
    private int x;
    private int y;
    private Direction direction;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public enum Direction {
        N {
            @Override
            public Direction turnLeft() {
                return W;
            }

            @Override
            public Direction turnRight() {
                return E;
            }

            @Override
            public void move(Position position) {
                position.setY(position.getY() + 1);
            }
        },
        E {
            @Override
            public Direction turnLeft() {
                return N;
            }

            @Override
            public Direction turnRight() {
                return S;
            }

            @Override
            public void move(Position position) {
                position.setX(position.getX() + 1);
            }
        },
        S {
            @Override
            public Direction turnLeft() {
                return E;
            }

            @Override
            public Direction turnRight() {
                return W;
            }

            @Override
            public void move(Position position) {
                position.setY(position.getY() - 1);
            }
        },
        W {
            @Override
            public Direction turnLeft() {
                return S;
            }

            @Override
            public Direction turnRight() {
                return N;
            }

            @Override
            public void move(Position position) {
                position.setX(position.getX() - 1);
            }
        };

        public abstract Direction turnLeft();

        public abstract Direction turnRight();

        public abstract void move(Position position);
    }
}