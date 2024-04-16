package Restaurant.View.Component.Manager;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JPanel;

/**
 *
 * @author Raven
 */
public class SimpleFormManager extends JPanel {

    public SimpleFormManager() {
        init();
    }

    private void init() {
        putClientProperty(FlatClientProperties.STYLE, ""
                + "border:5,5,5,5;"
                + "background:null");
    }

    public void formInitAndOpen() {

    }

    public void formOpen() {

    }

    public void formRefresh() {

    }

    public boolean formClose() {
        return true;
    }
}