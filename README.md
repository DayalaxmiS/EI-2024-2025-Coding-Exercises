# EXERCISE 1 - Design Patterns

## Behavioural Design Pattern 
1. **Command Pattern**: Allows users to input commands to control home automation appliances (light and fan).
2.  **State Pattern**: Enhances a vending machine to handle user interactions based on its current state.

## Creational Design Pattern 
1. **Builder Pattern**: Enables users to build a custom meal by choosing burger, drink, and fries.
2. **Prototype Pattern**: Provides a system for cloning shapes (circle and rectangle) based on user selection.

## Structural Design Pattern
1. **Decorator Pattern**: Enables dynamic addition of text formatting options (bold, italic, underline) by user input.
2. **Facade Pattern**: Simplifies user interactions to start or shut down a computer system.


# EXERCISE 2 - Mars Rover Programming Exercise

## Description
The Mars Rover Programming Exercise is a simulation designed to emulate the navigation of a Mars Rover across a grid-based terrain. The Rover can move forward, turn left, and turn right while avoiding obstacles and staying within grid boundaries. This project emphasizes the use of pure Object-Oriented Programming principles, design patterns, and avoids conditional constructs to achieve its objectives. The simulation also incorporates advanced design patterns such as Command Pattern and Composite Pattern to ensure flexibility and modularity in the implementation.

## Features
- Initialize Rover with a starting position and direction.
- Execute commands to move forward, turn left, and turn right.
- Detect and avoid obstacles in the grid.
- Optional status report generation for the Rover’s current position and direction.
- Use of Command Pattern to encapsulate commands.
- Use of Composite Pattern to handle grid and obstacles.
- Adherence to OOP principles such as encapsulation, inheritance, and polymorphism.

## Installation
To set up and run the Mars Rover simulation on your local machine, follow these steps:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/mars-rover-simulation.git
   cd mars-rover-simulation
   
2. **Build the Project**:
   Ensure you have JDK installed. Then, build the project using your preferred build tool (e.g., Maven, Gradle).
   For Gradle
   ```bash
   gradle build
      
3. **Run the Simulation**:
   ```bash
   java -cp target/mars-rover-simulation.jar com.marsrover.simulation.MarsRoverSimulation
   
## How to Use the Project
1. **Input Grid Size**: Enter the width and height of the grid.
2. **Input Obstacles**: Enter the number of obstacles and their coordinates.
3. **Input Starting Position**: Enter the starting position (x, y) and direction (N, S, E, W) for the Rover.
4. **Input Commands**: Enter a sequence of commands (M, L, R) for the Rover to execute.
5. **View Results**: The final position and direction of the Rover will be displayed after executing all commands.

## Example Usage

1. **Enter grid size**: `10 10`
2. **Enter number of obstacles**: `2`
3. **Enter obstacle coordinates**: `2 2` and `3 5`
4. **Enter starting position and direction**: `0 0 N`
5. **Enter commands**: `M M R M L M`
6. **Output**: Rover is at `(1, 3)` facing East





   



   
   
   
   

