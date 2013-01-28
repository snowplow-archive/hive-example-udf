name := "hive-example-udf"

version := "0.0.1"

organization := "com.snowplowanalytics"

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += "CDH4" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

libraryDependencies += "org.apache.hadoop" %  "hadoop-core"        % "0.20.2"      % "provided"

libraryDependencies += "org.apache.hive"   %  "hive-exec"          % "0.8.1"       % "provided"

libraryDependencies += "org.specs2"        %% "specs2"             % "1.12.1"      % "test"