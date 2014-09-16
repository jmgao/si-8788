import sbt._
import sbt.Keys._
import android.Keys._

object TestBuild extends Build {
  lazy val root =
    Project(
      id = "test",
      base = file("."),
      settings = Defaults.defaultSettings ++ android.Plugin.androidBuild ++
        Seq(
          resolvers += Resolver.mavenLocal,
          // scalaVersion := "2.11.3-SNAPSHOT",
          platformTarget in Android := "android-18",
          targetSdkVersion in Android := "21",
          minSdkVersion in Android := "18"
        )
    )
}
