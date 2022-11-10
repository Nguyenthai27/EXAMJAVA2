package ExamJava2.Add;


import ExamJava2.entities.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AddController  {
   public TextField txtName;
   public TextField txtPhone;
   public TextField txtAddress;
   public TextField txtID;
   public static ObservableList<Student> listStudent  = FXCollections.observableArrayList();
   public Text error;
   public void addStudent(ActionEvent actionEvent) {

      try{
         error.setVisible(false);
         if(txtID.getText().isEmpty()||txtName.getText().isEmpty()||txtAddress.getText().isEmpty()||txtPhone.getText().isEmpty()){
            throw new Exception("Vui lòng nhập đầy đủ thông tin sinh viên");
         }
         Student st = new Student(txtID.getText(),txtName.getText(),txtAddress.getText(),txtPhone.getText());
         listStudent.add(st);
         back(null);
      }catch (Exception e){
         error.setVisible(true);
         error.setText(e.getMessage());
      }
   }

   public void back(ActionEvent actionEvent) {
      Parent listPage = FXMLLoader.load(getClass().getResource("ExamJava2/List/liststudent.fxml"));
      Scene listScene = new Scene(listPage, 800, 600);
      Main.rootStage.setTitle("List Student");
      Main.rootStage.setScene(listScene);
   }
}
