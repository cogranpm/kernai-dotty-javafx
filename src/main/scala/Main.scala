import com.googlecode.lanterna.{SGR, TerminalPosition, TextColor}
import com.googlecode.lanterna.terminal.{DefaultTerminalFactory, Terminal}
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.stage.Stage

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello world!")
    println(msg)
    Application.launch(classOf[HelloFX], args: _*)
    //val tf: DefaultTerminalFactory = new DefaultTerminalFactory()
    //val screen: Screen
  }

  def msg = "I was compiled by dotty :)"

}

class HelloFX extends Application {

  override def start(primaryStage: Stage): Unit = {
    val javaVersion = System.getProperty("java.version")
    val javafxVersion = System.getProperty("javafx.version")
    val l = new Label(s"hello javafx ${javafxVersion} , running on java ${javaVersion}")
    val scene = new Scene(new StackPane(l), 640, 480)
    primaryStage.setScene(scene)
    primaryStage.show()
  }


}
