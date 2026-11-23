import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;


public class AssignmentList {
    private String courseName;
    private ArrayList<Assignment> assignments = new ArrayList<>();
    private Map<Assignment.Type, Double> weights = new EnumMap<>(Assignment.Type.class);

    public AssignmentList(String courseName) {
        // TODO: set courseName and default weights (must add up to 100)
    }

    public String getCourseName() { return null; /* TODO */ }

    // getters and setters
    public void add(Assignment a)             { /* TODO */ }
    public void remove(int index)             { /* TODO: bounds check */ }
    public Assignment get(int index)          { return null; /* TODO */ }
    public int size()                         { return 0;    /* TODO */ }

    /** To-Do view: NEW list holding only uncompleted assignments, in main-list order. */
    public ArrayList<Assignment> getTodoList() { return null; /* TODO */ }

    /** index = row in the TO-DO view; find the matching object in the main list and mark it done. */
    public void markCompleted(int todoIndex)  { /* TODO */ }

    /** Replace the assignment at a main-list index (the Edit dialog builds the new object). */
    public void update(int index, Assignment updated) { /* TODO */ }

    // weights
    public Map<Assignment.Type, Double> getWeights() { return weights; }
    public double getTotalWeight()                   { return 0; /* TODO: sum of weights */ }

    /** return false if new total exceeds 100 (limit for total weightage) */
    public boolean changeWeight(Assignment.Type type, double newWeight) { return false; /* TODO */ }

    /**
     Weighted class grade as a percent (0-100). Per type:
     sum scored / sum total, then multiply by weight, then add to running total
     skip assignments with no type
     only completed assignments
     */
    public double calcGPA() { return 0; /* TODO */ }

    /* percent of total grade that a certain type (e.g. homework or projects) has earned you */
    private double percentForType(Assignment.Type type) { return 0; /* TODO */ }
}
