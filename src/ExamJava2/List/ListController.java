package ExamJava2.List;

import ExamJava2.Main;
import ExamJava2.entities.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


public class ListController implements Initializable {
    public TableView<Student> tdlist;
    public TableColumn<Student, String> txtID;
    public TableColumn<Student, String> txtName;
    public TableColumn<Student, String> txtAddress;
    public TableColumn<Student, Integer> txtPhone;
    public static ObservableList<Student> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtID.setCellValueFactory(new PropertyValueFactory<Student, String>("id"));
        txtName.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        txtAddress.setCellValueFactory(new PropertyValueFactory<Student, String>("address"));
        txtPhone.setCellValueFactory(new PropertyValueFactory<Student, Integer>("phone"));
    }

    public void back(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../Add/add.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);
        ExamJava2.Main.rootStage.setTitle("List Student");
        Main.rootStage.setScene(listScene);
    }
}
