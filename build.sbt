name:="scala-quickstart"
organization:="lzp.sbt"
version:="0.1-SNAPSHOT"
scalaVersion:="2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "3.0.0" % "test"
)

scalaSource in Test := baseDirectory.value / "test"

