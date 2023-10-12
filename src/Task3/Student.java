package Task3;

import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourse = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourse) {
        super(name);
        this.passedCourse = passedCourse;
    }

    @Override
    public boolean addCourse(String course) {
        if (this.passedCourse.contains(course)) {
            System.out.println(name+" har ikke bestået dette kursus");
            return false;

        } else {
            currentCourses.add(course);
            System.out.println(name+" har bestået dette kursus");
            return true;
        }
    }
    }
