import sbt._

name := "$org$-service-crud-$domain;format="lower"$"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

normalizedName := "$org$-service-crud-$domain;format="lower"$"

lazy val $domain;format="lower"$CrudService = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "io.shedin.library" % "shedin-crud-lib_2.11" % "0.1.0-SNAPSHOT",
  "io.shedin.library" % "shedin-crud-mongo_2.11" % "0.1.0-SNAPSHOT",
  "io.shedin.library" % "shedin-crud-play_2.11" % "0.1.0-SNAPSHOT",
  "org.reactivemongo" % "reactivemongo_2.11" % "0.12.0",
  "org.scalatestplus.play" % "scalatestplus-play_2.11" % "1.5.1" % Test
)

ivyScala := ivyScala.value map {
  _.copy(overrideScalaVersion = true)
}

packageOptions in(Compile, packageBin) += {
  import java.util.jar.{Attributes, Manifest}
  val manifest = new Manifest
  manifest.getMainAttributes.put(Attributes.Name.IMPLEMENTATION_VERSION, version)
  Package.JarManifest(manifest)
}
