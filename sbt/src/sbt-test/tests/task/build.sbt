val scalatest = "org.scalatest" %% "scalatest" % "3.0.5"
ThisBuild / scalaVersion := "2.12.8"
libraryDependencies += scalatest
Test / testOptions += Tests.Argument("-C", "custom.CustomReporter")
