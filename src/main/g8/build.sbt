import sbt._

name := "$org$-service-crud-$domain;format="lower"$"

version := "0.1.0"

scalaVersion := "2.12.2"

normalizedName := "$org$-service-crud-$domain;format="lower"$"

lazy val $domain;format="lower"$CrudService = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "io.shedin.library" % "shedin-crud-lib_2.12" % "0.2.1",
  "io.shedin.library" % "shedin-crud-mongo_2.12" % "0.2.1",
  "io.shedin.library" % "shedin-crud-play_2.12" % "0.2.1",
  "org.reactivemongo" % "reactivemongo_2.12" % "0.12.2",
  "org.scalatestplus.play" % "scalatestplus-play_2.12" % "3.0.0-M3" % Test
)

ivyScala := ivyScala.value map {
  _.copy(overrideScalaVersion = true)
}

packageOptions in(Compile, packageBin) += {
  import java.util.jar.{Attributes, Manifest}
  val manifest = new Manifest
  manifest.getMainAttributes.put(Attributes.Name.SPECIFICATION_VENDOR, "$org$")
  manifest.getMainAttributes.put(Attributes.Name.IMPLEMENTATION_VENDOR, "$org$")
  manifest.getMainAttributes.put(Attributes.Name.IMPLEMENTATION_VENDOR_ID, "$org$")
  Package.JarManifest(manifest)
}
