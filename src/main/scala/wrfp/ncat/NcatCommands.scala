package wrfp.ncat
import sbt.{AutoPlugin, Command, State}
import sbt.Keys.commands

object NcatCommands extends AutoPlugin {
  override lazy val projectSettings = Seq(commands += helloCommand)
  lazy val helloCommand =
    Command.command("hello") { (state: State) =>
      println("Hi!")
      state
    }
}
