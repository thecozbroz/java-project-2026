import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/** SCREEN 3 (GUI). Weighted grade for one class + editing the category weights. */
public class GpaScreen extends JFrame {
    private final AssignmentList list;
    private final JFrame menu;
    private JTable weightTable;
    private DefaultTableModel weightModel;
    private JLabel gradeLabel, totalWeightLabel;
    private JButton changeWeightButton, recalcButton, backButton;

    public GpaScreen(AssignmentList list, JFrame menu) {
        super("GPA Calculator");
        this.list = list;
        this.menu = menu;
        buildUI();
        refresh();
    }

    private void buildUI() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        // TODO: weight table (Type | Weight %), gradeLabel, totalWeightLabel, buttons, listeners
    }

    /** Re-read weights and recompute the grade from list.calcGPA(). */
    private void refresh() { /* TODO */ }

    private void onChangeWeight() { /* TODO: pick type + new value; if list.changeWeight(...) is false,
                                      show "total exceeds 100" and let the user adjust other weights */ }
    private void onBack()         { /* TODO: dispose(); menu.setVisible(true); */ }
}
