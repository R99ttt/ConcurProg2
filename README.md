# Concurrency in Java: GamePlay and HeavyWorker

This Java repository, collaboratively developed by Yarin Ackerman and Rami Abu Rabia, presents two distinct implementations showcasing concurrent programming concepts.

## Table of Contents
- [GamePlay (assig3_1)](#gameplay-assig3_1)
  - [Overview](#overview)
  - [Classes](#classes)
  - [Usage](#usage)
  - [License](#license)
  - [Authors](#authors)
  
- [HeavyWorker (assig3_2)](#heavyworker-assig3_2)
  - [Overview](#overview-1)
  - [Classes](#classes-1)
  - [Usage](#usage-1)
  - [License](#license-1)
  - [Authors](#authors-1)

## GamePlay (assig3_1)
### Overview
The `GamePlay` class represents a simplified game scenario where players (Gamer) flip a coin in parallel rounds, and a Judge oversees the game. The players attempt to flip the coin whenever it's available, and the Judge controls the availability of the coin in different rounds.

### Classes
- `GamePlay`: Manages the availability of the coin and the progression of rounds.
- `Gamer`: Represents a player who attempts to flip the coin in parallel.
- `Judge`: Controls the availability of the coin, simulating rounds.

### Usage
Run the `Main` class to start the game simulation with multiple players and a Judge. The game progresses for a fixed number of rounds (10 in this example), and the winner or a tie is determined based on the players' scores.

### License
This code is released under the MIT License. Refer to the [LICENSE](assig3_1/LICENSE) file for details.

### Authors
- Yarin Ackerman
- Rami Abu Rabia

## HeavyWorker (assig3_2)
### Overview
The `HeavyWorker` class demonstrates the use of semaphores to coordinate the execution of threads in two different sections. It includes a `MySemaphore` class that provides simple semaphore functionality.

### Classes
- `HeavyWorker`: Represents a worker with two sections of work (`section1` and `section2`) and coordination using semaphores.
- `MySemaphore`: A simple semaphore implementation.

### Usage
Run the `Main` class to create multiple threads that simulate workers concurrently executing the `workA` and `workB` methods, coordinating through semaphores.

### License
This code is released under the MIT License. Refer to the [LICENSE](assig3_2/LICENSE) file for details.

### Authors
- Yarin Ackerman
- Rami Abu Rabia
