import java.util.ArrayList;
public class AssignmentList {
    private ArrayList<Assignment> assignments;
    private double classworkWeight;
    private double homeworkWeight;
    private double quizzesWeight;
    private double projectsWeight;
    private double testsWeight;
    private double midtermsWeight;
    private double finalWeight;
    private double finalProjectWeight;


    
    public AssignmentList() {
        this.assignments = new ArrayList<>();
    }

    public void addAssignment(Assignment assignment) {
        this.assignments.add(assignment);
    }
    
    public void removeAssignment(Assignment assignment) {
        this.assignments.remove(assignment);
    }
    public void updateAssignmentStatus(Assignment assignment) {

    }
    public void changeAssignmentVar(Assignment assignment) {
        
    }
    public void changeWeights() {

    }
    public double calculateGrade() {
        
    }
}
