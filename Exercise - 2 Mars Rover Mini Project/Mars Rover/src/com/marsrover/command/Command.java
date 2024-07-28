package com.marsrover.command;

import com.marsrover.rover.Rover;

public interface Command {
    void execute(Rover rover);
}