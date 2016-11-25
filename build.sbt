giter8Settings

resolvers += Resolver.url("typesafe", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

G8Keys.g8TestBufferLog := false

organization := "io.shedin.template"

name := "shedin-rest-micro-service-play"

lazy val shedinLibMicroServicePlayTemplate = project.in(file("."))
