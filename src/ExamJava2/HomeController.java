package ExamJava2;

import ExamJava2.Add.AddController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.FileWriter;

public class HomeController {

    public void save(ActionEvent actionEvent) {
        try {
            FileWriter f = new FileWriter("student.txt");
            f.write(AddController.listStudent.toString());
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
    public void ontoList(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("./list/liststudent.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);
        Main.rootStage.setTitle("List Student");
        Main.rootStage.setScene(listScene);
    }

    public void ontoAdd(ActionEvent actionEvent) throws  Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("./Add/add.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);
        Main.rootStage.setTitle("Add Student");
        Main.rootStage.setScene(listScene);
    }
}