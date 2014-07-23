name := "scala-basics-3"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.12" % "test"
)

transitiveClassifiers in Global := Seq(Artifact.SourceClassifier)
