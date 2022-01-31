package ru.gb;

import java.util.List;
import ru.gb.impl.Course;

public interface Student {
    String getName();
    List<Course> getAllCourses();
}
