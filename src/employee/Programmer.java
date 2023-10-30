package employee;

public class Programmer extends Employee implements AttendTraining{

    public Programmer(String name, int age) {

        super(name, age);
    }

    @Override
    public void attendTraining() {
        System.out.println("Programatorul participă la instruire");
    }
}
