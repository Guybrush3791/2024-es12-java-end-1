import java.util.ArrayList;
import java.util.List;

public class Studente {

    private String name;
    private String freshman;

    private List<Integer> grades;

    public Studente(String name, String freshman) {

        setName(name);
        setFreshman(freshman);

        grades = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getFreshman() {

        return freshman;
    }

    public void setFreshman(String freshman) {

        this.freshman = freshman;
    }

    public List<Integer> getGrades() {

        return grades;
    }

    public void addGrade(int grade) throws IllegalArgumentException {

        checkGrade(grade);

        getGrades().add(grade);
    }

    public void addGrades(List<Integer> grades) throws IllegalArgumentException {

        checkGrades(grades);

        getGrades().addAll(grades);
    }

    public int getAvgGrades() {

        int avg = 0;

        if (getGrades().isEmpty())
            return avg;

        for (int grade : getGrades())
            avg += grade;

        return avg / getGrades().size();
    }

    public void printDetails() {

        System.out.println(this);
    }

    @Override
    public String toString() {

        return "[" + getFreshman() + "] " + getName() + ":\n" + getGrades() + "\navg: " + getAvgGrades();
    }

    private void checkGrade(int grade) throws IllegalArgumentException {

        if (grade < 0 || grade > 30)
            throw new IllegalArgumentException("Grades must be between 0 and 30");
    }

    private void checkGrades(List<Integer> grades) throws IllegalArgumentException {

        for (int grade : grades)
            checkGrade(grade);
    }
}
