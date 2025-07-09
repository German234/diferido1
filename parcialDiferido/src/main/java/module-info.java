module org.parcial.parcialdiferido {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.parcial.parcialdiferido to javafx.fxml;
    exports org.parcial.parcialdiferido;
}