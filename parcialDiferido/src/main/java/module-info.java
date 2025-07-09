module org.parcial.parcialdiferido {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.parcial.parcialdiferido to javafx.fxml;
    exports org.parcial.parcialdiferido;
}