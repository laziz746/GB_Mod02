module com.khai.java2_lesson4_21072022 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.khai.java2_lesson4_21072022 to javafx.fxml;
    exports com.khai.java2_lesson4_21072022;
}