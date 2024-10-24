# Tic-Tac-Toe Java Game

## Overview
This is a simple Tic-Tac-Toe game implemented in Java using the `javax.swing` library for graphical user interface (GUI). It is a two-player game where one player plays as "X" and the other as "O". Players take turns clicking on the grid, and the game announces the winner when one player aligns three symbols either horizontally, vertically, or diagonally.

## Features
- **Graphical Interface**: A 3x3 grid representing the Tic-Tac-Toe board.
- **Two Players**: "X" and "O" take turns.
- **Win Detection**: Highlights the winning line and announces the winner.
- **Game Over Detection**: Stops the game when a win occurs.

## How to Play
1. Launch the game by running the Java program.
2. The first player is "X" and the second is "O".
3. Click on any tile in the 3x3 grid to place your mark.
4. The game will alternate between players after each turn.
5. When a player aligns three marks (horizontally, vertically, or diagonally), they win, and the winning line will be highlighted in blue.
6. The game stops once there is a winner.

## Game Design

- **JFrame**: The main window that holds the game.
- **JLabel**: Displays the title and the current player's turn or winning message.
- **JButton**: Each button in the 3x3 grid represents a tile on the Tic-Tac-Toe board.
- **GridLayout**: Organizes the buttons in a 3x3 grid layout.
- **Game Logic**: The game checks for a winner after each turn. If there is a winning line, the game declares the winner and highlights the line.

## Setup and Installation

1. Ensure you have Java Development Kit (JDK) installed.
2. Copy the provided code into a file named `TicTacToe.java`.
3. Compile the program:
   ```bash
   javac TicTacToe.java
   ```
4. Run the game:
   ```bash
   java TicTacToe
   ```

## Code Breakdown

- The game initializes a `JFrame` for the window and sets up the game board using a 3x3 grid of `JButtons`.
- Each button in the grid listens for click events using an `ActionListener`. When clicked, the button displays the current player's symbol ("X" or "O") and checks for a winner.
- The method `whoWon()` checks for three matching symbols in any row, column, or diagonal. If a winner is found, the winning buttons are highlighted.
- The current player's turn is displayed in the label at the top, and the game ends once a player wins.

## Future Improvements
- Add a reset button to allow replaying the game without restarting the application.
- Implement a draw condition when all tiles are filled without a winner.
- Add sound effects or animations to enhance the game experience.
