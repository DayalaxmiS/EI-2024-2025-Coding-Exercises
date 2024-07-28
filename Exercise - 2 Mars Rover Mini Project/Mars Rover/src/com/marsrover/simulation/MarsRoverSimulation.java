package com.marsrover.simulation;

import com.marsrover.command.*;
import com.marsrover.grid.Grid;
import com.marsrover.rover.Position;
import com.marsrover.rover.Rover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for grid size
        System.out.print("Enter grid width: ");
        int width = scanner.nextInt();
        System.out.print("Enter grid height: ");
        int height = scanner.nextInt();
        Grid grid = new Grid(width, height);

        // Input for obstacles
        System.out.print("Enter number of obstacles: ");
        int numberOfObstacles = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character
        for (int i = 0; i < numberOfObstacles; i++) {
            System.out.print("Enter obstacle " + (i + 1) + " coordinates (X Y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            grid.addObstacle(x, y);
        }

        // Input for starting position and direction
        System.out.print("Enter starting position and direction (X Y D): ");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        String directionString = scanner.next().toUpperCase();
        Position.Direction direction = Position.Direction.valueOf(directionString);

        Position startPosition = new Position(startX, startY, direction);
        Rover rover = new Rover(startPosition, grid);

        // Map of commands
        Map<Character, Command> commandMap = new HashMap<>();
        commandMap.put('M', new MoveCommand());
        commandMap.put('L', new TurnLeftCommand());
        commandMap.put('R', new TurnRightCommand());

        // Input for commands
        System.out.print("Enter commands (M, L, R): ");
        scanner.nextLine(); // Consume the leftover newline character
        String commandString = scanner.nextLine().replaceAll("\\s+", ""); // Remove any spaces
        List<Command> commands = new ArrayList<>();
        for (char c : commandString.toCharArray()) {
            Command command = commandMap.get(c);
        }

        // Execute each command
        for (Command command : commands) {
            command.execute(rover);
        }

        // Output the final position and direction of the rover
        Position finalPosition = rover.getPosition();
        System.out.println("Rover is at (" + finalPosition.getX() + ", " + finalPosition.getY() + ") facing " + finalPosition.getDirection());
    }
}