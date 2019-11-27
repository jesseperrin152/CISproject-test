import javafx.beans.property.*;
import javafx.scene.control.TextField;


public class item {

    private SimpleStringProperty itemName;
    private int itemCode;
    private int quantity;
    private double discount;
    private double price;


    public item(String itemName, int itemCode, int qty, double discount, double price) {
        this.itemName = new SimpleStringProperty(itemName);
        this.itemCode = itemCode;
        this.quantity = qty;
        this.discount = discount;
        this.price = price;
    }

    public item(Object value, String text, String text1, String text2, String text3) {
    }


    public String getItem() {

        return itemName.get();
    }

    public void setItem(String itemName) {

        this.itemName = new SimpleStringProperty(itemName);
    }


    public int getItemCode() {

        return itemCode;
    }

    public void setItemCode(int itemCode) {

        this.itemCode = itemCode;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }


    public double getDiscount() {

        return discount;
    }

    public void setDiscount(double discount) {

        this.discount = discount;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }


}
