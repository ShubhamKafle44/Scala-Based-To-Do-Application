import scala.io.StdIn.readLine

// OOP: Task Manager
class TaskManager(var tasks: List[String]) {

  def addTask(task: String): Unit = {
    tasks = task :: tasks
    println(s"Added: $task")
  }
    def removeTaskByIndex(index: Int): Unit = {
      if (tasks.isEmpty) {
        println("No tasks to remove!")
      } else if (index >= 0 && index < tasks.size) {
        val removed = tasks(index)
        tasks = tasks.take(index) ++ tasks.drop(index + 1)
        println(s"Removed: $removed")
      } else {
        println(s"Invalid task number! Please enter a valid task number.")
      }
    }
  def showTasks(): Unit = {
      println("\nYour Tasks:")
      if (tasks.isEmpty) println("No tasks yet!")
      else {
        tasks.zipWithIndex.foreach { case (task, idx) =>
          println(s"${idx + 1}. ${task}") // Show 1-based index
        }
      }
  }
}

// Main App
object Main {
  def main(args: Array[String]): Unit = {
    val manager = new TaskManager(List())
    var running = true

    println(" Welcome to Scala To-Do App!")

    while (running) {
      println("\nChoose: add / remove / show / exit")
      readLine().toLowerCase match {
        case "add" =>
          println("Enter task:")
          val task = readLine()
          manager.addTask(task)

        case "remove" =>
          manager.showTasks()
          println("Enter task number to remove:")
          val idx = readLine().toInt - 1
          manager.removeTaskByIndex(idx)

        case "show" =>
          manager.showTasks()

        case "exit" =>
          running = false
          println("Goodbye!")

        case _ =>
          println("Invalid choice")
      }
    }
  }
}
