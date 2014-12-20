name := "products"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings


libraryDependencies += "net.sf.barcode4j" % "barcode4j-light" % "2.0"


