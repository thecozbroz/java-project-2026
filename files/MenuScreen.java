import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class MenuScreen extends JFrame {
    private final Map<String, AssignmentList> courses = new LinkedHashMap<>();
    private JComboBox<String> courseBox;
    private JButton todoButton, gpaButton, addCourseButton;

    public MenuScreen() {
        super("Student Productivity App");
        loadSampleData();
        buildUI();
    }

    /** Hard-coded demo data so every screen has something to show. */
    private void loadSampleData() { /* TODO: 1-2 courses with a few assignments */ }

    private void buildUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        // TODO: layout, courseBox, three buttons, wire listeners to the methods below
    }

    private AssignmentList getSelectedCourse() { return null; /* TODO */ }

    private void openTodo()   { /* TODO: new TodoScreen(getSelectedCourse(), this); hide this */ }
    private void openGpa()    { /* TODO: new GpaScreen(getSelectedCourse(), this); hide this */ }
    private void addCourse()  { /* TODO: JOptionPane for name -> new AssignmentList -> refresh combo */ }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuScreen().setVisible(true));
    }
}
