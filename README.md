# roadmap-sh-number-guessing-game
Simple number guessing game where the computer randomly selects a number and the user has to guess it. The user will be given a limited number of chances to guess the number. If the user guesses the number correctly, the game will end, and the user will win. Otherwise, the game will continue until the user runs out of chances.

## Features

- Random number generation between 1 and 100
- Three difficulty levels:
  - Easy (10 chances)
  - Medium (5 chances)
  - Hard (3 chances)
- Feedback after each incorrect guess
  - Indicates whether the secret number is greater or less than the guess
- Tracks the number of attempts taken to guess the number
- Supports multiple rounds of gameplay
- Simple and interactive CLI experience

## Project Structure

```text
number-guessing-game/
│
├── src/
│   ├── Main.java
│   ├── Game.java
│   └── Difficulty.java
│
├── README.md
│
└── .gitignore
```

## Getting Started

### Prerequisites

- Java 8 or higher

### Compile

```bash
javac src/*.java
```

### Run

```bash
java -cp src Main
```

## Example Gameplay

```text
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 2

You selected MEDIUM with 5 chances.

Enter your guess: 50
Incorrect! The number is less than 50.

Enter your guess: 25
Incorrect! The number is greater than 25.

Enter your guess: 30
Congratulations! You guessed the correct number in 3 attempts.
```

## Challenge

This project was built as part of the Number Guessing Game challenge from roadmap.sh:

https://roadmap.sh/projects/number-guessing-game