name := "scala-basics-3"

scalaVersion := "2.10.4"

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.3.2",
  "org.specs2" %% "specs2" % "2.3.12" % "test",
  "com.storm-enroute" %% "scalameter" % "0.6"
)

transitiveClassifiers in Global := Seq(Artifact.SourceClassifier)

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

parallelExecution in Test := false

incOptions := incOptions.value.withNameHashing(true)
