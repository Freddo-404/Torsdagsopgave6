package Task3;

import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String>canTeach = new ArrayList<>();
    ArrayList<String>currentCourses = new ArrayList<>();
    public Teacher(String name, ArrayList<String>canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if (this.canTeach.contains(course)) {
            currentCourses.add(course);
            System.out.println(name+" Kan studere dette kursus");
            return true;


        } else {
            System.out.println(name+" kan ikke studere dette kursus");
            return false;
        }
    }
}

