import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class departmentBillingDemo extends Application {


    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("departmentBilling.fxml"));
        primaryStage.setTitle("Department Billing");
        primaryStage.setScene(new Scene(root, 600, 514));
        primaryStage.show();

    }

}
© 2019 GitHub, Inc.
