import play.PlayJava
import AssemblyKeys._

javaOptions ++= Seq("-Xmx128M", "-Xmx256M", "-XX:MaxPermSize=128M")

javaOptions ++= Seq("-Xmx128M", "-Xmx256M", "-XX:MaxPermSize=128M")

assemblySettings

mainClass in assembly := Some("play.core.server.NettyServer")

fullClasspath in assembly += Attributed.blank(PlayKeys.playPackageAssets.value)

val appName         = "BaseEmprego"
val appVersion      = "1.0alfa"

lazy val BaseEmprego = (project in file(".")).enablePlugins(PlayJava)
val log4j =  "log4j" % "log4j" % "1.2.17"

scalaVersion := "2.11.2"

val eclipselinkVersion = "2.5.2"

val xStreamVersion = "1.2.2"

val JPAVersion = "4.3.6.Final"

val MysSQLVersion = "5.1.34"

libraryDependencies ++= Seq(
  javaCore,
  javaJdbc,
  log4j,
  javaWs,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "org.eclipse.persistence" % "eclipselink" % eclipselinkVersion,
  "junit" % "junit" % "4.11" % "test" exclude("org.hamcrest", "hamcrest-core"),
  "mysql" % "mysql-connector-java" % MysSQLVersion,
  "org.hibernate" % "hibernate-entitymanager" % JPAVersion
)




