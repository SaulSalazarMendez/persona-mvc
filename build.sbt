name := """persona-mvc"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.avaje" % "ebean" % "2.7.3",
  "javax.persistence" % "persistence-api" % "1.0.2"
)
