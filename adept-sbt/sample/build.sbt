import adept.sbt.AdeptKeys._

adeptSettings

name := "adept-sbt-test-project"

scalaVersion := "2.10.1"

adeptRepositories += "central" -> "git@github.com:freekh/adept-central.git"

adeptDependencies := Seq(
  "play" % "play_2.10" % "2.1.2" % "test"
)
