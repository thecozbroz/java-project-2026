import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * TodoScreen that runs WITHOUT any real AssignmentList logic.
 * While USE_DUMMY_DATA is true, the table is fed plain Object[] rows.
 * When A's methods are done: set it to false and fill in the "REAL" branches.
 */
public class TodoScreen extends JFrame {
    private static final boolean USE_DUMMY_DATA = true;   // <- the one switch

    private final AssignmentList list;
    private final JFrame menu;
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton addButton, editButton, removeButton, completeButton, backButton;

    public TodoScreen(AssignmentList list, JFrame menu) {
        super("To-Do List");
        this.list = list;
        this.menu = menu;
        buildUI();
        refreshTable();
    }

    private void buildUI() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(700, 450);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(8, 8));

        tableModel = new DefaultTableModel(new String[]{"Task", "Due", "Type", "Points"}, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        addButton      = new JButton("Add");
        editButton     = new JButton("Edit");
        removeButton   = new JButton("Remove");
        completeButton = new JButton("Mark Complete");
        backButton     = new JButton("Back");

        addButton.addActionListener(e -> onAdd());
        editButton.addActionListener(e -> onEdit());
        removeButton.addActionListener(e -> onRemove());
        completeButton.addActionListener(e -> onComplete());
        backButton.addActionListener(e -> onBack());

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        for (JButton b : new JButton[]{addButton, editButton, removeButton, completeButton, backButton}) {
            buttons.add(b);
        }
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);
    }

    /** Rebuild the table from the data source. Call after every change. */
    private void refreshTable() {
        tableModel.setRowCount(0);
        if (USE_DUMMY_DATA) {
            // Only reload dummy rows the first time (so Add/Remove on dummy data stick)
            if (tableModel.getRowCount() == 0 && !dummyLoaded) {
                tableModel.addRow(new Object[]{"Essay 1", "2026-12-01", "HOMEWORK", "0/20"});
                tableModel.addRow(new Object[]{"Quiz 3", "2026-12-03", "QUIZ", "0/10"});
                tableModel.addRow(new Object[]{"Final Project", "2026-12-10", "PROJECT", "0/100"});
                dummyLoaded = true;
            }
        } else {
            // REAL: rows come from the list's to-do view
            for (Assignment a : list.getTodoList()) {
                tableModel.addRow(new Object[]{
                    a.getTask(), a.getDueDate(), a.getType(),
                    a.getPointsScored() + "/" + a.getPointsTotal()});
            }
        }
    }
    private boolean dummyLoaded = false;

    private void onAdd() {
        String task = JOptionPane.showInputDialog(this, "Task name:");
        if (task == null || task.isBlank()) return;
        if (USE_DUMMY_DATA) {
            tableModel.addRow(new Object[]{task, "2026-12-31", "HOMEWORK", "0/10"});
        } else {
            // REAL: build a full form (date, points, type), then:
            // list.add(new Assignment(task, date, total, 0, type, false));
            // refreshTable();
        }
    }

    private void onEdit() {
        int row = table.getSelectedRow();
        if (row < 0) { JOptionPane.showMessageDialog(this, "Select a row first."); return; }
        // REAL: Assignment a = list.getTodoList().get(row); edit via a.setTask(...) etc.; refreshTable();
    }

    private void onRemove() {
        int row = table.getSelectedRow();
        if (row < 0) { JOptionPane.showMessageDialog(this, "Select a row first."); return; }
        if (USE_DUMMY_DATA) {
            tableModel.removeRow(row);
        } else {
            // REAL: see the index warning in the chat notes. Remove by OBJECT, not by row number.
            // list.remove(list.getTodoList().get(row)); refreshTable();
        }
    }

    private void onComplete() {
        int row = table.getSelectedRow();
        if (row < 0) { JOptionPane.showMessageDialog(this, "Select a row first."); return; }
        if (USE_DUMMY_DATA) {
            tableModel.removeRow(row);          // completed items leave the to-do view
        } else {
            // REAL: list.markCompleted(row); refreshTable();   (row == to-do index)
        }
    }

    private void onBack() {
        dispose();
        if (menu != null) menu.setVisible(true);
    }

    /** Launch this screen alone, no MenuScreen needed. */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new TodoScreen(new AssignmentList("Test Course"), null).setVisible(true));
    }
}