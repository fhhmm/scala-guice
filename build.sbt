ThisBuild / scalaVersion := "2.13.12"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"

lazy val root = (project in file("."))
  .settings(
    name := "guice-sample",
    libraryDependencies ++= Seq(
      "com.google.inject" % "guice" % "5.1.0",
      "org.scalatest" %% "scalatest" % "3.2.17" % Test
    )
  ) 