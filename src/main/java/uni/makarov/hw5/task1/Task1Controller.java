package uni.makarov.hw5.task1;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task1Controller {

    @FXML
    ChoiceBox choiceBox;

    @FXML
    private TextField txtSide1;
    @FXML
    private TextField txtSide2;
    @FXML
    private TextField txtSide3;

    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;

    @FXML
    private void calcAngleAction(){
        String figure = String.valueOf(choiceBox.getSelectionModel().getSelectedItem());
        double side1 = Double.parseDouble(txtSide1.getText());
        double side2 = Double.parseDouble(txtSide2.getText());
        double side3 = Double.parseDouble(txtSide3.getText());
        switch (figure) {
            case "Triangle":
                Triangle triangle = new Triangle(side1, side2, side3);
                label1.setText(triangle.calcAngle(side1, side2, side3) + ", "
                        +  triangle.calcAngle(side2, side3, side1) + ", "
                        +  triangle.calcAngle(side3, side1, side2));
                triangle = null;
                break;
            case "Regular Triangle":
                if (side1 == side2 && side3 == side1){
                    RegularTriangle regularTriangle = new RegularTriangle(side1);
                    label1.setText(regularTriangle.calcAngle(side1, side1, side1) + ", "
                                + regularTriangle.calcAngle(side1, side1, side1) + ", "
                                + regularTriangle.calcAngle(side1, side1, side1));
                    regularTriangle = null;
                } else label1.setText("NOT REGULAR TRIANGLE!");
                break;
        }
    }
    @FXML
    private void calcPerimeterAction(){
        String figure = String.valueOf(choiceBox.getSelectionModel().getSelectedItem());
        double side1 = Double.parseDouble(txtSide1.getText());
        double side2 = Double.parseDouble(txtSide2.getText());
        double side3 = Double.parseDouble(txtSide3.getText());

        switch (figure){
            case "Triangle":
                Triangle triangle = new Triangle(side1, side2, side3);
                label2.setText(String.valueOf(triangle.calcPerimeter()));
                triangle = null;
                break;
            case "Regular Triangle":
                if (side1 == side2 && side3 == side1){
                    RegularTriangle regularTriangle = new RegularTriangle(side1);
                    label2.setText(String.valueOf(regularTriangle.calcPerimeter()));
                    regularTriangle = null;
                } else label2.setText("NOT REGULAR TRIANGLE!");
                break;
        }
    }


    @FXML
    private void calcAreaAction() {
        String figure = String.valueOf(choiceBox.getSelectionModel().getSelectedItem());
        double side1 = Double.parseDouble(txtSide1.getText());
        double side2 = Double.parseDouble(txtSide2.getText());
        double side3 = Double.parseDouble(txtSide3.getText());

        switch (figure) {
            case "Triangle":
                label3.setText("NOT REGULAR TRIANGLE!");
                break;
            case "Regular Triangle":
                if (side1 == side2 && side3 == side1) {
                    RegularTriangle regularTriangle = new RegularTriangle(side1);
                    label3.setText(String.valueOf(regularTriangle.calcArea()));
                    regularTriangle = null;
                } else label3.setText("NOT REGULAR TRIANGLE!");
                break;
        }
    }
}