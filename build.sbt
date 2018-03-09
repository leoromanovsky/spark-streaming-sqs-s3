name := "spark-structured-streaming-sqs-s3"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk" % Versions.aws,
  "org.apache.spark" %% "spark-core" % Versions.spark % "provided",
  "org.apache.spark" %% "spark-streaming" % Versions.spark % "provided",
  "org.apache.spark" %% "spark-sql" % Versions.spark % "provided"
)
