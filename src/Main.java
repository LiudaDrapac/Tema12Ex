import employee.*;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Manger("Maria", 26);
        System.out.println("Numele managerului: " + employee.getName());
        System.out.println("Virsta managerului: " + employee.getAge());

        System.out.println("                                  ");
        Employee employee1 = new Programmer("Dan", 40);
        System.out.println("Numele programatorului: " +employee1.getName());
        System.out.println("Virsta programatorului: " +employee1.getAge());

        System.out.println("                                 ");
        AttendTraining attendTraining = new Manger("Ion", 25);
        attendTraining.attendTraining();
        ConductInterview conductInterview = new Manger("Ion", 25);
        conductInterview.conductInterview();

        System.out.println("                                ");
        AttendTraining attendTraining1 = new Programmer("Dan", 40);
        attendTraining1.attendTraining();

        System.out.println("                                ");
        MeetingRoom meetingRoom = new MeetingRoom();
        meetingRoom.attendTraining(new String[] {"Maria", "Ion", "Daniel", "Vlad", "Mia"});

    }
}