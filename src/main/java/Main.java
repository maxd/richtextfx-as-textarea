import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.fxmisc.richtext.CodeArea;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        CodeArea codeArea = new CodeArea(longText());

        TextArea textArea = new TextArea(longText());

        VBox placeholder = new VBox();
        placeholder.getChildren().addAll(codeArea, textArea);
        placeholder.setSpacing(14);
        placeholder.setPadding(new Insets(14));

        Scene scene = new Scene(placeholder);
        scene.getStylesheets().add("Main.css");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String longText() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                stringBuilder.append("line-");
            }
            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }

}
