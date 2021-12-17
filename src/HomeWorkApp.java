import ru.gb.Course;
import ru.gb.Participant;
import ru.gb.Team;
import ru.gb.let.Let;
import ru.gb.let.Pool;
import ru.gb.let.Run;

public class HomeWorkApp {

    public static void main(String[] args) {
        Participant[] participants = new Participant[4];
        participants[0] = new Participant("Ivan",30, 10);
        participants[1] = new Participant("John", 19, 4);
        participants[2] = new Participant("Julia", 31, 100);
        participants[3] = new Participant("Sergey", 32, 101);

        Team dreamTeam = new Team("Dream Team", participants);
        System.out.println(dreamTeam);

        Let[] lets = new Let[2];
        lets[0] = new Pool(10);
        lets[1] = new Run(10);
        Course course = new Course("Iron Man", lets);
        course.doIt(dreamTeam);
        dreamTeam.showResults();

    }

}



