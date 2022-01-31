import ru.gb.impl.Course;
import ru.gb.impl.Student;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWorkApp {

    public static void main(String[] args) {
        Course math = new Course("Math");
        Course english = new Course("English");
        Course logic = new Course("Logic");
        Course russian = new Course("Russian");

        Student ivan = new Student("Ivan", Arrays.asList(math, english));
        Student petr = new Student("Petr", Arrays.asList(english));
        Student sasha = new Student("Sasha", Arrays.asList(logic, english));
        Student katia = new Student("Katia", Arrays.asList(math, russian, english));

        List<Student> students = Arrays.asList(ivan, petr, sasha, katia);
        System.out.println(
            students.stream()
                .map(o -> o.getAllCourses())
               .flatMap(w -> w.stream())
                .map(w -> w.getName())
                .distinct()
                .collect(Collectors.toList()));

        System.out.println(
            students.stream()
                .sorted((o1, o2) -> o2.getAllCourses().size() - o1.getAllCourses().size())
                .limit(3)
                .collect(Collectors.toList()));

        System.out.println(
            students.stream()
                .filter(o -> o.getAllCourses().contains(math))
                .collect(Collectors.toList()));

    }

}



