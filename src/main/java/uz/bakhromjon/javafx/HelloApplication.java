package uz.bakhromjon.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCharacterCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        stage.setScene(scene);
        Image logo = new Image(Objects.requireNonNull("https://example.com/javaicon.png"));
        stage.setTitle("JavaFX Demo application");
        stage.getIcons().add(logo);
        stage.setWidth(500);
        stage.setHeight(500);
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press q to exit fullscreen-mode");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}

