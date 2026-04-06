# Scala To-Do App 

**Demo Video:** https://youtu.be/6UzeUGvl6tY


A simple **command-line To-Do application** built in **Scala** to help you manage tasks using object-oriented programming concepts.

This app allows you to **add, remove, and view tasks** interactively.

## Features

- **Add Tasks:** Quickly add new tasks to your to-do list.
- **Remove Tasks:** Remove a specific task by entering its number.
- **Show Tasks:** Display all current tasks with 1-based numbering.
- **Interactive CLI:** Command-line interface for easy task management.

## Installation

1. Ensure **Scala** is installed on your system:

   ```bash
   scala -version
   ```

2. Clone or download this project.
3. Open a terminal in the project folder and compile the code:

   ```bash
   scalac Main.scala
   scala Main
   ```

## Usage

After running the app, you'll see:

```
Welcome to Scala To-Do App!
```

Available commands:

- `add` – Add a new task.
- `remove` – Remove a task by number.
- `show` – Display all tasks.
- `exit` – Quit the app.

### Example Session

```
Choose: add / remove / show / exit
add
Enter task:
Buy groceries
Added: Buy groceries

Choose: add / remove / show / exit
show
Your Tasks:
1. Buy groceries

Choose: add / remove / show / exit
remove
Enter task number to remove:
1
Removed: Buy groceries
```

## Code Structure

- `TaskManager` class – Handles tasks and operations (add, remove, show).
- `Main` object – Main loop and user interface.

## License

Open-source and free to use.

