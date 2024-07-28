package com.marsrover.command;

import com.marsrover.rover.Rover;

public class TurnRightCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.turnRight();
    }
}