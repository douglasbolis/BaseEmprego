import play.PlayJava



val appName         = "exemplo-java"
val appVersion      = "1.0alfa"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
val log4j =  "log4j" % "log4j" % "1.2.17"

scalaVersion := "2.11.2"

val eclipselinkVersion = "2.5.2"

val xStreamVersion = "1.2.2"

val JPAVersion = "4.3.6.Final"

libraryDependencies ++= Seq(
  javaCore,
  javaJdbc,
  log4j,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "org.eclipse.persistence" % "eclipselink" % eclipselinkVersion,
  "junit" % "junit" % "4.11" % "test" exclude("org.hamcrest", "hamcrest-core"),
  "org.hibernate" % "hibernate-entitymanager" % JPAVersion
)




