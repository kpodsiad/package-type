import sbtwelcome._


scalaVersion := "2.13.10"

def tasks: Vector[UsefulTask] = Vector(
  UsefulTask(
    "compile",
    "compile files"
  ),
  UsefulTask(
    "test",
    "run tests in project"
  ),
  UsefulTask(
    "clean; compile;",
    "clean compile"
  ).alias("cc")
)

usefulTasks := tasks
