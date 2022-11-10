import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeController {

    public void ontoList(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("ExamJava2/List/liststudent.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);
        Main.rootStage.setTitle("List Student");
        Main.rootStage.setScene(listScene);
    }

    public void ontoAdd(ActionEvent actionEvent) throws  Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("ExamJava2/Add/add.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);
        Main.rootStage.setTitle("Add Student");
        Main.rootStage.setScene(listScene);
    }
}