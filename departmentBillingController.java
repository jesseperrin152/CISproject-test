import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class departmentBillingController implements Initializable {


    @FXML private Label subTotalLabel;
    @FXML private Label taxLabel;
    @FXML private Label totalLabel;

    @FXML private TableView<item> itemData;
    @FXML private TableColumn<item, String> itemsColumn;
    @FXML private TableColumn<item, String> itemCodeColumn;
    @FXML private TableColumn<item, String> quantityColumn;
    @FXML private TableColumn<item, String> discountColumn;
    @FXML private TableColumn<item, String> priceColumn;

    @FXML public ChoiceBox itemChoiceBox;
    @FXML public TextField itemCodeField;
    @FXML public TextField quantityField;
    @FXML public TextField discountField;
    @FXML public TextField priceField;
    @FXML public Label addConfirmLabel;

    public void editItemName(CellEditEvent editName){

        item itemSelected = itemData.getSelectionModel().getSelectedItem();
        itemSelected.setItem(editName.getNewValue().toString());

    }

    public void editItemCode(CellEditEvent editCode){

        item itemSelected = itemData.getSelectionModel().getSelectedItem();
        itemSelected.setItemCode((Integer) editCode.getNewValue());

    }

    public void editQuantity(CellEditEvent editQuantity1){

        item itemSelected = itemData.getSelectionModel().getSelectedItem();
        itemSelected.setQuantity((Integer) editQuantity1.getNewValue());

    }

    public void editDiscount(CellEditEvent editDiscount1){

        item itemSelected = itemData.getSelectionModel().getSelectedItem();
        itemSelected.setDiscount((Double) editDiscount1.getNewValue());

    }

    public void editPrice(CellEditEvent editPrice1){

        item itemSelected = itemData.getSelectionModel().getSelectedItem();
        itemSelected.setPrice((Double) editPrice1.getNewValue());

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        itemsColumn.setCellValueFactory(new PropertyValueFactory<item, String>("ItemName"));
        itemCodeColumn.setCellValueFactory(new PropertyValueFactory<item, String>("ItemCode"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<item, String>("Quantity"));
        discountColumn.setCellValueFactory(new PropertyValueFactory<item, String>("Discount"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<item, String>("Price"));


        itemData.setEditable(true);

    }

    public void RemoveButtonPushed() {
        ObservableList<item> selectedRows, allItems;
        allItems = itemData.getItems();

        selectedRows = itemData.getSelectionModel().getSelectedItems();

        for (item item1: selectedRows)
        {
            allItems.remove(item1);
        }
    }

    public void AddButtonPushed(){

        item newItem = new item(
                itemChoiceBox.getValue(),
                itemCodeField.getText(),
                quantityField.getText(),
                discountField.getText(),
                priceField.getText());




    }


    public void printButtonPushed(ActionEvent event) {
    }
}
