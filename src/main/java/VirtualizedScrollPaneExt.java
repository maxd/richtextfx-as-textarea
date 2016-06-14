import javafx.css.PseudoClass;
import javafx.scene.Node;
import org.fxmisc.flowless.Virtualized;
import org.fxmisc.flowless.VirtualizedScrollPane;

public class VirtualizedScrollPaneExt<T extends Node & Virtualized> extends VirtualizedScrollPane<T> {
    private PseudoClass FOCUSED = PseudoClass.getPseudoClass("focused");

    public VirtualizedScrollPaneExt(T content) {
        super(content);

        content.focusedProperty().addListener((obs, oldVal, newVal) -> {
            pseudoClassStateChanged(FOCUSED, newVal);
        });
    }
}
