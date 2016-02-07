lazy val root = (project in file("./")).
settings(
  name := "Scala ECS",
  version := "0.1.0",
  scalaVersion := "2.11.7"
)

libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test->default"
