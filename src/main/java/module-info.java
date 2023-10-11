module com.example.binarytrees {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.binarytrees to javafx.fxml;
    exports com.example.binarytrees;
}