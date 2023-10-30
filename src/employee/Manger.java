package employee;

public class Manger extends Employee implements AttendTraining, ConductInterview {

    public Manger (String name, int age) {
        super(name, age);
    }

    @Override
    public void attendTraining() {
        System.out.println("Managerul participă la instruire");
    }

    @Override
    public void conductInterview() {
        System.out.println("Managerul conduce interviu");
    }
}
