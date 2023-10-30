package employee;

public class MeetingRoom {


    public MeetingRoom () {

    }


    public void attendTraining(String[] nume1) {
        for(String nume : nume1) {
            AttendTraining a = () -> System.out.println("Participa la instruire" + " " + nume);
            a.attendTraining();
        }

    }
}
