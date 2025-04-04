ThisBuild / scalaVersion := "3.3.5"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"

// scalafmt settings
ThisBuild / scalafmtOnCompile := true

lazy val root = (project in file("."))
  .settings(
    name := "guice-sample",
    libraryDependencies ++= Seq(
      "com.google.inject" % "guice" % "5.1.0",
      "org.scalatest" %% "scalatest" % "3.2.17" % Test
    )
  )

enablePlugins(ScalafmtPlugin)
