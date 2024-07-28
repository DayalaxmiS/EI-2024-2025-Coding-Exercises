package com.marsrover.command;

import com.marsrover.rover.Rover;

public class TurnLeftCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}