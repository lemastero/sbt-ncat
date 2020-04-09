lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbt-ncat",
    version := "0.0.1",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.1.1" % Test
    ),
    scalacOptions ++= Seq(
      "-encoding", "UTF-8"
    )
  )

wartremoverErrors ++= Warts.allBut(Wart.NonUnitStatements)
