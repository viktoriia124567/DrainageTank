import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;


import java.io.InputStream;


public class Main extends Application{


    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        InputStream iconStream = getClass().getResourceAsStream("\\icons\\icon.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

        /*
        FXMLLoader отвечает за загрузку интерфейсов, описанных в fxml и
        преобразовывает в объекты JavaFX
        getClass() - методы вызывается на экземпляре текущего класса, того,
        где находится данный код
         */
        FXMLLoader loader = new FXMLLoader(getClass().getResource("\\maket\\Test3.fxml"));
        // Загрузка корневого элемента из FXML
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Тестовое задание");
        primaryStage.show();
    }
}