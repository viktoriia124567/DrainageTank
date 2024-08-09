
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;


public class MainController {

    @FXML
    private Rectangle rectangle;
    @FXML
    private TextField xTextField, yTextField;
    @FXML
    private Label labelCoordinate;
    @FXML
    private Button buttonCoordinate;

    //переменные для сохранения начального положения перед перетаскиванием
    private double sceneX, sceneY;
    private double offsetX, offsetY;


    @FXML
    private void initialize() {
        movingARectangle();
    }

    public void movingARectangle() {
        rectangle.setOnMousePressed(mouseEvent -> {
//            /* определим положение курсора мыши во время
//            наступления события (нажатия кнопки мыши) */
            sceneX = mouseEvent.getX();
            sceneY = mouseEvent.getY();
        });
        rectangle.setOnMouseDragged(mouseEvent -> {
            // вычитаем из координат, в которых происходит событие, начальные
            offsetX = mouseEvent.getSceneX() - sceneX;
            offsetY = mouseEvent.getSceneY() - sceneY;
//          // устанавливаем значение смещения от положения до смещения
            rectangle.setLayoutX(offsetX);
            rectangle.setLayoutY(offsetY);
            // координата левого верхнего угла прямоугольника
//            double upperLeftCornerX = ((Rectangle) mouseEvent.getSource()).getX(); - для нескольник прям-ов
            changeCoordinatesOnLabel(rectangle.getLayoutX(), rectangle.getLayoutY());
        });
            if (xTextField != null || yTextField != null) {
                try {
                    buttonCoordinate.setOnAction(mouseEvent -> {
                        offsetX = Double.parseDouble(xTextField.getText());
                        offsetY = Double.parseDouble(yTextField.getText());
                        rectangle.setLayoutX(offsetX);
                        rectangle.setLayoutY(offsetY);

                        changeCoordinatesOnLabel(offsetX, offsetY);
                    });
                } catch (NumberFormatException e) {
                    
                }
            }
    }

    public void changeCoordinatesOnLabel(double upperLeftCornerX, double upperLeftCornerY) {
        labelCoordinate.setText("Координаты ("
                + String.format("%.1f", upperLeftCornerX)
                + "; " + String.format("%.1f", upperLeftCornerY) + ")");
    }
}
