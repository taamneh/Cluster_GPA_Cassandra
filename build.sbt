name := "FirstAkka"

version := "1.0"

scalaVersion := "2.10.3"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "krasserm at bintray" at "http://dl.bintray.com/krasserm/maven"

libraryDependencies ++= {
    val akka_ver = "2.3.4"
    val spray_ver = "1.3.1"
    Seq("com.typesafe.akka" %% "akka-actor" % akka_ver,
      "com.typesafe.akka" %% "akka-persistence-experimental" % "2.3.4",
      "com.github.krasserm" %% "akka-persistence-cassandra" % "0.3.2",
      "com.typesafe.akka" %% "akka-testkit" % akka_ver % "test",
      "com.typesafe.akka" %% "akka-testkit" % akka_ver,
      "com.typesafe.akka" %% "akka-slf4j" % akka_ver,
      "org.scalatest" % "scalatest_2.10" % "2.0" % "test",
      "org.specs2" %% "specs2" % "2.2.3" % "test",
      "com.typesafe" %% "scalalogging-slf4j" % "1.0.1",
      "org.slf4j" % "slf4j-api" % "1.7.1",
      "org.slf4j" % "log4j-over-slf4j" % "1.7.1",
      "ch.qos.logback" % "logback-classic" % "1.0.13",
      "ch.qos.logback.contrib" % "logback-json-classic" % "0.1.2",
      "com.typesafe.akka" %% "akka-cluster" % akka_ver,
      "com.typesafe.akka" %% "akka-contrib" % akka_ver,
      "com.typesafe.akka" %% "akka-multi-node-testkit" % "2.3.2",
      "org.scalatest" %% "scalatest" % "2.0" % "test",
      "org.fusesource" % "sigar" % "1.6.4"
    )
  }