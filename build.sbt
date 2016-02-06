lazy val root = (project in file("src/main/scala/com/chongdashu/scala/ecs/")).
settings(
  name := "Main",
  version := "0.1.0",
  scalaVersion := "2.11.7"
)

libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test->default"
