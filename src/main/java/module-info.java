module com.example.w23comp1008lhw10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w23comp1008lhw10 to javafx.fxml;
    exports com.example.w23comp1008lhw10;
}