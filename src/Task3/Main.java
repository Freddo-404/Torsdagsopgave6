package Task3;

import java.util.ArrayList;

public class Main {


    public static void main(String [] args){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();


        list1.add("Engelsk");
        list2.add("Engelsk");
        list3.add("Engelsk");

        list1.add("dansk");
        list2.add("dansk");
        list3.add("dansk");
        list4.add("java 1.0");

        Student s1 = new Student("Frederik1",list1);
        Student s2 = new Student("Frederik2",list3);
        Student s3 = new Student("Marcus",list4);
        Student s4 = new Student("Jonas",list2);

        Teacher t1 = new Teacher("Tess",list1);
        Teacher t2 = new Teacher("Signe",list2);
        Teacher t3 = new Teacher("gutav",list4);

        ArrayList<Person>persons=new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s1);
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);

for(Person s : persons) {
    s.addCourse("java 1.0");
}
}
}

